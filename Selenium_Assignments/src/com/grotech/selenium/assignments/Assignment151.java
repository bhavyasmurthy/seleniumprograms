package com.grotech.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//"Assignment 151:Using action class i.e. 
//How to do drag and drop?  a1.draga      
//How to do double click?        
//How to do right click?        
//automate grotechmind/automate-me/"
public class Assignment151 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.linkText("Automate me"));

		Actions a1 = new Actions(driver);
		a1.scrollToElement(e1).perform();
		Thread.sleep(2000);
		e1.click();
//		a1.dragAndDrop(e1, e2).perform();
//		a1.contextClick(e1).perform();
//		a1.doubleClick(e1).perform();

	}

}
