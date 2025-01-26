package assertionconcepts;
//"Assignment 181

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//Launch Google->Search Something""Assert.assertnotequals(driver.cureentURL(),""""https://www.google.com"""");

//Assert.assertnotequals(driver.gettitle(),""""Google"""");"""
public class Assignment181 {
	WebDriver driver;

	@Test
	public void search() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		Assert.assertEquals(driver.getTitle(), "Google");

		search.sendKeys("India" + Keys.ENTER);

		Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.google.com");
		Assert.assertNotEquals(driver.getTitle(), "Google");
	}

}
