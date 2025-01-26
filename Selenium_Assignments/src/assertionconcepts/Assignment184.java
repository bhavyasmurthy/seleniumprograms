package assertionconcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

/*"Assignment 184
After placing the order in amazon product verify if testcase is pass.
verify the title message is "thankyou for placing order".


Assert.assertEquals("e1.getTitle", "thankyou");"
 * 
 */
public class Assignment184 {
	WebDriver driver;

	@Test
	public void search() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchtxt = driver.findElement(By.id("twotabsearchtextbox"));
		searchtxt.sendKeys("shoe" + Keys.ENTER);
		Thread.sleep(5000);

		WebElement e1 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[10]"));
		Thread.sleep(10000);
		e1.click();

		Set<String> parentchildid = driver.getWindowHandles();
		System.out.println(parentchildid);

		Iterator<String> pcid = parentchildid.iterator();
		String pid = pcid.next();
		String child1 = pcid.next();

		driver.switchTo().window(child1);

		WebElement e2 = driver.findElement(By.id("add-to-cart-button"));
		Thread.sleep(2000);
		e2.click();

		WebElement e3 = driver.findElement(By.name("proceedToRetailCheckout"));
		e3.click();
		// Signin amazon to buy the product added to cart
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("bhavyasmurthy@gmail.com");
		WebElement contin = driver.findElement(By.id("continue"));
		contin.click();
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Hello@123");
		WebElement cont = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		cont.click();
		Thread.sleep(2000);
		/*
		 * WebElement paymentmethod =
		 * driver.findElement(By.id("checkout-secondary-continue-button-id-announce"));
		 * Thread.sleep(1000); paymentmethod.click(); Thread.sleep(2000);
		 */

		WebElement useaddress = driver.findElement(By.className("a-button-input"));
		useaddress.click();
		// WebElement

		// Assert.assertEquals("e1.getTitle", "thankyou");

	}

}
