package com.grotech.selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//"Assignment 167

//Create Maven Project Open browser in Headless mode.Print all the link and Link text from google.com

public class Assignment167 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		Thread.sleep(2000);

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement e1 = alllinks.get(i);
			String link = e1.getAttribute("href");
			String txt = e1.getText();
			System.out.println(link);
			System.out.println(txt);

		}

	}

}
