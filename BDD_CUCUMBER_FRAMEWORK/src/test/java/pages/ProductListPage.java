package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.DynamicXpathUtil;
import utilities.WaitHelper;

public class ProductListPage extends MasterPage {

	public ProductListPage(WebDriver driver) {
		super(driver);
	}

	// dynamic XPath

	private String productNameXpath = "//a[text()='$replaceable$']";
	private String priceInListXpath = "//a[text()='$replaceable$']/../following-sibling::div[@class='price-box']//span[@class='price' and not(contains(@id,'old-price'))]";
	private String addToCartXpath = "//h2/a[@title='$replaceable$']/../following-sibling::div[@class='actions']/button[@title='Add to Cart']";
	private String addToCompareXpath = "//a[@title='$replaceable$']/..//a[@class='link-compare']";

	@FindBy(xpath = "//div[@class='category-products']/div[@class='toolbar']//select[@title='Sort By']")
	private WebElement upperSortBy;

	@FindBy(xpath = "//div[@class='category-products']/div[@class='toolbar-bottom']//select[@title='Sort By']")
	private WebElement lowerSortBy;

	@FindBy(xpath = "//button[@title='Compare']")
	private WebElement compareBtn;

	// Action methods

	public void selectFromUpperSortBy(String option) {
		new Select(upperSortBy).selectByVisibleText(option);
	}

	public void selectFromLowerSortBy(String option) {
		new Select(lowerSortBy).selectByVisibleText(option);
	}

	public void clickOnProductNameLink(String productName) {
		DynamicXpathUtil.getWebElement(driver, productNameXpath, productName).click();
	}

	public String getPrice(String productName) {
		return DynamicXpathUtil.getWebElement(driver, priceInListXpath, productName).getText();
	}

	public void clickAddToCart(String mobileName) {
		DynamicXpathUtil.getWebElement(driver, addToCartXpath, mobileName).click();
	}

	public void clickAddToCompare(String mobileName) {
		WebElement product = DynamicXpathUtil.getWebElement(driver, addToCompareXpath, mobileName);
		WaitHelper.waitUntilElementIsClickable(driver, product, 30);
		product.click();
	}

	public void clickCompareBtn() {
		WaitHelper.waitUntilElementIsClickable(driver, compareBtn, 30);
		compareBtn.click();
	}
}
