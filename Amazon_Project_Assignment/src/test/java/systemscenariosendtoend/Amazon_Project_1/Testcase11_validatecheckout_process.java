package systemscenariosendtoend.Amazon_Project_1;

import org.testng.annotations.Test;

//Validate the entire checkout process, including address selection,
//payment method selection,and order review.

public class Testcase11_validatecheckout_process extends Testcase_LaunchandQuitBrowser {
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
		checkoutPage.chooseAddress(1);
		checkoutPage.clickChangePayment();

		// select use this address
		checkoutPage.useThisAddress();

		// select use this payment
		checkoutPage.useThisPayment();

		// write code to review order

	}
}
