package org.grotech.assignment.airline.automation.test;

import org.grotech.assignment.airline.pages.FlightSearchPage;
import org.grotech.assignment.airline.pages.LoginPage;
import org.testng.annotations.Test;

public class Testcase02_validatelogin_withvalidcredentials extends Testcase_LaunchandQuitBrowser {
	@Test
	public void loginvalidcredintials() throws InterruptedException {
		FlightSearchPage flighsearch = new FlightSearchPage(driver);
		flighsearch.clickbuttonlogin();
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.mobileno("8078608809");
		login.clickotp();

		flighsearch.selectclose();

	}

}
