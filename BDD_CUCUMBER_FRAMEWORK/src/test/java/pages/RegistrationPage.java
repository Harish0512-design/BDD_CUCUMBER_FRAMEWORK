package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends MasterPage {

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "firstname")
	private WebElement firstName;

	@FindBy(id = "lastname")
	private WebElement lastName;

	@FindBy(id = "email_address")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "confirmation")
	private WebElement confirmPassword;

	@FindBy(xpath = "//button[@type='submit' and @title='Register']")
	private WebElement RegisterBtn;

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword.sendKeys(confirmPassword);
	}

	public void clickRegisterBtn() {
		RegisterBtn.click();
	}

}
