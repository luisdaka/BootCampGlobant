
package Common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest {
	public static WebDriver driver;

	public BaseTest() {
		driver = DriverFactory.getDriver();
	}

	@BeforeTest
	public void maximize() {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void quitDriver() {
		driver.quit();
	}
}