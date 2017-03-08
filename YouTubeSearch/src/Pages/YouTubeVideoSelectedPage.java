package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class YouTubeVideoSelectedPage extends BasePage {

	@FindBy(xpath = ".//*[@id='watch8-sentiment-actions']/span/span[1]/button")
	public WebElement likeButtom;

	public YouTubeVideoSelectedPage(WebDriver driver) {
		super(driver);
	}

	public void LikeToVideo() {
		likeButtom.click();
	}

}
