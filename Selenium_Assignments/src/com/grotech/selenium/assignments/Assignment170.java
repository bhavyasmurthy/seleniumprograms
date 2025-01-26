package com.grotech.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 170
//Write a program to aumate the website where right click does not work.https://retail.onlinesbi.sbi/retail/login.htm: Go to the site and provide user name and pwd using F12: "
public class Assignment170 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		e1.click();

		WebElement e2 = driver.findElement(By.xpath("//input[@id='username']"));
		// (By.id("username"));
		e2.sendKeys("Bhavya");

		WebElement e3 = driver.findElement(By.id("label2"));
		e3.sendKeys("hello@1$");

		WebElement e4 = driver.findElement(By.id("Button2"));
		e4.click();

	}

}
