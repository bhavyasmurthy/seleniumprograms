package org.grotech.assignment.airline.automation.test;

import org.grotech.assignment.airline.pages.FlightSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase06_validatesearchresults extends Testcase_LaunchandQuitBrowser {

	@Test
	public void testbusinessflightclass() throws InterruptedException {
		FlightSearchPage flightSearchPage = new FlightSearchPage(driver);
		flightSearchPage.selectdropdown();
		Thread.sleep(2000);
		flightSearchPage.businessclassflight();
		Thread.sleep(2000);
		flightSearchPage.searchOneWayFlight("Bangalore", "Hyderabad");
		Thread.sleep(2000);
		Assert.assertNotEquals(driver.getCurrentUrl(),
				"https://www.cleartrip.com/flights/results?adults=1&childs=0&infants=0&class=First&depart_date=13/03/2025&from=BLR&to=HYD&intl=n&origin=BLR%20-%20Bangalore,%20IN&destination=HYD%20-%20Hyderabad,%20IN&sft=&sd=1740492151539&rnd_one=O&isCfw=false");
		flightSearchPage.verifyFlightResults();
	}

	@Test
	public void testfirstflightclass() throws InterruptedException {

		FlightSearchPage flightSearchPage = new FlightSearchPage(driver);
		flightSearchPage.selectdropdown();
		Thread.sleep(2000);
		flightSearchPage.firstclassflight();
		Thread.sleep(2000);

		flightSearchPage.searchOneWayFlight("Bangalore", "Hyderabad");
		Thread.sleep(2000);

		flightSearchPage.verifyFlightResults();

	}
}
