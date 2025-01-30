package org.grotech.assignment.amazon.automation.test;

import java.time.Duration;

import org.grotech.assignment.amazon.pages.DataProviderClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testcase_LaunchandQuitBrowser extends DataProviderClass {

	public static WebDriver driver;

	@BeforeMethod
	public void launch() {
		// (String nameofbrowser) {
//		if (nameofbrowser.equals("chrome")) {
//			driver = new ChromeDriver();
//		}
//		if (nameofbrowser.equals("edge")) {
//			driver = new EdgeDriver();
//		}
//		if (nameofbrowser.equals("firefox")) {
//			driver = new FirefoxDriver();
//		}

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
