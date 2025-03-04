package org.grotech.assignment.airline.automation.test;

import org.grotech.assignment.airline.pages.FlightSearchPage;
import org.grotech.assignment.airline.pages.LoginPage;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Testcase03_login_invalidcredentials_ensureproper_errormessagesaredisplayed
		extends Testcase_LaunchandQuitBrowser {
	@Test
	public void login() throws InterruptedException {
		FlightSearchPage flighsearch = new FlightSearchPage(driver);
		flighsearch.clickbuttonlogin();
		Thread.sleep(2000);
		LoginPage login = new LoginPage(driver);
		login.mobileno("765768");
		login.clickotp();
		// login.verifyinvalidcredential();
		boolean result = login.verifyinvalidcredential();

		Assert.assertTrue(result);
		flighsearch.selectclose();

	}

}
