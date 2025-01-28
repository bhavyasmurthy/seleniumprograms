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

}
