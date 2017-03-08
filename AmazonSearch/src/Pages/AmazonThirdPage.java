package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class AmazonThirdPage extends BasePage {

	@FindBy(xpath = ".//*[@id='add-to-wishlist-button-submit']")
	public WebElement submit;

	public void addToList() {
		submit.click();
	}
}
