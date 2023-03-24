package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class WaitHelper {

	public static void waitUntilElementIsVisible(WebDriver driver, WebElement element, long time) {
		new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitUntilElementIsClickable(WebDriver driver, WebElement element, long time) {
		new WebDriverWait(driver, time).until(ExpectedConditions.elementToBeClickable(element));
	}
	

}
