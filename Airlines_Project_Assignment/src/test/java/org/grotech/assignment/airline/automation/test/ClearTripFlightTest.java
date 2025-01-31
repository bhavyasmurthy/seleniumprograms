package org.grotech.assignment.airline.automation.test;

import org.grotech.assignment.airline.pages.FlightSearchPage;
import org.testng.annotations.Test;

public class ClearTripFlightTest extends Testcase_LaunchandQuitBrowser {

	@Test
	public void testFlightSearch() throws InterruptedException {
		FlightSearchPage flightSearchPage = new FlightSearchPage(driver);
		flightSearchPage.searchFlight("Bangalore", "Hyderabad");
		flightSearchPage.verifyFlightResults();
	}

}
