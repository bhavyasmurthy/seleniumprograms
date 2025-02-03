package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.ProductDetailsPage;
import org.grotech.assignment.amazon.pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

//Ensure that the product detail page displays all necessary
//information (price, reviews, description).

public class Testcase07_product_details_informationprice_review__description extends Testcase_LaunchandQuitBrowser {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testproductdescription() throws InterruptedException {

		HomePage home = new HomePage(driver);
		home.searchproduct("table");

		SearchResultsPage searchresultpage = new SearchResultsPage(driver);
		searchresultpage.selectproduct(0);
		searchresultpage.switchtoproducttab();

		ProductDetailsPage details = new ProductDetailsPage(driver);

		boolean priceresult = details.ispriceviewdisplayed();
		Assert.assertTrue(priceresult, "MRP text is not displayed");

		// for product description
		boolean descriptionresult = details.isproductdescriptiondisplayed(driver);
		Assert.assertTrue(descriptionresult);

		boolean reviewresult = details.iscutomerreviewdisplayed();
		Assert.assertTrue(reviewresult, "cutomer review text is not displayed");

	}
}
