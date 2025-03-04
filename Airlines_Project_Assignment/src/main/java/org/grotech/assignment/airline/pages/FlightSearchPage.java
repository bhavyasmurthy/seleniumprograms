package org.grotech.assignment.airline.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FlightSearchPage {

	WebDriver driver;

	// Constructor
	public FlightSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize WebElements
	}

	// Locators using @FindBy
	@FindBy(xpath = "//a[@href='/flights']")
	private WebElement flightTab;

	@FindBy(xpath = "//input[@placeholder='Where from?']")
	// @FindBy(xpath = "//input/parent::div[1]")
	private WebElement fromCity;

	// @FindBy(xpath = "//div/div[1]/div[2]/ul/li/div")
	@FindBy(xpath = "//div[@class='field-1 h-13 flex flex-middle p-relative pr-4 w-100p ']/div[2]/ul")
	private WebElement fromCitySelect;

	@FindBy(xpath = "//input[@placeholder='Where to?']")
	private WebElement toCity;

	@FindBy(xpath = "//div/div[3]/div[2]/ul/li/div")
	private WebElement toCitySelect;

	@FindBy(xpath = "//div[div[div[input[@placeholder='Where from?']]]]/following-sibling::div[2]/div[1]/div/div/div[1]")
	private WebElement departDate;

	@FindBy(xpath = "(//div[@class='DayPicker-Day'])[29]")
	// "//div[2]/div[3]/div[3]/div[4]/div/div[text()='15']")
	// @FindBy(xpath = "//div[@class='Day-grid flex flex-middle flex-column
	// flex-top']/child::div[(text()='15')]")
	private WebElement selectDeparturedate;

	@FindBy(xpath = "//div[div[div[input[@placeholder='Where from?']]]]/following-sibling::div[2]/div/div/div/div[3]")
	private WebElement returnDate;

	@FindBy(xpath = "(//div[@class='DayPicker-Day'])[39]")
	// @FindBy(xpath = "//div[@class='Day-grid flex flex-middle flex-column
	// flex-top']/child::div[(text()='14')]")
	private WebElement selectreturnDate;

	@FindBy(xpath = "//button/div/h4[text()='Search flights']")
	// "//h4[text()='Search flights']")
	private WebElement searchButton;

	@FindBy(xpath = "//div/button[text()='Book']")
	private List<WebElement> flightResults;

	// for different class economy,business,firstclass
	@FindBy(xpath = "(//div[@class='sc-aXZVg iNidEX flex flex-middle']/child::span)[2]")
	private WebElement dropdown;

	@FindBy(xpath = "(//div/child::p)[17]")
	private WebElement economy;
	@FindBy(xpath = "(//div/child::p)[18]")
	private WebElement business;
	@FindBy(xpath = "(//div/child::p)[19]")
	private WebElement firstclass;

	// for round trip
	@FindBy(xpath = "(//div[@class='flex flex-middle']/span)[2]")
	private WebElement dropdown2;

	@FindBy(xpath = "//p[text()='Round trip']")
	private WebElement roundtrip;

	// to validate login details
	@FindBy(xpath = "//div[@class='pb-1 px-1 flex flex-middle nmx-1']")
	private WebElement closebutton;

	@FindBy(xpath = "//button/div/h4[text()='Log in / Sign up']")
	private WebElement loginbutton;

	@FindBy(xpath = "//div/span[text()='Sign out']")
	private WebElement signout;

	@FindBy(xpath = "(//div/child::button[.='Book'])[1]")
	private WebElement bookbtn;

	// Methods
	public void searchOneWayFlight(String from, String to) throws InterruptedException {
		// flightTab.click();
		fromCity.sendKeys(Keys.CLEAR);
		fromCity.sendKeys(from);
		Thread.sleep(2000);
		fromCitySelect.click();
		toCity.sendKeys(Keys.CLEAR);
		toCity.sendKeys(to);
		Thread.sleep(2000);
		toCitySelect.click();
		selectDepartDate();
		Thread.sleep(5000);
		searchButton.click();
	}

	// Methods
	public void searchRoundTripFlight(String from, String to) throws InterruptedException {
		// flightTab.click();
		fromCity.sendKeys(Keys.CLEAR);
		fromCity.sendKeys(from);
		Thread.sleep(2000);
		fromCitySelect.click();
		toCity.sendKeys(Keys.CLEAR);
		toCity.sendKeys(to);
		Thread.sleep(5000);
		toCitySelect.click();
		selectDepartDate();
		Thread.sleep(2000);
		selectReturnDate();
		Thread.sleep(5000);
		searchButton.click();
	}

	public void selectDepartDate() {
		departDate.click();
		selectDeparturedate.click();
	}

	public void selectReturnDate() throws InterruptedException {
		Thread.sleep(2000);
		returnDate.click();
		selectreturnDate.click();
	}

	public void businessclassflight() {
		business.click();
	}

	public void economyclassflight() {
		economy.click();
	}

	public void firstclassflight() {
		firstclass.click();
	}

	public void selectdropdown() {
		dropdown.click();
	}

	public void verifyFlightResults() {
		boolean resultsDisplayed = !flightResults.isEmpty();
		Assert.assertTrue(resultsDisplayed, "Flight search results are displayed");
	}

	// for round trip
	public void selectdropdown2() {
		dropdown2.click();
	}

	public void testroundtrip() {
		roundtrip.click();
	}

	// to validatelogin details
	public void selectclose() {
		closebutton.click();
	}

	public void clickbuttonlogin() {
		loginbutton.click();
	}

	// click book btn
	public void bookflight() {
		bookbtn.click();
	}
}
