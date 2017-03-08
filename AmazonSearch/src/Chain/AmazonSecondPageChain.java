package Chain;

import Pages.AmazonSencondPage;

public class AmazonSecondPageChain {
	private AmazonSencondPage amazonSencondPage;

	public AmazonSecondPageChain() {
		amazonSencondPage = new AmazonSencondPage();
	}

	public void selecCategory() {
		amazonSencondPage.waitObject(amazonSencondPage.selectedGame);
		amazonSencondPage.selectCategory();

	}
}
