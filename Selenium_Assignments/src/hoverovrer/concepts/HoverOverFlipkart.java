package hoverovrer.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOverFlipkart {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		WebElement e1 = driver.findElement(By.xpath("(//span[.='Electronics'])[1]"));

		Actions a1 = new Actions(driver);

		a1.moveToElement(e1).perform();
		Thread.sleep(1000);

		WebElement e2 = driver.findElement(By.partialLinkText("Cameras & Acces"));
		a1.moveToElement(e2);

	}

}
