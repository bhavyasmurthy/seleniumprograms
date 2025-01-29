package org.grotech.assignment.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HoPage {
	private Actions actions;

	public HoPage(WebDriver driver) {
		actions = new Actions(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='signIn']")
	private WebElement signinbutton;

	@FindBy(xpath = "//button[.='Accept All']")
	private WebElement acceptcookies;

	@FindBy(xpath = "//button[@id='create-account-button']")
	private WebElement signupbutton;

	@Test
	public void signinclick() {
		signinbutton.click();
	}

	public void signupclick() {
		signupbutton.click();
	}

	public void selectcookies() {
		acceptcookies.click();
	}

}
