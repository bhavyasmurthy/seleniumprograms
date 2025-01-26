package org.grotech.assignment.amazon.automation.test;
//Go to orders page and click on your last ordered product and give 5 star ratings

import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.LoginPage;
import org.grotech.assignment.amazon.pages.OrderPage;
import org.grotech.assignment.amazon.pages.ReviewPage;
import org.testng.annotations.Test;

public class Testcase14_orderspage_clickonlastorderedproduct_give5starrating extends Testcase_LaunchandQuitBrowser {

	@Test
	public void give5starforlastorderedproduct() {

		HomePage home = new HomePage(driver);
		home.hoveroverToAccountAndList();
		home.signin();

		LoginPage login = new LoginPage(driver);
		login.setusername();
		login.continue_button();
		login.setpwd();
		login.signin();

		HomePage homePage = new HomePage(driver);
		homePage.hoveroverToAccountAndList();
		homePage.clickyourorders();

		OrderPage orderpage = new OrderPage(driver);
		orderpage.preivousorder(3);

		ReviewPage reviewpage = new ReviewPage(driver);
		reviewpage.clickWriteProductReview();
		reviewpage.give5starrating();

	}

}
