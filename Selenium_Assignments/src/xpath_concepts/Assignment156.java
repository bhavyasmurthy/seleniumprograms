package xpath_concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0
//	"Assignment 156:Using ""https://www.amazon.in/"" url automate for the component Search and Sign-in with relative xpath"
public class Assignment156 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signin1 = driver.findElement(By.xpath("(//span)[17]"));
		signin1.click();
		WebElement email = driver.findElement(By.xpath("(//input)[7]"));
		email.sendKeys("bhavyasmurthy@gmail.com");
		WebElement Continue = driver.findElement(By.xpath("(//input)[10]"));
		Continue.click();
		WebElement password = driver.findElement(By.xpath("(//input)[9]"));
		password.sendKeys("***********");
		WebElement signin2 = driver.findElement(By.xpath("(//input)[10]"));
		signin2.click();
		// WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement e1 = driver.findElement(By.xpath("(//input)[5]"));
		// WebElement e1 = driver.findElement(By.xpath("//
		// input[@id='twotabsearchtextbox']"));relative xpath

		e1.sendKeys("books");

		/*
		 * WebElement name = driver.findElement(By.id("ap_customer_name"));
		 * name.sendKeys("Bhavya S Murthy"); WebElement phno =
		 * driver.findElement(By.id("ap_phone_number")); phno.sendKeys("9611700318");
		 * WebElement pwd = driver.findElement(By.id("ap_password"));
		 * pwd.sendKeys("*********"); WebElement cont =
		 * driver.findElement(By.id("continue")); cont.click();
		 */
	}

}
