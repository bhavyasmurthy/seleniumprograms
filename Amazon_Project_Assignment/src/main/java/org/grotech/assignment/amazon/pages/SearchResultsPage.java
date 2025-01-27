package org.grotech.assignment.amazon.pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchResultsPage {

	private WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//a[@class='a-link-normal s-no-outline'][1]")
	List<WebElement> searchlist;

	// to sortby category,price
	@FindBy(xpath = "//select[@id='s-result-sort-select']")
	private WebElement sortbyfeaturedropdown;

	public void selectproduct(int index) {
		searchlist.get(index).click();
	}

	public void switchtoproducttab() throws InterruptedException {
		Set<String> parentchild = driver.getWindowHandles();
		Iterator<String> pcid = parentchild.iterator();
		String pid = pcid.next();
		String child1 = pcid.next();
		driver.switchTo().window(child1);
	}

	public boolean verifysearchresultmessage(String product) {
		String xpath = "//span[.='\"" + product + "\"']";
		// System.out.println(xpath);
		WebElement searchresulttext = driver.findElement(By.xpath(xpath));
		return searchresulttext.isDisplayed();
	}

	// sort by feature
	public void sortbyfeaturedropdown(String text) {// int index
		Select select = new Select(sortbyfeaturedropdown);
		// select.selectByIndex(index);
		// select.selectByVisibleText(text);
		select.selectByValue(text);
	}

}
