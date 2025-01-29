package org.grotech.assignment.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Profilepage {

	private WebDriver driver;

	public Profilepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath = "//div[.='Adult profile']")
//	WebElement adultprofile;

	// for viewlink
	@FindBy(linkText = "View")
	// a[.='View']
	private WebElement viewlink;

	// for preferred department
	@FindBy(xpath = "(//div[@class='accordion-trigger-content desktop'])[1]")
	private WebElement preferreddepartment;

	// for add button inside preferred dept
	@FindBy(xpath = "//button[@class='attribute-action']")
	private WebElement preferreddepartmentaddbutton;

	@FindBy(xpath = "//button[.='Men']")
	private WebElement departmenttype;

	@FindBy(xpath = "(//span[.='Save'])[4]")
	private WebElement savedepartmenttypebutton;

	@FindBy(xpath = "(//div[@class='accordion-trigger-content desktop'])[2]")
	private WebElement heightandweight;

	// @FindBy(xpath = "(//button[@class='attribute-action'][3])")
	@FindBy(xpath = "//button[@class='attribute-action']")
	private WebElement heightandweightaddbutton;

	@FindBy(xpath = "(//input[@class='number-input-box'])[1]")
	private WebElement height;

	@FindBy(xpath = "(//input[@class='number-input-box'])[2]")
	private WebElement weight;

	@FindBy(xpath = "//span[@class='a-button a-button-normal a-button-primary button']")
	WebElement savebutton;

	@FindBy(xpath = "(//div[@class='accordion-trigger-content desktop'])[3]")
	private WebElement agegroup;

	@FindBy(xpath = "//button[.='35-39']")
	// "//button[@class='text-option '][5]")
	private WebElement agegroupbutton;

	@FindBy(xpath = "(//button[@class='pill-container '])[4]")
	WebElement interestsbutton;

	/*
	 * // for edit profile
	 * 
	 * @FindBy(xpath = "//button[@class='edit-pencil-icon-button']") WebElement
	 * editprofile;
	 * 
	 * @FindBy(xpath = "(//div[@class='sc-fUnMCh heBdHY profile-row'])[1]")
	 * WebElement chooseprofile;
	 * 
	 * @FindBy(id = "editProfileNameInputId") WebElement editprofilename;
	 */

	@FindBy(xpath = "(//input[@class='a-button-input'])[3]")
	WebElement continuebtn;

	public void clickviewlink() {
		viewlink.click();
	}

	public void clickpreferrerddepartment() {
		preferreddepartment.click();
	}

	public void clickpreferreddepartmentaddbutton() {
		preferreddepartmentaddbutton.click();
	}

	public void clickdepartmenttype() {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.visibilityOf(departmenttype));
		departmenttype.click();

		// WebElement departmenttype =
		// driver.findElement(By.xpath("//button[@aria-label='Women']"));
		// Actions actions = new Actions(driver);
		// driverWait.until(ExpectedConditions.elementToBeClickable(departmenttype));

		// actions.moveToElement(departmenttype).click().perform();
	}

	public void savedepartmenttypebtn() {
		savedepartmenttypebutton.click();
	}

//for heightand weight
	public void clickheightandweight() {
		heightandweight.click();
	}

	public void clickheightandweightaddbutton() {
		heightandweightaddbutton.click();
	}

	public void enterheight(int value) {
		height.sendKeys(String.valueOf(value));
	}

	public void enterweight(int value) {
		weight.sendKeys(String.valueOf(value));
	}

	public void clicksavebutton() {
		savebutton.click();
	}

	// for age group
	public void clickagegroup() {
		agegroup.click();
	}

	public void selectagegroupbutton() {
		agegroupbutton.click();
	}

	public void clickoninterests() {
		interestsbutton.click();
	}

	/*
	 * public void editprofile() { editprofile.click();
	 * 
	 * }
	 * 
	 * public void editname() { editprofilename.clear();
	 * editprofilename.sendKeys("Bhavya S Murthy");
	 * 
	 * }
	 */

	public void clickcontinuebtn() {
		Actions actions = new Actions(driver);
		actions.moveToElement(continuebtn).perform();
		actions.click(continuebtn).perform();
	}

}
