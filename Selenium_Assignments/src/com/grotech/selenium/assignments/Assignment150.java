package com.grotech.selenium.assignments;

import java.time.Duration;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

	}

}
