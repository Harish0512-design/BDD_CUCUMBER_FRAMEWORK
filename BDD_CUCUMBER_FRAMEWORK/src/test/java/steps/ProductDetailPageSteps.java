package steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import pages.GeneralActions;
import pages.ProductDetailPage;
import utilities.LogHelper;

public class ProductDetailPageSteps {

	ProductListPageSteps productListPageSteps;
	ProductDetailPage productDetailPage;
	GeneralActions generalActions;

	public ProductDetailPageSteps(Hooks hooks, GeneralActions generalActions,
			ProductListPageSteps productListPageSteps) {
		productDetailPage = new ProductDetailPage(hooks.getDriver());
		this.generalActions = generalActions;
		this.productListPageSteps = productListPageSteps;
	}

	@Then("verify {string} price in product details page is same as in product list page")
	public void verifyProductPriceInListAndDetailPage(String productName) {
		if (productListPageSteps.getProductPrice().equals(productDetailPage.getProductPrice())) {

			Assert.assertTrue(true);
			LogHelper.info("Price in details page matches with price in list page");
		} else {

			Assert.assertTrue(false);
			LogHelper.info("prices doesn't matched.");
		}
	}
}
