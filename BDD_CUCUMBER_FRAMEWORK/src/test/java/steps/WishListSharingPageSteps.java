package steps;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import pages.WishListSharingPage;

public class WishListSharingPageSteps {

	WishListSharingPage wishListSharingPage;

	public WishListSharingPageSteps(Hooks hooks) {
		wishListSharingPage = new WishListSharingPage(hooks.getDriver());
	}

	@And("user enter email and message")
	public void enterEmailAndMessage(DataTable dt) {
		Map<String, String> data = dt.asMap();
		wishListSharingPage.setEmailAddresses(data.get("email"));
		wishListSharingPage.setMessage("message");
	}
	
	@And("user clicks on share wishlist in wishlist sharing page")
	public void clickOnShareWishList() {
		wishListSharingPage.clickShareWishList();
	}
	
	

}
