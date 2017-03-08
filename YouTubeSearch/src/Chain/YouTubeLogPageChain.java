package Chain;

import org.openqa.selenium.WebDriver;

import Pages.YouTubeLogPage;

public class YouTubeLogPageChain {
	private YouTubeLogPage youTubeLogPage;

	public YouTubeLogPageChain(WebDriver driver) {
		youTubeLogPage = new YouTubeLogPage(driver);
	}

	public void loggin(String mail, String pass) {
		youTubeLogPage.waitObject(youTubeLogPage.email);
		youTubeLogPage.logMail(mail);
		youTubeLogPage.waitObject(youTubeLogPage.passwd);
		youTubeLogPage.logPass(pass);
	}
}
