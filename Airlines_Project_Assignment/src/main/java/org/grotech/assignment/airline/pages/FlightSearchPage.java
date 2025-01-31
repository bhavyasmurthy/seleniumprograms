package org.grotech.assignment.airline.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FlightSearchPage {

	WebDriver driver;

	// Locators using @FindBy
	@FindBy(xpath = "//a[@href='/flights']")
	private WebElement flightTab;

	@FindBy(xpath = "//input[@placeholder='Where from?']")
	private WebElement fromCity;

	@FindBy(xpath = "//div/div[1]/div[2]/ul/li/div")
	private WebElement fromCitySelect;

	@FindBy(xpath = "//input[@placeholder='Where to?']")
	private WebElement toCity;

	@FindBy(xpath = "//div/div[3]/div[2]/ul/li/div")
	private WebElement toCitySelect;

	@FindBy(xpath = "//div[div[div[input[@placeholder='Where from?']]]]/following-sibling::div[2]/div[1]/div/div/div[1]")
	private WebElement departDate;

	@FindBy(xpath = "//div[2]/div[3]/div[3]/div[4]/div/div[text()='13']")
	private WebElement selectDeparturedate;

	@FindBy(xpath = "//div[div[div[input[@placeholder='Where from?']]]]/following-sibling::div[2]/div/div/div/div[3]")
	private WebElement returnDate;

	@FindBy(xpath = "//h4[text()='Search flights']")
	private WebElement searchButton;

	@FindBy(xpath = "//div/button[text()='Book']")
	private List<WebElement> flightResults;

	// Constructor
	public FlightSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // Initialize WebElements
	}

	// Methods
	public void searchFlight(String from, String to) throws InterruptedException {
		flightTab.click();
		fromCity.sendKeys(from);
		Thread.sleep(2000);
		fromCitySelect.click();
		toCity.sendKeys(to);
		Thread.sleep(2000);
		toCitySelect.click();
		departDate.click();
		selectDeparturedate.click();
		searchButton.click();
		Thread.sleep(5000);
	}

	public void verifyFlightResults() {
		boolean resultsDisplayed = !flightResults.isEmpty();
		Assert.assertTrue(resultsDisplayed, "Flight search results are displayed");
	}

}
