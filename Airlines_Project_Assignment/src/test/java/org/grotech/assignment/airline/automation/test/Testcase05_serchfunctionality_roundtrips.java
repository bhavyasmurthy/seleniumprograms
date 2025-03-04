package org.grotech.assignment.airline.automation.test;

import org.grotech.assignment.airline.pages.FlightSearchPage;
import org.testng.annotations.Test;

public class Testcase05_serchfunctionality_roundtrips extends Testcase_LaunchandQuitBrowser {

	@Test

	public void testflightsroundtrip() throws InterruptedException {
		FlightSearchPage flightSearchPage = new FlightSearchPage(driver);
		flightSearchPage.selectdropdown2();
		flightSearchPage.testroundtrip();
		Thread.sleep(2000);
		flightSearchPage.searchRoundTripFlight("Bangalore", "Hyderabad");
		flightSearchPage.verifyFlightResults();
	}
}
