package Chain;

import Pages.AmazonHomePage;

public class AmazonHomePageChain {
	private AmazonHomePage amazonHomePage;

	public AmazonHomePageChain() {
		amazonHomePage = new AmazonHomePage();
	}

	public void searchGame(String nameGame) {
		amazonHomePage.searchBox.sendKeys(nameGame);
		amazonHomePage.waitObject(amazonHomePage.searchButton);
		amazonHomePage.searchButton.click();
	}
}
