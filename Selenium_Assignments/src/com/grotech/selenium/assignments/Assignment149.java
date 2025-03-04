package com.grotech.selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 149:Using Linktext&&partial link text automate amazon->clcik on customer service"
public class Assignment149 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		WebElement e1 = driver.findElement(By.linkText("Customer Service"));
//		e1.click();
//		driver.quit();

		WebElement e2 = driver.findElement(By.partialLinkText("Serv"));
		e2.click();
		driver.quit();

	}

}
