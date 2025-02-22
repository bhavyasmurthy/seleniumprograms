package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.SearchResultsPage;
import org.testng.annotations.Test;

//Check if products can be sorted by relevance, price, rating, etc.
public class Testcase08_productsortbyrelevance_priceandrating extends Testcase_LaunchandQuitBrowser {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void testproductbyfeature() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.searchproduct("shoe");

		SearchResultsPage search = new SearchResultsPage(driver);
		search.sortbyfeaturedropdown(0);
		search.sortbyfeaturedropdown(1);
		search.sortbyfeaturedropdown(2);
		search.sortbyfeaturedropdown(3);

		// search.sortbyfeaturedropdown("Avg. Customer Review");// for visibletext
		// search.sortbyfeaturedropdown("exact-aware-popularity-rank");// for value

	}
}