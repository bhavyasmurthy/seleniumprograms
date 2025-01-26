package com.grotech.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//"""Assignment 159:Using ""https://www.flipkart.com//"" Hover Over ""Electronics"" then hover over on  ""Camera and accessories "" and click on ""Drone"""

public class Assignment159 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement e1 = driver.findElement(By.xpath("(//span[.='Electronics'])[2]"));

		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		Thread.sleep(2000);

		WebElement e2 = driver.findElement(By.linkText("Cameras & Accessories"));

		a1.moveToElement(e2).perform();
		Thread.sleep(2000);

		WebElement e3 = driver.findElement(By.linkText("Drone"));
		a1.moveToElement(e3).perform();

		e3.click();

	}

}
