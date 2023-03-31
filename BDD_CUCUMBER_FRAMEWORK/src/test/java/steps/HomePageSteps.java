package steps;

import io.cucumber.java.en.When;
import pages.GeneralActions;
import pages.HomePage;
import utilities.LogHelper;

public class HomePageSteps {

	HomePage homepage;
	GeneralActions generalActions;

	public HomePageSteps(Hooks hooks, GeneralActions generalActions) {
		homepage = new HomePage(hooks.getDriver());
		this.generalActions = generalActions;
	}

	@When("user clicks on {string} menu")
	public void userClickOnMenuItem(String menuItem) {
		homepage.clickMenuItem(menuItem);

		LogHelper.info("Home page: " + menuItem + " menu clicked.");
	}

	@When("user clicks on ACCOUNT")
	public void clickAccount() {
		homepage.clickAccount();
	}

	@When("user selects {string}")
	public void selectRegister(String registerLink) {
		homepage.selectFromAccount(registerLink);
	}

}
