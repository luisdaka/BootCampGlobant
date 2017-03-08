package Chain;

import org.openqa.selenium.WebDriver;

import Pages.YouTubeVideoSelectedPage;

public class YouTubeVideoSelectedPageChain {

	private YouTubeVideoSelectedPage youTubeVideoSelectedPage;

	public YouTubeVideoSelectedPageChain(WebDriver driver) {
		youTubeVideoSelectedPage = new YouTubeVideoSelectedPage(driver);

	}

	public void likeToVideo() {
		youTubeVideoSelectedPage.LikeToVideo();
	}

	public boolean likeButtomIsVisible() {
		return youTubeVideoSelectedPage.likeButtom.isDisplayed();
	}
}
