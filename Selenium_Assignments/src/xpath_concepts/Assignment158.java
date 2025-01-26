package xpath_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"""Assignment 158:Using""https://www.google.com//"" url automate for the component"" Search""  with relative xpath"
public class Assignment158 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
//		WebElement e1 = driver.findElement(By.xpath("//textarea[@name='q']"));
		WebElement e1 = driver.findElement(By.xpath("//textarea[1]"));

		e1.sendKeys("Bangalore");
		e1.click();

	}

}
