package Chain;

import Pages.AmazonThirdPage;

public class AmazonThirdPageChain {
	private AmazonThirdPage amazonThirdPage;

	public AmazonThirdPageChain() {
		amazonThirdPage = new AmazonThirdPage();
	}

	public void addToList() {
		amazonThirdPage.waitObject(amazonThirdPage.submit);
		amazonThirdPage.addToList();

	}
}
