package systemscenariosendtoend.Amazon_Project_1;

import org.testng.Assert;
import org.testng.annotations.Test;

//Reach till cart page without login in amazon application
public class Testcase15_Reach_cartpage_withoutlogin extends Testcase_LaunchandQuitBrowser {
	@Test
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
