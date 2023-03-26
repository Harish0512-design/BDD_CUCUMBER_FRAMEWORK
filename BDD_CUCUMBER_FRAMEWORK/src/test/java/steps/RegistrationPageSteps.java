package steps;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GeneralActions;
import pages.RegistrationPage;

public class RegistrationPageSteps {

	GeneralActions generalActions;
	RegistrationPage registrationPage;

	public RegistrationPageSteps(Hooks hooks, GeneralActions generalActions) {
		registrationPage = new RegistrationPage(hooks.getDriver());
		this.generalActions = generalActions;
	}

	@When("user enters following details in the registration form")
	public void registerUser(DataTable dt) {
		Map<String, String> userData = dt.asMap();
		registrationPage.setFirstName(userData.get("firstName"));
		registrationPage.setLastName(userData.get("lastName"));
		registrationPage.setEmail(userData.get("email"));
		registrationPage.setPassword(userData.get("password"));
		registrationPage.setConfirmPassword(userData.get("confirmPassword"));
	}

	@And("user clicks on register button")
	public void clickRegisterButton() {
		registrationPage.clickRegisterBtn();
	}
	

}
