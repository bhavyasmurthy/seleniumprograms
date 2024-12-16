package com.grotech.selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//"""Assignment 153:Using Select class automate the drop down of
// ""Select Skill"" 
//"" select Country""       
//""Select Religion""      
//Url:""https://grotechminds.com/registration/"""
public class Assignment153 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("Skills"));
		Select s1 = new Select(e1);
		s1.selectByValue("none");
		Thread.sleep(1000);
		s1.selectByVisibleText("Technical Skills");
		Thread.sleep(1000);
		s1.selectByIndex(2);

		WebElement e2 = driver.findElement(By.id("Country"));
		Select s2 = new Select(e2);
		s2.selectByValue("Malaysia");
		Thread.sleep(1000);
		s2.selectByVisibleText("India");
		Thread.sleep(1000);
		s2.selectByIndex(12);

		WebElement e3 = driver.findElement(By.id("Relegion"));
		Select s3 = new Select(e3);
		s3.selectByValue("Jews");
		Thread.sleep(1000);
		s3.selectByIndex(5);
		Thread.sleep(1000);
		s3.selectByVisibleText("Hindu");

		// driver.quit();

	}

}
