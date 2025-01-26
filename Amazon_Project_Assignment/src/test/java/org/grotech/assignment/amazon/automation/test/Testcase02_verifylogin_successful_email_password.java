package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

//Verify login is successful with correct email and password.
public class Testcase02_verifylogin_successful_email_password extends Testcase_LaunchandQuitBrowser {
	@Test
	public void verifylogincredentilas() {
		HomePage home = new HomePage(driver);
		home.hoveroverToAccountAndList();
		home.signin();

		LoginPage login = new LoginPage(driver);
		login.setusername();
		login.continue_button();
		login.setpwd();
		login.signin();
		// Assert.assertEquals(driver.i, null);
		Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.amazon.in/");
	}

}
