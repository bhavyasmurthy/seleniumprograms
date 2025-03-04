package org.grotech.assignment.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product1Page {

	private WebDriver driver;

	public Product1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(id = "add-to-cart-button")
	private WebElement addcartbtn;

	@FindBy(xpath = "//span[@id='sw-gtc']/span/a")
	private WebElement gotocart;

	// to apply couponcheckbox
	@FindBy(xpath = "(//label/i[@class='a-icon a-icon-checkbox'])[1]")
	private WebElement selectcoupncheckbox;

	// add to cart
	public void clickaddcart() {
		addcartbtn.click();
	}

	public void cickgotocart() {
		gotocart.click();
	}

	public void iscouponcheckboxdisplayed() throws InterruptedException {
		Actions actions = new Actions(driver);
		// xpath="(//span[contains(text(),'with coupon')]//preceding :: div[3])[1]"
		actions.moveToElement(selectcoupncheckbox).click().perform();

	}

}
