package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListSharingPage extends MasterPage {

	public WishListSharingPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@id='email_address']")
	private WebElement emailAddressesTextBox;

	@FindBy(xpath = "//*[@id='message']")
	private WebElement messageTextBox;
	
	@FindBy(css="button[title='Share Wishlist']")
	private WebElement shareWishList;

	public void setEmailAddresses(String emails) {
		emailAddressesTextBox.clear();
		emailAddressesTextBox.sendKeys(emails);
	}

	public void setMessage(String message) {
		messageTextBox.clear();
		messageTextBox.sendKeys(message);
	}
	
	public void clickShareWishList() {
		shareWishList.click();
	}
}
