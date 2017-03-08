package Chain;

import org.openqa.selenium.WebDriver;

import Pages.YouTubeHomePage;

public class YouTubeHomePageChain {
	private YouTubeHomePage youTubeHomePage;

	public YouTubeHomePageChain(WebDriver driver) {
		youTubeHomePage = new YouTubeHomePage(driver);
	}

	public void goToLog() {
		youTubeHomePage.waitObject(youTubeHomePage.logButton);
		youTubeHomePage.logButton.click();
	}

}
