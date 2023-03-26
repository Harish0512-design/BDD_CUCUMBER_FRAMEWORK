package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserWishListPage extends MasterPage {

	public UserWishListPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//button[@title='Share Wishlist']")
	private WebElement shareWishListBtn;

	@FindBy(xpath = "//li[@class='success-msg']//span")
	public WebElement successMsg;

	public void clickOnShareWishListBtn() {
		shareWishListBtn.click();
	}

	public String getSuccessMsg() {
		return successMsg.getText();
	}

}
