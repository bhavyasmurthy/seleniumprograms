package com.grotech.selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 163:using  ""https://www.flipkart.com//"" 
//seach ""idcard"" .In autosuggestion select 3rd /any result and click it"
public class Assignment163 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("id card");
		Thread.sleep(5000);
		List<WebElement> e2 = driver
				.findElements(By.xpath("//form[@class=\"_2rslOn header-form-search OpXDaO\"]/ul/li"));
		e2.get(2).click();

	}

}
