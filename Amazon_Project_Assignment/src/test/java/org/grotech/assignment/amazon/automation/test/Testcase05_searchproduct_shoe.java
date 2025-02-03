package org.grotech.assignment.amazon.automation.test;

import static org.testng.Assert.assertTrue;

import org.grotech.assignment.amazon.pages.HomePage;
import org.grotech.assignment.amazon.pages.SearchResultsPage;
import org.testng.annotations.Test;

//Test searching for products using its name like shoe

public class Testcase05_searchproduct_shoe extends Testcase_LaunchandQuitBrowser {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void searchProduct1() {
		HomePage home = new HomePage(driver);
		SearchResultsPage searchresultpage = new SearchResultsPage(driver);
		home.searchproduct("shoe");
		boolean output = searchresultpage.verifysearchresultmessage("shoe");
		assertTrue(output);

		home.clearsearchfield();
		home.searchproduct("bag");
		output = searchresultpage.verifysearchresultmessage("bag");
		assertTrue(output);

		// home
	}
}
