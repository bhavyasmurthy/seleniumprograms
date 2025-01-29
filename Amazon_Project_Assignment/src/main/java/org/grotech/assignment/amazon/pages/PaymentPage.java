package org.grotech.assignment.amazon.pages;

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

	// for credit card option
	@FindBy(xpath = "//span[@class='a-text-bold'][3]")
	WebElement creditcard;

	// apply for coupon code while ordering the product
	@FindBy(xpath = "//a[contains(text(),'Use a gift card, voucher or promo code')]")
	private WebElement couponcode;

	@FindBy(xpath = "//input[@placeholder='Enter Code']")
	// "//input[@name='claimCode']")
	private WebElement entercouponcodeintextbox;
	// input[@name='ppw-claimCode']

	@FindBy(xpath = "//span[@id='gcApplyButtonId']")
	// "//span[@id='gcApplyButtonId-announce']")
	// "//span[@id='gcApplyButtonId-announce']")
	private WebElement applybutton;
	// span[@id='pp-FENWG0-101']

	// for creditcard details
	// to enter credtcard details in textbox
	@FindBy(xpath = "//input[@name='addCreditCardNumber']")
	WebElement cardnumbertextbox;

	@FindBy(name = "ApxSecureIframe")
	WebElement creditcardiframe;

	@FindBy(xpath = "//a[.='Save Card']")
	private WebElement savecardlink;

	public void creditcardiframe_method(WebDriver driver) {
		driver.switchTo().frame(creditcardiframe);
		cardnumbertextbox.sendKeys("4578090034667572");

		// driver.switchTo().defaultContent();
	}

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

	public void choosecreditcard() {
		creditcard.click();
	}

	public void clickonsavecard() {
		savecardlink.click();
	}

	public void clickcouponcode() {
		couponcode.click();
	}

	public void entercouponcodeintextbox(int index) {
		entercouponcodeintextbox.sendKeys(String.valueOf(index));
	}

	public void clickapplybutton() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions
//				.invisibilityOf(driver.findElement(By.xpath("//input[@aria-labelledby='gcApplyButtonId-announce']"))));
//		wait.until(ExpectedConditions.elementToBeClickable(applybutton));
		applybutton.click();

	}

}
