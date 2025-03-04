package com.grotech.selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 160:Using""https://grotechminds.com/javascript-popup/"" url handle the java script pop up"
public class Assignment160 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//button[.='Click ']"));
		e1.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();

	}

}
