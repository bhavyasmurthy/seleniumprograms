package org.grotech.assignment.airline.automation.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testcase_LaunchandQuitBrowser {

	public static WebDriver driver;

	public static WebDriver initialize() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		return driver;
	}

	@BeforeMethod
	public void setup() {
		driver = initialize();
		driver.get("https://www.cleartrip.com/");
		driver.navigate().refresh();
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}

}
