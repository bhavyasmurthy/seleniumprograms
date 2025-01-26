package com.grotech.selenium.assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"""Assignment 164:Using""https://www.flipkart.com//"" url search ""shoes"" add in the cart "
public class Assignment164 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("shoes" + Keys.ENTER);
		Thread.sleep(3000);

		WebElement e2 = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		e2.click();
		Thread.sleep(5000);

		Set<String> parentchildid = driver.getWindowHandles();
		System.out.println(parentchildid);

		Iterator<String> pc = parentchildid.iterator();
		String pid = pc.next();
		String child1 = pc.next();

		driver.switchTo().window(child1);

		WebElement e3 = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));

		// button[@class='QqFHMw vslbG+ In9uk2']
		Thread.sleep(4000);
		e3.click();

		Thread.sleep(8000);

		WebElement e4 = driver.findElement(By.xpath("//span[.='Place Order']"));
		e4.click();

	}

}
