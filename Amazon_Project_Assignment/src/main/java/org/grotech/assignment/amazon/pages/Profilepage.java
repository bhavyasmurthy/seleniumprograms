package org.grotech.assignment.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profilepage {

	private WebDriver driver;

	public Profilepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath = "//div[.='Adult profile']")
//	WebElement adultprofile;

	@FindBy(linkText = "View")
	WebElement viewlink;

	// for edit profile
	@FindBy(xpath = "//button[@class='edit-pencil-icon-button']")
	WebElement editprofile;

	@FindBy(xpath = "(//div[@class='sc-fUnMCh heBdHY profile-row'])[1]")
	WebElement chooseprofile;

	@FindBy(id = "editProfileNameInputId")
	WebElement editprofilename;

	@FindBy(xpath = "(//input[@class='a-button-input'])[3]")
	WebElement continuebtn;

	public void clickviewlink() {
		viewlink.click();
	}

	public void editprofile() {
		editprofile.click();

	}

	public void editname() {
		editprofilename.clear();
		editprofilename.sendKeys("Bhavya S Murthy");

	}

	public void clickcontinuebtn() {
		Actions actions = new Actions(driver);
		actions.moveToElement(continuebtn).perform();
		actions.click(continuebtn).perform();
	}

}
