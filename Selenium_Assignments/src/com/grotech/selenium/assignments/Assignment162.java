package com.grotech.selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Asssignment 162:got to"" https://www.1mg.com/?wpsrc=Google+Organic+Search and Search ""dolo"" or any medicine .
//In autosuggestion select 7th result."

public class Assignment162 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.1mg.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e1 = driver.findElement(By.name("name"));
		e1.sendKeys("dolo");
		Thread.sleep(8000);

		List<WebElement> e2 = driver
				.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
		int count = e2.size();
		System.out.println(count);
		e2.get(6).click();

	}

}
