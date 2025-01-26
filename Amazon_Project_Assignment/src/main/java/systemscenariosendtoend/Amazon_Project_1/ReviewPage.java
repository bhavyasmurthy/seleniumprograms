package systemscenariosendtoend.Amazon_Project_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage {
	private WebDriver driver;

	public ReviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='a-autoid-5-announce']")
	WebElement writeaproductreview;

	@FindBy(xpath = "(//button[@class='ryp__star__button'])[5]")
	private WebElement fivestarrating;

	public void give5starrating() {
		Actions actions = new Actions(driver);
		actions.moveToElement(fivestarrating).perform();
		actions.click().perform();
	}

}
