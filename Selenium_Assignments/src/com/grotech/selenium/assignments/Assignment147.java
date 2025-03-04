package com.grotech.selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

// "Assignment 147:Automate registartion pageof automate me section
//https://grotechminds.com/automate-me/"
public class Assignment147 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// driver.findElement(By.id("chat-bot-message-close")).click();

		WebElement fname = driver.findElement(By.id("fname"));
		fname.sendKeys("Bhavya");

		WebElement lname = driver.findElement(By.id("lname"));
		lname.sendKeys("S Murthy");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("bhavyasmurthy@gmail.com");

		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("1#7gsd");

		WebElement skills = driver.findElement(By.id("Skills"));
		Select s2 = new Select(skills);
		s2.selectByVisibleText("Technical Skills");

		WebElement techSkills = driver.findElement(By.id("technicalskills"));
		Select s1 = new Select(techSkills);
		s1.selectByValue("Python"); // byvalue
		Thread.sleep(1000);
		s1.selectByVisibleText("Core Java");
		Thread.sleep(1000);

		s1.selectByIndex(5);

		WebElement country = driver.findElement(By.id("Country"));
		Select s3 = new Select(country);
		s3.selectByValue("India"); // byvalue
		Thread.sleep(1000);
		s3.selectByVisibleText("Germany");
		Thread.sleep(1000);

		s3.selectByIndex(13);

		Thread.sleep(2000);

		WebElement presentAddr = driver.findElement(By.id("Present-Address"));

		presentAddr.sendKeys(
				"Platinum Gardenia Apartment, B-121 B2 block, JP Nagar 8th phase, Kembathalli road, near KRB petrol bunk");
		presentAddr.sendKeys(Keys.CONTROL + "A");
		presentAddr.sendKeys(Keys.CONTROL + "C");

		WebElement permanentAddr = driver.findElement(By.id("Permanent-Address"));
		permanentAddr.sendKeys(Keys.CONTROL + "V");
		WebElement pincode = driver.findElement(By.id("Pincode"));
		pincode.sendKeys("560083");
		WebElement religion = driver.findElement(By.id("Relegion"));
		Select s5 = new Select(religion);
		s5.selectByIndex(3);
		Thread.sleep(1000);
		s5.selectByValue("Hindu");
		Thread.sleep(1000);
		s5.selectByVisibleText("Jain");
		WebElement fileupload = driver.findElement(By.id("file"));
		fileupload.sendKeys("C:\\Users\\mruty\\OneDrive\\Documents\\grotechminds.html");
		// fileupload.sendKeys("C:\\Users\\mruty\\Downloads\\New Text Document.txt");
		WebElement relocate = driver.findElement(By.id("relocate"));
		boolean b1 = relocate.isSelected();
		if (!b1) {
			relocate.click();
		}
		// select checkbox in either ways above or below relocate
		/*
		 * if (relocate.isDisplayed() && relocate.isEnabled()) { relocate.click(); }
		 */

		// WebElement submitbtn = driver.findElement(By.linkText("Submit"));

		// submitbtn.click();
		// driver.quit();

	}

}
