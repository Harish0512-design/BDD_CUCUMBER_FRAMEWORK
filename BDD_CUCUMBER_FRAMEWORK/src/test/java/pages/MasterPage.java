package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MasterPage {

	WebDriver driver;
	public MasterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
}
