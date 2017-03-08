package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	private static WebDriver driver;
	public static String browser = "firefox";

	public static WebDriver getDriver() {
		if (driver == null) {

			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/LuisDaka/Desktop/Automation/geckodriver");
				driver = new FirefoxDriver();
			} else {
				System.setProperty("webdriver.chrome.driver", "/Users/LuisDaka/Desktop/Automation/chromedriver");
				driver = new ChromeDriver();
			}
		}
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		return driver;
	}

}
