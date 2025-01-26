package org.grotech.assignment.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='a-icon a-icon-small-add']")
	private WebElement incrementcount;

	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement delete;

	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	private WebElement proceedcheckout_btn;

	@FindBy(xpath = "//h2[@id='sc-active-items-header']")
	WebElement shoppingcarttextvisible;

	public void incrementproductcount(int count) throws InterruptedException {
		for (int i = 0; i < count; i++) {
			incrementcount.click();
			Thread.sleep(1000);
		}
	}

	public void delete() {
		delete.click();
	}

	public void proceedcheckout() {
		proceedcheckout_btn.click();
	}

	public boolean isshoppingcarttextvisible() {

		return shoppingcarttextvisible.isDisplayed();

	}
}
