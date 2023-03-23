package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.DynamicXpathUtil;

public class HomePage extends MasterPage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// dynamic XPath strings
	private String menuXpath = "//a[text()='$replaceable$']";
	private String accountOptionsXpath = "//div[@id='header-account']//ul//a[@title='$replaceable$']";

	// page factory locators
	@FindBy(id = "search")
	private WebElement searchBox;

	@FindBy(xpath = "//div[@class='account-cart-wrapper']/a")
	private WebElement account;

	@FindBy(xpath = "//div[@class='header-minicart']/a")
	private WebElement cart;

	// Action methods

	public void clickAccount() {
		account.click();
	}

	public void clickCartIcon() {
		cart.click();
	}

	public void clickMenuItem(String menuItem) {
		DynamicXpathUtil.getWebElementWithDynamicXpath(driver, menuXpath, menuItem).click();
	}

	public void selectFromAccount(String option) {
		DynamicXpathUtil.getWebElementWithDynamicXpath(driver, accountOptionsXpath, option).click();
	}

}
