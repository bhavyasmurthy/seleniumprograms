package com.grotech.selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//"""Assignment 156
//Using ""https://www.amazon.in/"" url automate for the component Search and Sign-in with relative xpath"
public class Assignment156 {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		WebElement e1 = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));

		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();

		WebElement e2 = driver.findElement(By.linkText("Sign in"));
		e2.click();

		WebElement email = driver.findElement(By.xpath("(//input)[7]"));
		email.sendKeys("bhavyasmurthy@gmail.com");

		WebElement continu = driver.findElement(By.id("continue"));
		continu.click();

		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("***@#12***");

		WebElement e3 = driver.findElement(By.id("signInSubmit"));
		e3.click();

		WebElement e4 = driver.findElement(By.id("twotabsearchtextbox"));
		e4.sendKeys("Bangalore" + Keys.ENTER);

	}

}
