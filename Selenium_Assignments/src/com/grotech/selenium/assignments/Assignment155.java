package com.grotech.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//"Assignment 155
//Using ""grotechminds.html"" url automate all the components present using Relative xpath locator"
public class Assignment155 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mruty/OneDrive/Documents/grotechminds.html");
		driver.manage().window().maximize();

		WebElement uName = driver.findElement(By.xpath("(//input)[1]"));
		// WebElement uName = driver.findElement(By.xpath("(/html/body/input)[1]"));

		uName.sendKeys("Bhavya");

		WebElement hint = driver.findElement(By.xpath("(//input)[2]"));

		// WebElement hint = driver.findElement(By.xpath("(//html/body/input)[2]"));
		hint.sendKeys("hello");

		WebElement pwd = driver.findElement(By.xpath("(//html/body/input)[3]"));

		// WebElement hint = driver.findElement(By.xpath("(//input)[3]"));
		pwd.sendKeys("hello@@");

		WebElement submit1 = driver.findElement(By.xpath("(//input)[6]"));
		// WebElement submit1 =
		// driver.findElement(By.xpath("(//html/body/form/input)[3]"));
		// submit1.click();

		WebElement girl = driver.findElement(By.xpath("(//html/body/form/input)[5]"));
		girl.click();

		WebElement female = driver.findElement(By.xpath("(//html/body/input)[5]"));
		female.click();

		WebElement religion = driver.findElement(By.xpath("//html/body/select"));
		Select s1 = new Select(religion);
		s1.selectByValue("3");
		Thread.sleep(1000);

		s1.selectByIndex(0);
		Thread.sleep(1000);
		s1.selectByVisibleText("Christian");

	}

}
