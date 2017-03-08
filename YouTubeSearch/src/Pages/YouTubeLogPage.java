package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class YouTubeLogPage extends BasePage {

	public YouTubeLogPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "Email")
	public WebElement email;

	@FindBy(id = "Passwd")
	public WebElement passwd;

	@FindBy(id = "signIn")
	public WebElement singIn;

	@FindBy(xpath = ".//*[@id='next']")
	public WebElement nextButton;

	public void logMail(String mail) {
		email.sendKeys(mail);
		nextButton.click();
	}

	public void logPass(String pass) {
		passwd.sendKeys(pass);
		singIn.click();
	}
}
