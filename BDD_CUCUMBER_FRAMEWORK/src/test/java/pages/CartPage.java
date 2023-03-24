package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.WaitHelper;

public class CartPage extends MasterPage {

	public CartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@title='Qty']")
	private WebElement quantity;

	@FindBy(xpath = "//li[@class='error-msg']//span")
	private WebElement errorMsg;

	@FindBy(xpath = "//li[@class='success-msg']//span")
	private WebElement successMsg;

	@FindBy(xpath = "//button[@type='submit' and @title='Update']")
	private WebElement updateBtn;

	@FindBy(xpath = "//button[@title='Empty Cart']")
	private WebElement emptyCartLink;

	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement emptyCartMsg;

	public void enterQuantity(String qty) {
		quantity.click();
		quantity.clear();
		quantity.sendKeys(qty);
	}

	public void clickUpdateBtn() {
		WaitHelper.waitUntilElementIsClickable(driver, updateBtn, 30);
		updateBtn.click();

	}

	public String getErrorMsg() {
		WaitHelper.waitUntilElementIsVisible(driver, errorMsg, 30);
		return errorMsg.getText();
	}

	public void clickEmptyCartLink() {
		emptyCartLink.click();
	}

	public String getShoppingCartEmptyMsg() {
		return emptyCartMsg.getText();
	}
}
