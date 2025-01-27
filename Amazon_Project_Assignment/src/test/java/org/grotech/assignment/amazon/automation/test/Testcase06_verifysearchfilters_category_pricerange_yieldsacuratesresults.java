package org.grotech.assignment.amazon.automation.test;

import org.grotech.assignment.amazon.pages.FilterpPage;
import org.grotech.assignment.amazon.pages.HomePage;
import org.testng.annotations.Test;

//Verify that searching with filters (e.g., category, price range) yields accurate results.
public class Testcase06_verifysearchfilters_category_pricerange_yieldsacuratesresults
		extends Testcase_LaunchandQuitBrowser {
	@Test
	public void testfilterproduct() {
		HomePage home = new HomePage(driver);
		home.searchproduct("puma shoes for woman");

		FilterpPage filter = new FilterpPage(driver);
		filter.movePriceRangeBy(100);
		filter.selectProductSize(9);
		filter.selectCategory("Shoes");
		filter.selectCategory("Women's Shoes");
		filter.selectCategory("10% Off or more");

	}

}
