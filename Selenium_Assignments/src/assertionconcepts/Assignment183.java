package assertionconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/*"Assignment 183
Logout from aamzon assert and verify if test case is pass                        
Here we can check if the username text field is displaying if yes it is pass                "
 * 
 */
public class Assignment183 {
	WebDriver driver;

	@Test
	public void signinandsignout() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement e1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();

		WebElement e2 = driver.findElement(By.linkText("Sign in"));
		Assert.assertEquals(e2.isDisplayed(), true);// here if you mention false TC
		// will pass
		// Assert.assertEquals(false, false);
		// Assert.assertTrue(e2.isDisplayed());
		// Assert.assertFalse(e2.isDisplayed());
		boolean signin = e2.isDisplayed();
		System.out.println(signin);

		e2.click();

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("bhavyasmurthy@gmail.com");
		// email.sendKeys("9646497984");

		WebElement continu = driver.findElement(By.id("continue"));
		continu.click();
		Thread.sleep(1000);

		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Hello@123");

		WebElement e3 = driver.findElement(By.id("signInSubmit"));
		e3.click();
		Thread.sleep(2000);

		WebElement e4 = driver
				.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']"));
		a1.moveToElement(e4).perform();
		Thread.sleep(1000);

		WebElement signout = driver.findElement(By.xpath("//span[.='Sign Out']"));
		a1.moveToElement(signout).perform();
		signout.click();
		Thread.sleep(2000);

		WebElement email1 = driver.findElement(By.xpath("//input[@name='email']"));
		// email1.sendKeys("bhavyasmurthy@gmail.com");
		Assert.assertEquals(email1.isDisplayed(), true);
		// Assert.assertFalse(e2.isDisplayed());

		driver.quit();

	}

}
