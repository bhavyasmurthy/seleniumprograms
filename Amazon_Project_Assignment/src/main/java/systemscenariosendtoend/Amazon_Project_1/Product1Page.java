package systemscenariosendtoend.Amazon_Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product1Page {

	public Product1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "add-to-cart-button")
	private WebElement addcartbtn;

	@FindBy(xpath = "//span[@id='sw-gtc']/span/a")
	private WebElement gotocart;

	// add to cart
	public void clickaddcart() {
		addcartbtn.click();
	}

	public void cickgotocart() {
		gotocart.click();
	}

}
