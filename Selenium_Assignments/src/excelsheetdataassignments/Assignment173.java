package excelsheetdataassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

//"Assignment 173
//Write a program about scroll bar(Up and Down) "
public class Assignment173 {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		WebElement e1 = driver.findElement(By.linkText("About Amazon"));
		Thread.sleep(2000);

		Point p1 = e1.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println(x + " " + y);

		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy(" + x + ", 5000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(10," + y + ")");

	}

}
