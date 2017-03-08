package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class YouTubeHomePageLogged extends BasePage {

	@FindBy(id = "masthead-search-term")
	public WebElement searchBox;

	@FindBy(id = "search-btn")
	public WebElement searchButton;

	@FindBy(id = ".//*[@class='yt-lockup-title ']/a")
	public WebElement videos;

	public YouTubeHomePageLogged(WebDriver driver) {
		super(driver);
	}

	public void searchVandSetideo(String videoName) {
		searchBox.sendKeys(videoName);
		searchButton.click();
	}

}
