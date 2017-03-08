package Test;

import org.junit.Assert;
import org.testng.annotations.Test;

import Chain.AmazonHomePageChain;
import Chain.AmazonSecondPageChain;
import Chain.AmazonThirdPageChain;
import Common.BaseTest;

public class LaunchTest extends BaseTest {
	private AmazonHomePageChain amazonHomePageChain;
	private AmazonSecondPageChain amazonSecondPageChain;
	private AmazonThirdPageChain amazonThirdpageChain;

	public LaunchTest() {
		amazonHomePageChain = new AmazonHomePageChain();
		amazonSecondPageChain = new AmazonSecondPageChain();
		amazonThirdpageChain = new AmazonThirdPageChain();
	}

	@Test
	public void launchTest1() {
		amazonHomePageChain.searchGame("Star wars PS4");
		amazonSecondPageChain.selecCategory();
		amazonThirdpageChain.addToList();
		Assert.assertTrue(true);
	}
}
