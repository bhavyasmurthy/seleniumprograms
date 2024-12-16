package com.grotech.selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 146:launch flipkart search mobiles"
public class Assignment146 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.flipkart.com/");
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("mobiles" + Keys.ENTER);
		// e1.click();

	}

}
