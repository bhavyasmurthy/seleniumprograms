package assertionconcepts;
/* "Assignment 182
launch amaozn->search a aproduct->assert and verify if test case is pass                        
""List<Webelement> l=driver.fes(by.xpath(""""""""));
Assert.assertequals(l.size()>20,true);""  
 * 
 */

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment182 {
	WebDriver driver;

	@Test
	public void searchproduct() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("mobile" + Keys.ENTER);
		Thread.sleep(5000);

		Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.amazon.in");

		List<WebElement> e1 = driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));

		Thread.sleep(3000);
		int count = e1.size();
		System.out.println(count);

		Assert.assertEquals(count > 20, true);
		// Assert.assertTrue(count > 20);
		Assert.assertSame(count > 20, true);

		driver.quit();

	}

}
