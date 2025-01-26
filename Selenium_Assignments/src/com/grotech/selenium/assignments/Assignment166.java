package com.grotech.selenium.assignments;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

//"Assignment 166:get the screenshot with date ,time ,getclass();"
public class Assignment166 {

	public static void main(String[] args) throws IOException {
		Date d1 = new Date();

		Date d2 = new Date(d1.getTime());
		System.out.println("Current time:" + d2);

		// Sat Dec 28 12:17:28 IST 2024

		String humantime = d2.toString();

		String date = humantime.substring(8, 10);
		String time = humantime.substring(11, 19);
		time = time.replace(":", " ");
		// time = time.replace(" ", "");
		System.out.println(time);

		String month = humantime.substring(4, 7);
		String year = humantime.substring(24, 28);

		String format1 = date.concat(" ").concat(month).concat(" ").concat(year).concat(" ").concat(time);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless==new");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		TakesScreenshot ts = driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		// File destiny = new File(
		// "C:\\Users\\mruty\\OneDrive\\Desktop\\githubforjava\\seleniumprograms\\Selenium_Assignments\\images\\"
		// + Assignment166.class.getName() + ".png");

		File destiny = new File(
				"C:\\Users\\mruty\\OneDrive\\Desktop\\githubforjava\\seleniumprograms\\Selenium_Assignments\\images\\"
						+ format1 + ".png");

		FileHandler.copy(src, destiny);
	}

}
