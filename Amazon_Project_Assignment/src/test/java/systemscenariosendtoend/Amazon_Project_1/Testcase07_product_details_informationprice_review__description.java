package systemscenariosendtoend.Amazon_Project_1;

import org.testng.Assert;
import org.testng.annotations.Test;

//Ensure that the product detail page displays all necessary
//information (price, reviews, description).

public class Testcase07_product_details_informationprice_review__description extends Testcase_LaunchandQuitBrowser {
	@Test
	public void testproductdescription() throws InterruptedException {

		HomePage home = new HomePage(driver);
		home.searchproduct("book");

		SearchResultsPage searchresultpage = new SearchResultsPage(driver);
		searchresultpage.selectproduct(0);
		searchresultpage.switchtoproducttab();

		// for product description
		ProductDetailsPage details = new ProductDetailsPage(driver);
		boolean descriptionresult = details.isproductdescriptiondisplayed(driver);
		Assert.assertTrue(descriptionresult);

		boolean reviewresult = details.iscutomerreviewdisplayed();
		Assert.assertTrue(reviewresult, "cutomer review text is not displayed");

		boolean priceresult = details.ispriceviewdisplayed();
		Assert.assertTrue(priceresult, "MRP text is not displayed");
	}
}
