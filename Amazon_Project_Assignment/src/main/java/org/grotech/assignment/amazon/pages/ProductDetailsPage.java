package org.grotech.assignment.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

	private Actions actions;

	public ProductDetailsPage(WebDriver driver) {
		actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[contains(text(),'About this item')]")
	private WebElement productdescription;

	@FindBy(xpath = "//h2[.='Customer reviews']")
	WebElement customerreviews;

	// price details MRP
	// @FindBy(xpath = "(//span[contains(text(),'M.R.P')])[1]")
	@FindBy(xpath = "//span[@class='a-size-small aok-offscreen']")
	private WebElement mrp;

	public boolean ispriceviewdisplayed() {
		actions.moveToElement(mrp).perform();
		return mrp.isEnabled();
	}

	public boolean isproductdescriptiondisplayed(WebDriver driver) throws InterruptedException {
		actions.scrollToElement(productdescription).perform();
		return productdescription.isDisplayed();
	}

	public boolean iscutomerreviewdisplayed() {
		actions.moveToElement(customerreviews).perform();
		return customerreviews.isDisplayed();
	}

}