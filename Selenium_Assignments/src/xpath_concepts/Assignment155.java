package xpath_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//"Assignment 155:Using""grotechminds.html""url automate all the components present using Relative xpath locator"
public class Assignment155 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/mruty/OneDrive/Documents/grotechminds.html");
		WebElement username = driver.findElement(By.xpath("(//input)[1]"));
		username.sendKeys("Bhavya");
		WebElement hint = driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("name");
		WebElement pwd = driver.findElement(By.xpath("(//input)[3]"));
		pwd.sendKeys("$$$$$$");
		WebElement fname = driver.findElement(By.xpath("(//input)[4]"));
		fname.sendKeys("Bhavya");
		// WebElement lname =
		// driver.findElement(By.xpath("((html/body/form)[1]/input)[2]")); disabled
		// textfield
		// lname.sendKeys("S Murthy");
		// WebElement submit1 =
		// driver.findElement(By.xpath("(//input)[3]"));
		// submit1.click();
		WebElement boy = driver.findElement(By.xpath("(//input)[7]"));
		boy.click();
		WebElement girl = driver.findElement(By.xpath("(//input)[8]"));
		girl.click();
		WebElement baby = driver.findElement(By.xpath("(//input)[9]"));
		baby.click();
		// WebElement submit2 =
		// driver.findElement(By.xpath("((html/body/form)[2]/input)[4]"));
		// submit2.click();
		WebElement male = driver.findElement(By.xpath("(//input)[11]"));
		male.click();
		WebElement female = driver.findElement(By.xpath("(//input)[12]"));
		female.click();
		WebElement relocate = driver.findElement(By.xpath("(//input)[13]"));
		relocate.click();
		// WebElement link1 = driver.findElement(By.xpath("(//a)[2]"));// ready to
		// relocate link
		// link1.click();

		WebElement religion = driver.findElement(By.xpath("(//select)[1]"));// religion dropdown
		religion.click();
		Select s1 = new Select(religion);
		s1.selectByIndex(2);

	}

}
