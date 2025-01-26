package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.CartPage;
import org.grotech.assignment.amazon.pages.CheckoutPage;
import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.LoginPage;
import org.grotech.assignment.amazon.pages.Product1Page;
import org.grotech.assignment.amazon.pages.SearchResultsPage;
import org.testng.annotations.Test;

// Check if user is able to select each payment method

public class Testcase12_select_payment_methods extends Testcase_LaunchandQuitBrowser {
	@Test
	public void testproductdescription() throws InterruptedException {

		HomePage home = new HomePage(driver);
		home.hoveroverToAccountAndList();
		home.signin();

		LoginPage login = new LoginPage(driver);
		login.setusername();
		login.continue_button();
		login.setpwd();
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

		// select use this address
		checkoutPage.useThisAddress();

		if (checkoutPage.isChangePaymentDisplayed()) {
			checkoutPage.clickChangePayment();
		}

		checkoutPage.selectCreditCardPayment();

	}
}
