package systemscenariosendtoend.Amazon_Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage {

	private Actions actions;
	private WebDriverWait wait;

	public ProductDetailsPage(WebDriver driver) {
		// wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[.='Product Description']")
	private WebElement productdescription;

	@FindBy(xpath = "//h2[.='Customer reviews']")
	WebElement customerreviews;

	// price details MRP
	@FindBy(xpath = "(//span[contains(text(),'M.R.P')])[1]")
	private WebElement mrp;

	public boolean isproductdescriptiondisplayed(WebDriver driver) throws InterruptedException {
		actions.scrollToElement(productdescription).perform();
		return productdescription.isDisplayed();
	}

	public boolean iscutomerreviewdisplayed() {
		actions.moveToElement(customerreviews).perform();
		return customerreviews.isDisplayed();
	}

	public boolean ispriceviewdisplayed() {
		actions.moveToElement(mrp).perform();
		return mrp.isDisplayed();
	}

}