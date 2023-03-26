package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.GeneralActions;
import pages.ProductComparePopUPPage;
import utilities.WindowsHandleUtil;

public class ProductsComparePopUpPageSteps {

	GeneralActions generalActions;
	ProductComparePopUPPage productComparePopUPPage;
	private WebDriver driver;

	public ProductsComparePopUpPageSteps(Hooks hooks, GeneralActions generalActions) {
		driver = hooks.getDriver();
		this.generalActions = generalActions;
		this.productComparePopUPPage = new ProductComparePopUPPage(hooks.getDriver());
	}

	@Then("A pop-up window is opened and Verify {string} as heading")
	public void verifyPopUpWindowAndHeadingInPopUpWindow(String headingMsg) {
		WindowsHandleUtil.switchTonNewWindow(driver);
		productComparePopUPPage.getHeaderText();
	}

	@And("Verify products {string},{string} present in the pop-up window")
	public void verifyProductsPresentsInThePopUpWindow(String product1, String product2) {
		boolean flag = productComparePopUPPage.verifyProduct(product1);
		boolean flag2 = productComparePopUPPage.verifyProduct(product2);
		if (flag == true && flag2 == true) {
			Assert.assertTrue(true);
		} else {
			Assert.assertFalse(false);
		}
	}

	@Then("close the pop-up window")
	public void closePopUpWindow() {
		productComparePopUPPage.clickOnCloseWindow();
		WindowsHandleUtil.switchTonNewWindow(driver);
	}
}
