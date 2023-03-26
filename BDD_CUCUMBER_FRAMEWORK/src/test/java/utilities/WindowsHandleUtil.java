package utilities;

import org.openqa.selenium.WebDriver;

public final class WindowsHandleUtil {

	public static void switchTonNewWindow(WebDriver driver) {
		for (String window : driver.getWindowHandles()) {
			driver.switchTo().window(window);
		}
	}
}
