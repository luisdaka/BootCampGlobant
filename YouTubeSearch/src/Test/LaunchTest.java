package Test;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Chain.YouTubeHomePageChain;
import Chain.YouTubeHomePageLoggedChain;
import Chain.YouTubeLogPageChain;
import Chain.YouTubeResultPageChain;
import Chain.YouTubeVideoSelectedPageChain;
import Common.BaseTest;

public class LaunchTest extends BaseTest {
	YouTubeHomePageChain youTubeHomePageChain;
	YouTubeLogPageChain youTubeLogPageChain;
	YouTubeHomePageLoggedChain youTubeHomePageLoggedChain;
	YouTubeResultPageChain youTubeResultPageChain;
	YouTubeVideoSelectedPageChain youTubeVideoSelectedPageChain;

	@Parameters({ "browser" })
	public LaunchTest(@Optional("browser") String browser) {
		super(browser);
		youTubeHomePageChain = new YouTubeHomePageChain(driver);
		youTubeLogPageChain = new YouTubeLogPageChain(driver);
		youTubeHomePageLoggedChain = new YouTubeHomePageLoggedChain(driver);
		youTubeResultPageChain = new YouTubeResultPageChain(driver);
		youTubeVideoSelectedPageChain = new YouTubeVideoSelectedPageChain(driver);
	}

	@Parameters({ "url", "user", "pass", "searchedVideo", "SelectedVideo" })
	@Test
	public void launchTest1(@Optional("url") String url, @Optional("user") String user, @Optional("pass") String pass,
			@Optional("searchedVideo") String searchedVideo, @Optional("SelectedVideo") String SelectedVideo) {

		driver.get(url);
		youTubeHomePageChain.goToLog();
		youTubeLogPageChain.loggin(user, pass);
		youTubeHomePageLoggedChain.searchVideo(searchedVideo);
		youTubeResultPageChain.setVideoSelected(SelectedVideo);
		;
		Assert.assertTrue(youTubeVideoSelectedPageChain.likeButtomIsVisible());
		youTubeVideoSelectedPageChain.likeToVideo();

	}
}
