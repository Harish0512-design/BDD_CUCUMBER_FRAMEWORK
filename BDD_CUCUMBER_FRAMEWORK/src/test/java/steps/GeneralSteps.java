package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GeneralActions;
import utilities.LogHelper;

public class GeneralSteps {

	GeneralActions generalActions;
	String url;

	public GeneralSteps(Hooks hooks, GeneralActions generalActions) {
		this.generalActions = generalActions;
		url = hooks.getURL();
	}

	@Given("user launched the application")
	public void launchApplication() {
		generalActions.openURL(url);

		LogHelper.info("Application launched.");
	}

	@Then("verify page title {string}")
	public void verifyPageTitle(String expected) {

		String actual = generalActions.getCurrentPageTitle();

		if (actual.equals(expected)) {
			Assert.assertTrue(true);

			LogHelper.info("Page title verified successfully.");

		} else {
			Assert.assertTrue(false);

			LogHelper.warn("Page title doesn't match. Expected: " + expected + " but actual: " + actual);
		}
	}
}
