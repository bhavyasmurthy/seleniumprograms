package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.CartPage;
import org.grotech.assignment.amazon.pages.CheckoutPage;
import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.LoginPage;
import org.grotech.assignment.amazon.pages.Product1Page;
import org.grotech.assignment.amazon.pages.SearchResultsPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// Check if user is able to select each payment method
@Listeners(TestngListener.class)
public class Testcase12_select_payment_methods extends Testcase_LaunchandQuitBrowser {

	@Test(retryAnalyzer = RetryAnalyzer.class, dataProvider = "login data")
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

		// select use this address
		checkoutPage.useThisAddress();
		Thread.sleep(10000);

		if (checkoutPage.isChangePaymentDisplayed()) {
			checkoutPage.clickChangePayment();
		}
		Thread.sleep(6000);

		checkoutPage.selectCreditCardPayment();
		Thread.sleep(6000);
		checkoutPage.selectnetbanking();
		Thread.sleep(6000);
		// checkoutPage.selectupiapp();
		checkoutPage.selectcodapp();
		Thread.sleep(6000);
		checkoutPage.selectemiapp();

	}
}
