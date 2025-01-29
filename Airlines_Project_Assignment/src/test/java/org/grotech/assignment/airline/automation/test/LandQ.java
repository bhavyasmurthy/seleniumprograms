package org.grotech.assignment.airline.automation.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LandQ {
	public WebDriver driver;

	@BeforeMethod
	public void launch() {
		driver = new EdgeDriver();
		driver.get("https://www.airindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void quit() {
		// driver.quit();

	}

}
