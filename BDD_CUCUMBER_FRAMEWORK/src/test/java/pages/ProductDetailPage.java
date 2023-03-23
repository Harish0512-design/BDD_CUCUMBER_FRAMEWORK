package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends MasterPage {

	public ProductDetailPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='price' and not(contains(@id,'old-price'))]")
	private WebElement productPrice;
	
	// action methods
	
	public String getProductPrice() {
		return productPrice.getText();
	}
}
