package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class YouTubeHomePage extends BasePage {

	public YouTubeHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "masthead-search-term")
	public WebElement searchBox;

	@FindBy(id = "search-btn")
	public WebElement searchButton;

	@FindBy(xpath = ".//*[@class='yt-lockup-title ']/a")
	public List<WebElement> videos;

	@FindBy(xpath = ".//*[@id='yt-masthead-signin']/div/button")
	public WebElement logButton;

}
