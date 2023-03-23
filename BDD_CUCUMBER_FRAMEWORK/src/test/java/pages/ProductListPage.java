package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.DynamicXpathUtil;

public class ProductListPage extends MasterPage {

	public ProductListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// dynamic XPath

	private String productNameXpath = "//a[text()='$replaceable$']";
	private String priceInListXpath = "//a[text()='$replaceable$']/../following-sibling::div[@class='price-box']//span[@class='price' and not(contains(@id,'old-price'))]";

	@FindBy(xpath = "//div[@class='category-products']/div[@class='toolbar']//select[@title='Sort By']")
	private WebElement upperSortBy;

	@FindBy(xpath = "//div[@class='category-products']/div[@class='toolbar-bottom']//select[@title='Sort By']")
	private WebElement lowerSortBy;

	// Action methods

	public void selectFromUpperSortBy(String option) {
		new Select(upperSortBy).selectByVisibleText(option);
	}

	public void selectFromLowerSortBy(String option) {
		new Select(lowerSortBy).selectByVisibleText(option);
	}

	public void clickOnProductNameLink(String productName) {
		DynamicXpathUtil.getWebElementWithDynamicXpath(driver, productNameXpath, productName).click();
	}

	public String getPrice(String productName) {
		return DynamicXpathUtil.getWebElementWithDynamicXpath(driver, priceInListXpath, productName).getText();
	}
}
