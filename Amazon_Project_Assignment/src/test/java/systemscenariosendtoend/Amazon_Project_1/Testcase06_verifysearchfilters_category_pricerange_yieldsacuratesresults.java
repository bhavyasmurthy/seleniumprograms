package systemscenariosendtoend.Amazon_Project_1;

import org.testng.annotations.Test;

//Verify that searching with filters (e.g., category, price range) yields accurate results.
public class Testcase06_verifysearchfilters_category_pricerange_yieldsacuratesresults
		extends Testcase_LaunchandQuitBrowser {
	@Test
	public void testfilterproduct() {
		HomePage home = new HomePage(driver);
		home.searchproduct("shoe");

		FilterpPage filter = new FilterpPage(driver);
		// filter.selectproductsize(driver);
		filter.selectproduct1checkbox(driver);
		filter.chooseproductcolor(driver);

	}

}
