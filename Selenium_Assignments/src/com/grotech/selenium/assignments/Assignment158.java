package com.grotech.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"""Assignment 158
//Using ""https://www.google.com//"" url automate for the component"" Search""  with relative xpath"
public class Assignment158 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement e1 = driver.findElement(By.xpath("(//textarea)[1]"));
		e1.sendKeys("india" + Keys.ENTER);

	}

}
