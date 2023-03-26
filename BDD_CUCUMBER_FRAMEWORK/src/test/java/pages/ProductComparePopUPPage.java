package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.DynamicXpathUtil;

public class ProductComparePopUPPage extends MasterPage {

	public ProductComparePopUPPage(WebDriver driver) {
		super(driver);
	}

	private String productsXpath = "//h2[@class='product-name']/a[@title='$replaceable$']";

	@FindBy(xpath = "//div[contains(@class,'page-title')]/h1")
	private WebElement headerText;

	@FindBy(xpath = "//button[@title='Close Window']")
	private WebElement closeWindowBtn;

	public boolean verifyProduct(String productName) {
		boolean flag = true;
		try {
			DynamicXpathUtil.getWebElement(driver, productsXpath, productName);
		} catch (NoSuchElementException ex) {
			flag = false;
		}
		return flag;
	}

	public String getHeaderText() {
		return headerText.getText();
	}
	
	public void clickOnCloseWindow() {
		closeWindowBtn.click();
	}

}
