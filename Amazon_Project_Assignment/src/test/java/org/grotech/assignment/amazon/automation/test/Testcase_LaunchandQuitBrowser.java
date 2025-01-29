package org.grotech.assignment.amazon.automation.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Testcase_LaunchandQuitBrowser {

	public static WebDriver driver;

	@Parameters("browser")

	@BeforeMethod
	public void launch(String nameofbrowser) {
		if (nameofbrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if (nameofbrowser.equals("edge")) {
			driver = new EdgeDriver();
		}
		if (nameofbrowser.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		// driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@AfterMethod
	public void quit() throws InterruptedException {
		// driver.quit();
	}

}
