package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class AmazonSencondPage extends BasePage {

	@FindBy(xpath = ".//*[@id='result_0']/div/div/div/div[2]/div[2]/div[1]/a/h2")
	public WebElement selectedGame;

	public boolean checkTest(String correctCagetory) {
		return selectedGame.getText().equals(correctCagetory);
	}

	public void selectCategory() {
		selectedGame.click();
	}

}
