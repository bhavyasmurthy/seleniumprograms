package xpath_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"""Assignment 157:Using""https://www.flipkart.com//"" url automate for the component"" Search""  mobile /any item with relative xpath"
public class Assignment157 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		// WebElement we = driver.findElement(By.name("q"));
		// WebElement we = driver.findElement(By.xpath("(//input)[1]"));//relative xpath
		WebElement we = driver.findElement(By.xpath("//input[@name='q']"));// relative xpath
		Thread.sleep(1000);

		we.sendKeys("mobile" + Keys.ENTER); // same as we.click();
		// driver.quit();

	}

}
