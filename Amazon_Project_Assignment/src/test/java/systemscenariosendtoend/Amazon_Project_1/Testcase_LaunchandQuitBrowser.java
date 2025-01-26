package systemscenariosendtoend.Amazon_Project_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Testcase_LaunchandQuitBrowser {
	WebDriver driver;

	@BeforeMethod
	public void launch() {
		driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@AfterMethod
	public void quit() throws InterruptedException {
		// driver.quit();
	}

}
