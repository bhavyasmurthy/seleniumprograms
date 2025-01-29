package org.grotech.assignment.airline.automation.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testcase_LaunchandQuitBrowser {

	public static WebDriver driver;

	@BeforeMethod
	public void launch() {
		driver = new EdgeDriver();
		driver.get("https://www.airindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterMethod
	public void quit() throws InterruptedException {
		// driver.quit();
	}

}
