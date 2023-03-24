package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class DynamicXpathUtil {

	public static WebElement getWebElement(WebDriver driver, String xpathValue, String textToReplace) {
		return driver.findElement(By.xpath(xpathValue.replace("$replaceable$", textToReplace)));
	}
}
