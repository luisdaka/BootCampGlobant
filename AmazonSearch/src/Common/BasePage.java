package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
	public static WebDriver driver;

	public BasePage() {
		driver = DriverFactory.getDriver();
		PageFactory.initElements(driver, this);
	}

	public void waitObject(WebElement locator) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(locator));

	}

}