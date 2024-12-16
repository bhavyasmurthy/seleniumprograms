package com.grotech.selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//"Assignment 144:launch amazon and try automate reg form"
public class Assignment144 {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.amazon.in/");

		WebElement e1 = driver.findElement(By.linkText("Start here."));

		e1.click();
		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("Bhavya S murthy");
		WebElement mobilenum = driver.findElement(By.id("ap_phone_number"));
		mobilenum.sendKeys("9611700318");

		WebElement pwd = driver.findElement(By.id("ap_password"));
		pwd.sendKeys("********");

		WebElement verify = driver.findElement(By.id("continue"));
		verify.click();
		// driver.quit();

	}

}
