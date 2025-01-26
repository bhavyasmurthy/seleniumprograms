package com.grotech.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//"Assignment 169
//Write a program with following method isenabled,isselected,isdisabled"

public class Assignment169 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mruty/OneDrive/Documents/grotechminds.html");
		driver.manage().window().maximize();

		WebElement lastName = driver.findElement(By.id("121"));
		if (lastName.isDisplayed() == true && lastName.isEnabled()) {
			lastName.sendKeys("murthy");
		} else {
			System.out.println("Element displayed:" + lastName.isDisplayed());
			System.out.println("Element enabled:" + lastName.isEnabled());
			System.out.println("please check if the component is enabled and is displayed");
		}

		// for radio button
		WebElement female = driver.findElement(By.xpath("(//input)[12]"));
		boolean b1 = female.isSelected();
		System.out.println(b1);

		// for checkbox
		WebElement girl = driver.findElement(By.id("121"));
		boolean b2 = girl.isSelected();
		System.out.println(b2);

	}

}
