package doubleclickexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/left-double-click/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		WebElement e1 = driver.findElement(By.className("popup2"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();
		Thread.sleep(1000);
		driver.quit();

	}

}
