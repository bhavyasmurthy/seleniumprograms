package rightclick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//1. Write a code to rightclick on Practicelink1  and choose Option 1
public class Practice_Link1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://grotechminds.com/rightclick/");
		WebElement e1 = driver.findElement(By.linkText("Practice Link1"));
		Actions a1 = new Actions(driver);
		a1.contextClick(e1).perform();

	}

}
