package com.grotech.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"""Assignment 157
//Using""https://www.flipkart.com//"" url automate for the component"" Search""  mobile /any item with relative xpath"
public class Assignment157 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
//All 3 are xpaths to search shoe
		WebElement e1 = driver.findElement(By.xpath("(//input)[1]"));
		WebElement e2 = driver.findElement(By.xpath("//input[@name='q']"));
		WebElement e3 = driver.findElement(By.name("q"));

		e3.sendKeys("shoe" + Keys.ENTER);

	}

}
