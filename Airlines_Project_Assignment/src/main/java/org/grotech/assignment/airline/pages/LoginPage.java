package org.grotech.assignment.airline.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "mobile")
	private WebElement mobilenumber;

	@FindBy(xpath = "(//div[@class='c-inherit flex flex-1 flex-nowrap fs-16 fw-500 card-price'])[2]")
	private WebElement adult;

	@FindBy(xpath = "(//div/child::p)[17]")
	private WebElement economy;
	@FindBy(xpath = "(//div/child::p)[18]")
	private WebElement business;
	@FindBy(xpath = "(//div/child::p)[19]")
	private WebElement firstclass;

	@FindBy(xpath = "//span/p")
	private WebElement myaccount;

	@FindBy(xpath = "//span[text()='Get OTP']")
	private WebElement selectotp;

	@FindBy(xpath = "//p[text()='Please enter a valid phone number']")
	private WebElement invalidmobilenotext;

	public void mobileno(String num) {
//	WebElement webElement = driver.findElement(By.xpath("//div[@class='sc-aXZVg DHhaJ br-8 bg-white']"));
		// WebElement mn = webElement.findElement(By.id("mobile"));
		// mn.sendKeys(String.valueOf(num));
		mobilenumber.sendKeys(num);

	}

	public void clickotp() {
		selectotp.click();
	}

	public boolean verifyinvalidcredential() {
		return invalidmobilenotext.isDisplayed();
	}

}
