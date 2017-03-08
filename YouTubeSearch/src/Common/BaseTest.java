package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
	public WebDriver driver;

	@BeforeTest
	public void maximize() {
		driver.manage().window().maximize();
	}

	public BaseTest(String browser) {
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/LuisDaka/Desktop/Automation/geckodriver");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "/Users/LuisDaka/Desktop/Automation/chromedriver");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	@AfterTest
	public void quitDriver() {
		driver.quit();
	}
}
