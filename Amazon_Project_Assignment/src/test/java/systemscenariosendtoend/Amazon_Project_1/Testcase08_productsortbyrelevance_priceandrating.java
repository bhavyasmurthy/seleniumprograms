package systemscenariosendtoend.Amazon_Project_1;

import org.testng.annotations.Test;

//Check if products can be sorted by relevance, price, rating, etc.
public class Testcase08_productsortbyrelevance_priceandrating extends Testcase_LaunchandQuitBrowser {
	@Test
	public void testproductbyfeature() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.searchproduct("shoe");
		Thread.sleep(6000);
		home.sortbyfeaturedropdown(2);
		// home.sortbynewerstarrival();

	}
}