package com.grotech.selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Asssignment 161:got to ""Grotechminds.com/blog/"" and Search ""Selenium"" .In autosuggestion select 3rd result"
public class Assignment161 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/blogs/");
		driver.manage().window().maximize();

		WebElement e1 = driver.findElement(By.name("phrase"));
		e1.sendKeys("Selenium");

		Thread.sleep(15000);
		List<WebElement> e2 = driver.findElements(By.xpath("(//div[@class='results'])[2]/div/div"));

		int count = e2.size();
		System.out.println(count);

		e2.get(2).click();

	}

}
