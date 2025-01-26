package systemscenariosendtoend.Amazon_Project_1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
	private WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(xpath = "//a[@class='a-link-normal s-no-outline'][1]")
	List<WebElement> searchlist;

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

}
