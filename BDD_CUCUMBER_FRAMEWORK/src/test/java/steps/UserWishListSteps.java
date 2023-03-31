package steps;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.UserWishListPage;
import utilities.LogHelper;

public class UserWishListSteps {

	UserWishListPage userWishListPage;

	public UserWishListSteps(Hooks hooks) {
		userWishListPage = new UserWishListPage(hooks.getDriver());
	}

	@And("user clicks on Share Wishlist")
	public void userClicksOnShareWishlist() {
		userWishListPage.clickOnShareWishListBtn();
	}

	@Then("verify success message {string} in wishlist page")
	public void verifySuccessMessage(String message) {
		String expected = message;
		String actual = userWishListPage.getSuccessMsg();

		if (actual.equals(expected)) {
			LogHelper.info("Pass- Success message verified - " + actual);
			Assert.assertTrue(true);
		} else {
			LogHelper.warn("Fail- Expected: " + expected + ", Actual: " + actual);
			Assert.assertTrue(false);
		}
	}
}
