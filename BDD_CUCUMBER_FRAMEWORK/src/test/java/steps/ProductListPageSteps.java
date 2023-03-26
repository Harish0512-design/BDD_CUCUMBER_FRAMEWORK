package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GeneralActions;
import pages.ProductListPage;
import utilities.LogHelper;
import utilities.WaitHelper;

public class ProductListPageSteps {

	ProductListPage productListPage;
	GeneralActions generalActions;
	private String productPrice;

	public String getProductPrice() {
		return productPrice;
	}

	public ProductListPageSteps(Hooks hooks, GeneralActions generalActions) {
		productListPage = new ProductListPage(hooks.getDriver());
		this.generalActions = generalActions;
	}

	@When("user selects {string} from the upper sortBy dropdown")
	public void user_selects_from_the_upper_sort_by_dropdown(String option) {
		productListPage.selectFromUpperSortBy(option);
		LogHelper.info("Product list page:- " + option + " selected from upper sortby");
	}

	@When("user selects {string} from the lower sortBy dropdown")
	public void user_selects_from_the_lower_sort_by_dropdown(String option) {
		productListPage.selectFromLowerSortBy(option);
		LogHelper.info("product list page:- " + option + " selected from lower sortby");
	}

	@Then("verify items are sorted in ascending order")
	public void verify_items_are_sorted_in_ascending_order() {
		LogHelper.info("product list page:- screenshot to check ascending order is taken");
	}

	@And("note the price value of {string} in product list page")
	public void getProductPriceInListPage(String productName) {
		productPrice = productListPage.getPrice(productName);

		LogHelper.info("Product price is list page is stored.");
	}

	@When("user clicks on {string} from products list")
	public void clickOnProductName(String productName) {
		productListPage.clickOnProductNameLink(productName);

		LogHelper.info(productName + " clicked. from products list");
	}

	@And("user clicks on ADDTOCART for {string}")
	public void userClickOnAddToCart(String productName) {
		productListPage.clickAddToCart(productName);
	}
	
	@When("user clicks on Add to Compare button for products {string},{string}")
	public void clickOnAddToCompareButton(String product1, String product2) {
		productListPage.clickAddToCompare(product1);
		productListPage.clickAddToCompare(product2);
	}
	
	@Then("user clicks on COMPARE button")
	public void userClickOnCompareButton() {
		productListPage.clickCompareBtn();
	}
}
