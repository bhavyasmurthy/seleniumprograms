package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.CartPage;
import org.grotech.assignment.amazon.pages.CheckoutPage;
import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.LoginPage;
import org.grotech.assignment.amazon.pages.Product1Page;
import org.grotech.assignment.amazon.pages.SearchResultsPage;
import org.testng.annotations.Test;

//Validate the entire checkout process, including address selection,
//payment method selection,and order review.

public class Testcase11_validatecheckout_process extends Testcase_LaunchandQuitBrowser {

	@Test(dataProvider = "login data")
	public void testproductdescription(String username, String password) throws InterruptedException {

		HomePage home = new HomePage(driver);
		home.hoveroverToAccountAndList();
		home.signin();

		LoginPage login = new LoginPage(driver);
		login.setusername(username);
		login.continue_button();
		login.setpwd(password);
		login.signin();

		home.searchproduct("shoe");
		SearchResultsPage searchresultpage = new SearchResultsPage(driver);
		searchresultpage.selectproduct(0);
		searchresultpage.switchtoproducttab();

		// for product description
		Product1Page page = new Product1Page(driver);
		page.clickaddcart();
		page.cickgotocart();

		CartPage cartPage = new CartPage(driver);
		cartPage.proceedcheckout();

		CheckoutPage checkoutPage = new CheckoutPage(driver);
		if (checkoutPage.isChangeAddressDisplayed()) {
			checkoutPage.clickChangeAddress();
		}
		checkoutPage.chooseAddress(1);
		// select use this address

		checkoutPage.useThisAddress();

		checkoutPage.clickChangePayment();

		// select use this payment
		checkoutPage.useThisPayment();

		// write code to review order

	}
}
