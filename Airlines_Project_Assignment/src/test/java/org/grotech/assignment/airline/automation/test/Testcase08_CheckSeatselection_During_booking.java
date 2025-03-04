package org.grotech.assignment.airline.automation.test;

import org.grotech.assignment.airline.pages.FlightSearchPage;
import org.testng.annotations.Test;

//Check for seat selection during the booking process.
public class Testcase08_CheckSeatselection_During_booking extends Testcase_LaunchandQuitBrowser {
	@Test
	public void bookseatposition() throws InterruptedException {
		FlightSearchPage flightSearchPage = new FlightSearchPage(driver);
		flightSearchPage.searchOneWayFlight("Bangalore", "Hyderabad");
		flightSearchPage.verifyFlightResults();
		flightSearchPage.bookflight();

	}

}
