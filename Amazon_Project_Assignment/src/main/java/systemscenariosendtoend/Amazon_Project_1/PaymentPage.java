package systemscenariosendtoend.Amazon_Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='a-button-input a-button-text'])[3]")
	private WebElement usethispaymentmethod;

	@FindBy(xpath = "(//input[@id='placeOrder'])")
	private WebElement placeyourorder;

	public void clickpaymentmethod() {
		usethispaymentmethod.click();
	}

	public boolean isplaceorderDisplayed() {
		boolean isPlaceOrderDisplayed = false;
		try {
			isPlaceOrderDisplayed = placeyourorder.isDisplayed();
		} catch (Exception e) {
			// page is not displayed for re confirmation
		}
		return isPlaceOrderDisplayed;
	}

	public void clickonplaceorder() {
		placeyourorder.click();
	}

}
