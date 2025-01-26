package com.grotech.selenium.assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"Assignment 168
//Find out all the links of amazon.in Find out the broken link and status code with response.
//Handle the exception with try catch"
public class Assignment168 {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			WebElement e1 = alllinks.get(i);
			String link = e1.getAttribute("href");
			String text = e1.getText();
			System.out.println(link);
			System.out.println(text);
			verifyLink(link);

		}
	}

	static void verifyLink(String link) throws IOException {
		try {
			URL u1 = new URL(link);
			HttpURLConnection h1 = (HttpURLConnection) u1.openConnection();

			if (h1.getResponseCode() == 200 || h1.getResponseCode() == 201) {
				System.out.println("link is valid");
				System.out.println(h1.getResponseMessage());// prints OK,forbidden

			} else {
				System.out.println("invalid link");
				System.out.println(h1.getResponseMessage());

			}
		} catch (MalformedURLException m1) {
			System.out.println("exception handled");
		} catch (NullPointerException m2) {
			System.out.println("exception handled");
		}

	}

}
