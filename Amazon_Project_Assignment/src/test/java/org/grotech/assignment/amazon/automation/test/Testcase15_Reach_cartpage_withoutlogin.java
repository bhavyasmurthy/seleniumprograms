package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.CartPage;
import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.Product1Page;
import org.grotech.assignment.amazon.pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

//Reach till cart page without login in amazon application
public class Testcase15_Reach_cartpage_withoutlogin extends Testcase_LaunchandQuitBrowser {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testproductaddtocart() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.searchproduct("shoe");

		SearchResultsPage searchresultpage = new SearchResultsPage(driver);
		searchresultpage.selectproduct(0);
		searchresultpage.switchtoproducttab();

		// for product description
		Product1Page page = new Product1Page(driver);
		page.clickaddcart();
		page.cickgotocart();

		CartPage cartpage = new CartPage(driver);
		boolean visibility = cartpage.isshoppingcarttextvisible();
		Assert.assertTrue(visibility, "cart page text header not displyed");

	}

}
