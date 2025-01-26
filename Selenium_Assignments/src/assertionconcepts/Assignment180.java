package assertionconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

// "Assignment 180
//Login to amazon with right credenetails.""by usisng the presence of the component
//e1.isdiaplyed Assert.assertEquals(e1.isdplayed,true);"
//
public class Assignment180 {
	WebDriver driver;

	@Test
	public void amazonlogin() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement e1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		// Assert.assertEquals(e1.isDisplayed(), true);

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
		Assert.assertNotEquals(!email.isDisplayed(), true); // notequals false,true
		email.sendKeys("bhavyasmurthy@gmail.com");
		// email.sendKeys("9646497984");

		WebElement continu = driver.findElement(By.id("continue"));
		continu.click();
		Thread.sleep(1000);

		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("$&%%&&");

		WebElement e3 = driver.findElement(By.id("signInSubmit"));
		e3.click();

		WebElement searchtextbox = driver.findElement(By.id("twotabsearchtextbox"));
		// searchtextbox.sendKeys("india");
		Assert.assertEquals(searchtextbox.isDisplayed(), true);
		driver.quit();

	}

}
