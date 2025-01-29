package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.Product1Page;
import org.grotech.assignment.amazon.pages.SearchResultsPage;
import org.testng.annotations.Test;

//Verify that items can be added to the shopping cart from product pages.

public class Testcase09_product_add_to_cart extends Testcase_LaunchandQuitBrowser {
	@Test
	public void testproductdescription() throws InterruptedException {

		HomePage home = new HomePage(driver);
		home.searchproduct("shoe");

		SearchResultsPage searchresultpage = new SearchResultsPage(driver);
		searchresultpage.selectproduct(0);
		searchresultpage.switchtoproducttab();

		// for product description
		Product1Page page = new Product1Page(driver);
		page.clickaddcart();

	}
}
