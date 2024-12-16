package com.grotech.selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment145: launch youtube> search grotechminds"
public class Assignment145 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement e1 = driver.findElement(By.name("search_query"));
		e1.sendKeys("grotechminds" + Keys.ENTER);

	}

}
