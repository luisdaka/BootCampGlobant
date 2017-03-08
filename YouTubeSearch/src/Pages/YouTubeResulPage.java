package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Common.BasePage;

public class YouTubeResulPage extends BasePage {
	WebElement setVideo;
	@FindBy(xpath = ".//*[@class='yt-lockup-title ']/a")
	public List<WebElement> videos;

	public void waitObject(List<WebElement> locator) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfAllElements(locator));
	}

	public YouTubeResulPage(WebDriver driver) {
		super(driver);
	}

	public void SelectVideo(String video) {

		for (int i = 0; i < videos.size(); i++) {
			String name = videos.get(i).getText();
			if (name.equals(video)) {
				setVideo = videos.get(i);
				setVideo.click();
				setVideo.click();
			}

		}
	}
}
