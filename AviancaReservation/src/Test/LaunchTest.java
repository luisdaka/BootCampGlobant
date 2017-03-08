package Test;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Chain.AviancaHomePageChain;
import Common.BaseTest;

public class LaunchTest extends BaseTest {
	public AviancaHomePageChain aviancaHomePageChain;

	@Parameters({ "browser" })
	LaunchTest(@Optional("browser") String browser) {
		super(browser);
		aviancaHomePageChain = new AviancaHomePageChain(driver);
	}

	@Parameters({ "originCity", "destinyCity", "departureDayCalendar", "arrivalDayCalendar", "numberpassengers" })
	@Test
	public void launchDriver(@Optional("originCity") String originCity, @Optional("destinyCity") String destinyCity,
			@Optional("departureDayCalendar") String departureDayCalendar,
			@Optional("arrivalDayCalendar") String arrivalDayCalendar,
			@Optional("numberpassengers") String numberpassengers) {
		Assert.assertTrue(aviancaHomePageChain.allElementsAreVisible(originCity, destinyCity, departureDayCalendar,
				numberpassengers, numberpassengers));
		aviancaHomePageChain.SearchAndSelectFlight(originCity, destinyCity, departureDayCalendar, arrivalDayCalendar,
				numberpassengers);

	}

}
