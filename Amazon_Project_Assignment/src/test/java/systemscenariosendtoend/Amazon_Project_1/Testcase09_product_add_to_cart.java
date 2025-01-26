package systemscenariosendtoend.Amazon_Project_1;

import org.testng.annotations.Test;

//Ensure that the product detail page displays all necessary
//information (price, reviews, description).

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
