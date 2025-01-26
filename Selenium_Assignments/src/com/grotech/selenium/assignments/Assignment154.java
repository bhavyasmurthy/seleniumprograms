package com.grotech.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//"Assignment 154:Using ""grotechminds.html"" url automate all the components present using Absolute xpath locator"
public class Assignment154 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mruty/OneDrive/Documents/grotechminds.html");
		driver.manage().window().maximize();

		WebElement uName = driver.findElement(By.xpath("(/html/body/input)[1]"));
		uName.sendKeys("Bhavya");

		WebElement hint = driver.findElement(By.xpath("(//html/body/input)[2]"));
		hint.sendKeys("hello");

		WebElement pwd = driver.findElement(By.xpath("(//html/body/input)[3]"));
		pwd.sendKeys("hello@@");

		WebElement fn = driver.findElement(By.xpath("(//html/body/form/input)[1]"));
		fn.sendKeys("bhavya");

		WebElement submit1 = driver.findElement(By.xpath("(//html/body/form/input)[3]"));
		// submit1.click();

		WebElement girl = driver.findElement(By.xpath("(//html/body/form/input)[5]"));
		girl.click();
		WebElement boy = driver.findElement(By.xpath("(//html/body/form/input)[4]"));
		boy.click();
		WebElement baby = driver.findElement(By.xpath("(//html/body/form/input)[6]"));
		baby.click();

		WebElement female = driver.findElement(By.xpath("(//html/body/input)[5]"));
		female.click();
		WebElement male = driver.findElement(By.xpath("(//html/body/input)[4]"));
		male.click();

		WebElement relocate = driver.findElement(By.xpath("(//html/body/input)[6]"));
		relocate.click();

		// dropdown
		WebElement dropdowns = driver.findElement(By.id("Relegion"));
		Select s1 = new Select(dropdowns);
		s1.selectByValue("3");
		Thread.sleep(2000);
		s1.selectByIndex(2);
		Thread.sleep(2000);

		s1.selectByVisibleText("Hindu");

	}

}
