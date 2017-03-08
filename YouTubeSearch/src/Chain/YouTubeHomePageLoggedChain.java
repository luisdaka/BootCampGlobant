package Chain;

import org.openqa.selenium.WebDriver;

import Pages.YouTubeHomePageLogged;

public class YouTubeHomePageLoggedChain {
	public YouTubeHomePageLogged youTubeHomePageLogged;

	public YouTubeHomePageLoggedChain(WebDriver driver) {
		youTubeHomePageLogged = new YouTubeHomePageLogged(driver);
	}

	public void searchVideo(String nameVideo) {
		youTubeHomePageLogged.waitObject(youTubeHomePageLogged.searchButton);
		youTubeHomePageLogged.searchVandSetideo(nameVideo);
	}

}
