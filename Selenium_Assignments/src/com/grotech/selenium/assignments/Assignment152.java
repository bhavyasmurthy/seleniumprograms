package com.grotech.selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//"Assignment 152:Try to write name in the text box and double click(Text box)"
public class Assignment152 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement e1 = driver.findElement(By.id("fname"));
		e1.sendKeys("Bhavya");
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();

	}

}
