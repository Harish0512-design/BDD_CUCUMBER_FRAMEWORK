package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserDashboardPage extends MasterPage {

	public UserDashboardPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//li[@class='success-msg']//span")
	private WebElement successMsg;

	public String getSucessMsg() {
		return successMsg.getText();
	}

}
