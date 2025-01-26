package com.grotech.selenium.assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//"""Assignment 165:Using""https://www.amazon.in//"" url search ""shoes"" add cart --.>payment page "
public class Assignment165 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes" + Keys.ENTER);
		Thread.sleep(3000);

		WebElement e2 = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		Thread.sleep(2000);
		e2.click();
		// a[@class='a-link-normal s-no-outline']

		Set<String> parentchildid = driver.getWindowHandles();
		System.out.println(parentchildid);

		Iterator<String> pcid = parentchildid.iterator();
		String pid = pcid.next();
		String c1id = pcid.next();
		System.out.println(pid + "   " + c1id);

		driver.switchTo().window(c1id);
		Thread.sleep(3000);

		WebElement e3 = driver.findElement(By.id("add-to-cart-button"));
		Thread.sleep(2000);
		e3.click();
		Thread.sleep(2000);

		WebElement e4 = driver.findElement(By.name("proceedToRetailCheckout"));
		e4.click();
	}

}
