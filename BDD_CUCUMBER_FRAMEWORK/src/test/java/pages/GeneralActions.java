package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import steps.Hooks;

public class GeneralActions {

	WebDriver driver;
	
	public GeneralActions(Hooks hooks) {
		this.driver = hooks.getDriver();
	}
	
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}
	
	public void openURL(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	}
	
}
