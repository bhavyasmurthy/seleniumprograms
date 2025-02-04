package org.grotech.assignment.amazon.pages;

import java.time.Duration;

import org.openqa.selenium.By;
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

	// for view link
	@FindBy(linkText = "View")
	private WebElement viewlink;

	// for preferred department
	@FindBy(xpath = "//button[@id='accordion-preferred-department-id']")
	private WebElement preferreddepartment;

	// clear department type
	@FindBy(xpath = "//button[text()='Clear']")
	private WebElement clear;

	@FindBy(xpath = "//span[contains(text(), 'Yes, clear my data')]/parent::span")
	private WebElement savemychanges;

	// for add button inside preferred dept
	@FindBy(xpath = "//button[@class='attribute-action']")
	private WebElement preferreddepartmentaddbutton;

	@FindBy(xpath = "//button[.='Men']")
	private WebElement departmenttype;

	@FindBy(xpath = "(//span[.='Save'])[4]")
	private WebElement savedepartmenttypebutton;

	@FindBy(xpath = "//button[@id='accordion-height-and-weight-id']")
	private WebElement heightandweight;

	@FindBy(xpath = "(//button[@class='attribute-action'])[2]")
	private WebElement heightandweightaddbutton;

	@FindBy(xpath = "//span[@class='a-button a-button-normal a-button-primary button']")
	WebElement savebutton;

	@FindBy(xpath = "(//div[@class='accordion-trigger-content desktop'])[3]")
	private WebElement agegroup;

	@FindBy(xpath = "//button[contains(text(),'35-39')]")
	// "//button[.='35-39']"
	// "//button[@class='text-option '][5]")
	private WebElement agegroupbutton;

	@FindBy(xpath = "(//button[@class='pill-container '])[4]")
	WebElement interestsbutton;

	@FindBy(xpath = "(//input[@class='a-button-input'])[3]")
	WebElement continuebtn;

	public void clickviewlink() {
		viewlink.click();
	}

	public void clickpreferrerddepartment() {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement popover = driver.findElement(By.xpath("//div[@class='a-popover a-popover-modal a-declarative']"));
		driverWait.until(ExpectedConditions.invisibilityOf(popover));
		preferreddepartment.click();
	}

	public void cleardepartmenttype() {
		clear.click();
	}

	public void saveclearedchanges() {
		savemychanges.click();
	}

	public void clickpreferreddepartmentaddbutton() {
		preferreddepartmentaddbutton.click();
	}

	public void selectwomendepartmenttype() {
		// first get the element of pop over and then search for Women or Men element
		// from popover
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement popover = driver.findElement(By.xpath("//div[@class='a-popover a-popover-modal a-declarative']"));
		driverWait.until(ExpectedConditions.visibilityOf(popover));
		WebElement departmenttypewomen = popover.findElement(By.xpath("//button[text()='Women']"));
		// department type women is not selected so selecting women
		driverWait.until(ExpectedConditions.elementToBeClickable(departmenttypewomen));
		departmenttypewomen.click();
	}

	public void savedepartmenttypebtn() {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.elementToBeClickable(savedepartmenttypebutton));
		savedepartmenttypebutton.click();
	}

	// for height and weight
	public void clickheightandweight() {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.elementToBeClickable(heightandweight));
		heightandweight.click();
	}

	public void clickheightandweightaddbutton() {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.elementToBeClickable(heightandweightaddbutton));
		heightandweightaddbutton.click();
	}

	public void enterheight(int value) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement popover = driver.findElement(By.xpath("//div[@class='a-popover a-popover-modal a-declarative']"));
		driverWait.until(ExpectedConditions.visibilityOf(popover));
		WebElement height = popover.findElement(By.xpath("(//input[@class='number-input-box'])[1]"));
		driverWait.until(ExpectedConditions.elementToBeClickable(height));
		height.sendKeys(String.valueOf(value));
	}

	public void enterweight(int value) {
		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement popover = driver.findElement(By.xpath("//div[@class='a-popover a-popover-modal a-declarative']"));
		driverWait.until(ExpectedConditions.visibilityOf(popover));
		WebElement weight = popover.findElement(By.xpath("(//input[@class='number-input-box'])[2]"));
		driverWait.until(ExpectedConditions.elementToBeClickable(weight));
		weight.sendKeys(String.valueOf(value));
	}

	public void clicksavebutton() {
		savebutton.click();
	}

	// for age group
	public void clickagegroup() {
		agegroup.click();
	}

	public void selectagegroupbutton() throws InterruptedException {
		Thread.sleep(2000);
		agegroupbutton.click();
	}

	public void clickoninterests() {
		interestsbutton.click();
	}

	public void clickcontinuebtn() {
		Actions actions = new Actions(driver);
		actions.moveToElement(continuebtn).perform();
		actions.click(continuebtn).perform();
	}

}
