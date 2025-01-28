package org.grotech.assignment.amazon.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

	WebDriverWait wait;
	private Actions actions;

	// init elements
	public CheckoutPage(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	// click to change address
	@FindBy(xpath = "(//a[contains(text(), 'Change')])[1]")
	// "//a[@id='addressChangeLinkId']")

	private WebElement changeAddress;

	// address1
	@FindBy(xpath = "(//span[@class='a-label a-radio-label'])")
	private List<WebElement> addressess;

	@FindBy(xpath = "(//a[contains(text(),'Change')])[2]")
	// "(//a[@class='a-link-normal'])[3]")

	private WebElement changePayment;

	// click to use the address
	@FindBy(xpath = "//span[@id='orderSummaryPrimaryActionBtn-announce']")
	// @FindBy(xpath = "//span[@id='checkout-secondary-continue-button-id']")
	private WebElement useThisAddress;

	// click to use the address
	@FindBy(xpath = "//span[@id='orderSummaryPrimaryActionBtn-announce']")
	// @FindBy(xpath = "//span[@id='checkout-secondary-continue-button-id']")
	private WebElement useThisPayment;

	@FindBy(xpath = "(//span[@class='a-text-bold'])[3]")
	// (id = "pp-yos4PC-101")
	private WebElement selectCreditCardPayment;

	@FindBy(xpath = "(//span[@class='a-text-bold'])[4]")
	// (id = "pp-yos4PC-101")
	private WebElement selectnetbanking;

	@FindBy(xpath = "//span[.='Other UPI Apps']")
	// (id = "pp-yos4PC-101")
	// (//span[@class='a-text-bold'])[5]
	private WebElement selectupiapp;

	@FindBy(xpath = "(//span[@class='a-text-bold'])[5]")
	private WebElement selectemiapp;

	// cod
	@FindBy(xpath = "(//span[.='Cash on Delivery/Pay on Delivery'])[3]")
	private WebElement selectcodapp;

	// offer page link
	@FindBy(xpath = "//a[@id='prime-panel-fallback-button']")
	private WebElement offerPage;

	// placeorder
	@FindBy(xpath = "//span[@id='submitOrderButtonId-announce']")
	private WebElement placeyouorder;

	// couponcode
	@FindBy(xpath = "//input[@id='pp-pYALd6-102']")
	private WebElement couponcode;

	// lastorderproductgive5starrating for productreview button
	@FindBy(xpath = "//a[@id='a-autoid-7-announce']")
	WebElement writeproductreviewbtn;

	// to check is change button visible for address
	public boolean isChangeAddressDisplayed() {
		try {
			return changeAddress.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean isChangePaymentDisplayed() {
		try {
			return changePayment.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	// click change address
	public void clickChangeAddress() {
		changeAddress.click();
	}

	public void chooseAddress(int index) {
		WebElement address = addressess.get(index);
		wait.until(ExpectedConditions.elementToBeClickable(address));
		System.out.println(address.getText());
		actions.moveToElement(address).perform();
		actions.click(address).perform();
	}

	// clicks on use this address
	public void useThisAddress() {

		actions.moveToElement(useThisAddress).perform();
		actions.click(useThisAddress).perform();

	}

	// clicks on use this payment
	public void useThisPayment() {
		actions.moveToElement(useThisPayment).perform();
		actions.click(useThisPayment).perform();
	}

	public boolean isOfferPageDisplayed() {
		try {
			return offerPage.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public void clickOfferPageNext() {
		offerPage.click();
	}

	// click change payment
	public void clickChangePayment() {
		changePayment.click();
//		actions.moveToElement(changePayment).perform();
//		actions.click(changePayment).perform();
	}

//choose payment option
	public void selectCreditCardPayment() {
		selectCreditCardPayment.click();
	}

	public void selectnetbanking() {
		selectnetbanking.click();
	}

	public void selectupiapp() {
		selectupiapp.click();
	}

	public void selectemiapp() {
		selectemiapp.click();
	}

	public void selectcodapp() {
		selectcodapp.click();
	}

	public boolean isplaceorderdisplayed() {
		try {
			return placeyouorder.isDisplayed();
		} catch (NoSuchElementException nse) {
			return false;

		}
	}

	public boolean iscouponcodetextdisplayed() {
		try {
			return couponcode.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}

	}

	public void clickonwriteaproductreview() {
		writeproductreviewbtn.click();
	}
}