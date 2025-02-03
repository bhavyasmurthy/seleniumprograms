package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

//Ensure login fails with incorrect email or password.
public class Testcase03_loginfails_invalid_username_password extends Testcase_LaunchandQuitBrowser {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void invalidloginCredentials() {
		HomePage home = new HomePage(driver);
		home.hoveroverToAccountAndList();
		home.signin();
		LoginPage login = new LoginPage(driver);
		login.invalidUsername();
		login.continue_button();
		Assert.assertTrue(login.isNewToAmazonTextDisplayed());// assertfalse should ask
	}

}
