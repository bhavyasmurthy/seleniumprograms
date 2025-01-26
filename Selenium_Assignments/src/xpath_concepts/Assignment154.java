package xpath_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//"Assignment 154
//Using ""grotechminds.html"" url automate all the components present using Absolute xpath locator"
public class Assignment154 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/mruty/OneDrive/Documents/grotechminds.html");
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("Bhavya");
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("name");
		WebElement pwd = driver.findElement(By.xpath("(/html/body/input)[3]"));
		pwd.sendKeys("$$$$$$");
		WebElement fname = driver.findElement(By.xpath("((html/body/form)[1]/input)[1]"));
		fname.sendKeys("Bhavya");
		// WebElement lname =
		// driver.findElement(By.xpath("((html/body/form)[1]/input)[2]")); disabled
		// textfield
		// lname.sendKeys("S Murthy");
		// WebElement submit1 =
		// driver.findElement(By.xpath("((html/body/form)[1]/input)[3]"));
		// submit1.click();
		WebElement boy = driver.findElement(By.xpath("((html/body/form)[2]/input)[1]"));
		boy.click();
		WebElement girl = driver.findElement(By.xpath("((html/body/form)[2]/input)[2]"));
		girl.click();
		WebElement baby = driver.findElement(By.xpath("((html/body/form)[2]/input)[3]"));
		baby.click();
		// WebElement submit2 =
		// driver.findElement(By.xpath("((html/body/form)[2]/input)[4]"));
		// submit2.click();
		WebElement male = driver.findElement(By.xpath("(/html/body/input)[4]"));
		male.click();
		WebElement female = driver.findElement(By.xpath("(/html/body/input)[5]"));
		female.click();
		WebElement relocate = driver.findElement(By.xpath("/html/body/input[6]"));
		relocate.click();
		// WebElement link1 = driver.findElement(By.xpath("(/html/body/a)"));// ready to
		// relocate link
		// link1.click();

		WebElement religion = driver.findElement(By.xpath("(/html/body/select)[1]"));// ready to relocate link
		religion.click();
		Select s1 = new Select(religion);
		s1.selectByIndex(2);
		Thread.sleep(1000);
		s1.selectByValue("4");
		s1.selectByVisibleText("Relegion 3");

	}

}
