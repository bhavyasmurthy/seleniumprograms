package org.grotech.assignment.amazon.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name = "email")
	private WebElement username;

	@FindBy(id = "continue")
	private WebElement cntbutton;

	@FindBy(id = "ap_password")
	private WebElement password;

	@FindBy(id = "signInSubmit")
	private WebElement signin_button;

	@FindBy(xpath = "//h1[contains(text(),' Looks like you are new to Amazon')]")
	private WebElement containsnewtoamazontext;

	// @FindBy(xpath = "//h1[@class='a-spacing-small moa_desktop_signup']")
	@FindBy(xpath = "(//span[@class='a-list-item'])[1]")
	private WebElement wecannotfindanaccountwiththatemailaddress;

	public void setusername(String uname) {
		username.sendKeys(uname);
	}

	public void continue_button() {
		cntbutton.click();
	}

	public void setpwd(String pwd) {
		password.sendKeys(pwd);
	}

	public void signin() {
		signin_button.click();
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void invalidUsername() {
		username.sendKeys("abcal@gmail.com");

	}

	public void invalidPassword() {
		password.sendKeys("kaa$5776");

	}

	public boolean isNewToAmazonTextDisplayed() {
		try {
			return containsnewtoamazontext.isDisplayed();
		} catch (NoSuchElementException nse) {
			return wecannotfindanaccountwiththatemailaddress.isDisplayed();

		}
	}

}
