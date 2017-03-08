package Chain;

import org.openqa.selenium.WebDriver;

import Pages.YouTubeResulPage;

public class YouTubeResultPageChain {
	private YouTubeResulPage youTubeResulPage;

	public YouTubeResultPageChain(WebDriver driver) {
		youTubeResulPage = new YouTubeResulPage(driver);
	}

	public void setVideoSelected(String nameVideoSelected) {
		youTubeResulPage.waitObject(youTubeResulPage.videos);
		youTubeResulPage.SelectVideo(nameVideoSelected);

	}
}
