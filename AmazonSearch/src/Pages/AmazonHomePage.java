package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class AmazonHomePage extends BasePage {

	@FindBy(xpath = ".//*[@id='twotabsearchtextbox']")
	public WebElement searchBox;

	@FindBy(xpath = ".//*[@id='nav-search']/form/div[2]/div/input")
	public WebElement searchButton;

	public void searchGame(String videoGame) {
		searchBox.sendKeys(videoGame);
		searchButton.sendKeys(Keys.ENTER);
	}

}
