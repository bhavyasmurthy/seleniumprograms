package org.grotech.assignment.amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Regpage {
	public Regpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[.='Title']")
	private WebElement titletextbox;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
	private WebElement titleoptions;

	@FindBy(id = "userfirstNameInput")
	private WebElement firstname;

	@FindBy(id = "userLastName")
	private WebElement lastname;

	@FindBy(xpath = "//button[@class='btn btn-outline-secondary bi bi-calendar3']")
	private WebElement calendar;

	@FindBy(id = "date_of_birth")
	private WebElement dateofbirth;

	@FindBy(xpath = "(//select[@class='form-select'])[1]")
	WebElement month;

	@FindBy(id = "contactEmail")
	WebElement email;

	@FindBy(id = "confirmEmail")
	WebElement confirmemail;

	@FindBy(id = "phoneNo")
	WebElement phonenumber;

	@FindBy(id = "confirmPhoneNo")
	WebElement confirmphno;

	@FindBy(id = "promotionCheck")
	WebElement checkbox;

	@FindBy(xpath = "//button[@id='submit-button']")
	WebElement submitbutton;

	public void choosetitle() {
		titletextbox.click();

	}

	public void chooseoptionstitle() {
		titleoptions.click();

	}

	public void enterfname(String str) {
		firstname.sendKeys(str);
	}

	public void enterlname(String str) {
		lastname.sendKeys(str);
	}

	public boolean isdateofbirthdisplayed() {
		return dateofbirth.isDisplayed();
	}

	public void choosecalendar() {
		calendar.click();
	}

	public void choosemonth(String index) {
		Select select = new Select(month);
		// select.selectByIndex(index);
		select.selectByVisibleText(index);

	}

	public void enteremail(String str) {
		email.sendKeys(str);
		email.sendKeys(Keys.CONTROL + "A");
		email.sendKeys(Keys.CONTROL + "C");
	}

	public void cofirmmailid(String str) {
		confirmemail.sendKeys(str);
		// confirmemail.sendKeys(Keys.CONTROL + "V");
	}

	public void contactnumber(String number) {
		phonenumber.sendKeys(number);
	}

	public void cofirmcontactdetails(String number) {
		confirmphno.sendKeys(number);
	}

	public void selectCheckbox() {
		checkbox.click();

	}

	public void clicksubmitbtn() {
		submitbutton.click();

	}

}
