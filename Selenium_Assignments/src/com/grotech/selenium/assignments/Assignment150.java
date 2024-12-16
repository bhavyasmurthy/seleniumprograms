package com.grotech.selenium.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 150:Using Navigation methods in Selenium automate amazon

//driver.navigate.to(URL)                
//driver.navigate.back()                
//driver.navigate.forward()                
//driver.navigate.refresh();                "
public class Assignment150 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().forward();
		Thread.sleep(1000);

		driver.navigate().refresh();

	}

}
