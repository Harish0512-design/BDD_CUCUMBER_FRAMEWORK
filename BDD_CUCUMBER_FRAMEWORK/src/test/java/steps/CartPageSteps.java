package steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.GeneralActions;
import utilities.LogHelper;

public class CartPageSteps {

	GeneralActions generalActions;
	CartPage cartPage;

	public CartPageSteps(Hooks hooks, GeneralActions generalActions) {
		cartPage = new CartPage(hooks.getDriver());
		this.generalActions = generalActions;
	}

	@When("user update the quantity by {string}")
	public void updateQuantityInCart(String qty) {
		cartPage.enterQuantity(qty);
		cartPage.clickUpdateBtn();
	}

	@Then("verify error message {string}")
	public void verifyErrorMessage(String errorMsg) {
		String actual = cartPage.getErrorMsg();
		String expected = errorMsg;

		if (actual.equals(expected)) {
			LogHelper.info("Pass- Error msg verified");
			Assert.assertTrue(true);
		} else {
			LogHelper.warn("Fail- Error msg not verified. Expected: " + expected + " Actual: " + actual);
			Assert.assertTrue(false);
		}
	}

	@When("user clicks on EMPTYCART in the cart page")
	public void userClicksOnEmptyCart() {
		cartPage.clickEmptyCartLink();
	}

	@Then("Verify the message {string}")
	public void verifyEmptyCartMsg(String emptyCartMsg) {
		String actual = emptyCartMsg;
		String expected = cartPage.getShoppingCartEmptyMsg();

		if (actual.equals(expected)) {
			LogHelper.info("Pass- Shopping Empty Cart msg verified");
			Assert.assertTrue(true);
		} else {
			LogHelper.warn("Fail- Shopping Empty Cart not verified. Expected: " + expected + " Actual: " + actual);
			Assert.assertTrue(false);
		}
	}
}
