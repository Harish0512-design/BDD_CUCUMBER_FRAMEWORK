package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.DriverFactory;
import utilities.ReadConfig;

public class Hooks {

	private WebDriver driver;
	private String url;
	private ReadConfig readConfig;

	@Before
	public void setup() {
		readConfig = new ReadConfig();
		driver = DriverFactory.getBrowserDriver(readConfig.getBrowser());
		url = readConfig.getBaseURL();
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@AfterStep
	public void takeScreenshot(Scenario sc) {
		byte[] ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(ss, "image/png", sc.getName());
	}

	public WebDriver getDriver() {
		return driver;
	}

	public String getURL() {
		return url;
	}

}
