package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverFactory {

	private static WebDriver driver;

	public static WebDriver getBrowserDriver(String browser) {
		try {
			switch (browser.toLowerCase()) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;

			case "edge":
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/drivers/edgedriver.exe");
				driver = new EdgeDriver();
				break;

			case "firefox":
				System.setProperty("webdriver.firefox.driver",
						System.getProperty("user.dir") + "/drivers/fireforxdriver.exe");
				driver = new FirefoxDriver();
				break;

			case "headless":
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "/drivers/chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setHeadless(true);
				driver = new ChromeDriver();
				break;

			default:
				throw new Exception("Invalid browser");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return driver;
	}
}
