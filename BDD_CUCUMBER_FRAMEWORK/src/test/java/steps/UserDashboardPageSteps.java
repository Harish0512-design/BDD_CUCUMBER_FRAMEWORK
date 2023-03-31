package steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pages.GeneralActions;
import pages.UserDashboardPage;
import utilities.LogHelper;

public class UserDashboardPageSteps {

	GeneralActions generalActions;
	UserDashboardPage userDashboardPage;

	public UserDashboardPageSteps(Hooks hooks, GeneralActions generalActions) {
		userDashboardPage = new UserDashboardPage(hooks.getDriver());
		this.generalActions = generalActions;
	}

	@Then("verify success message {string}")
	public void verifySuccessMessage(String message) {
		String expected = message;
		String actual = userDashboardPage.getSucessMsg();

		if (actual.equals(expected)) {
			LogHelper.info("Success msg verified - Pass");
			Assert.assertTrue(true);
		} else {
			LogHelper.warn("Fail - Expected: " + expected + ", Actual: " + actual);
		}
	}

}
