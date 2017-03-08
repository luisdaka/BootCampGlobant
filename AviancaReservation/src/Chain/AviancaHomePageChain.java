package Chain;

import org.openqa.selenium.WebDriver;

import Pages.AviancaHomePage;

public class AviancaHomePageChain {
	private AviancaHomePage aviancaHomePage;

	public AviancaHomePageChain(WebDriver driver) {
		aviancaHomePage = new AviancaHomePage(driver);

	}

	public void SearchAndSelectFlight(String originCity, String destinyCity, String departureDayCalendar,
			String arrivalDayCalendar, String numberpassengers) {
		aviancaHomePage.waitObject(aviancaHomePage.flightsButtom);
		aviancaHomePage.flightsButtom.click();
		aviancaHomePage.waitObject(aviancaHomePage.destinationCity);
		aviancaHomePage.clickAndSetOrigin(originCity);
		aviancaHomePage.clickAndSetDestiny(destinyCity);
		aviancaHomePage.waitObject(aviancaHomePage.departureDayCalendarButtom);
		aviancaHomePage.clickAndSetDateDeparture(departureDayCalendar);
		aviancaHomePage.waitObject(aviancaHomePage.arrivalDayCalendarButtom);
		aviancaHomePage.clickAndSetDateArrival(arrivalDayCalendar);
		aviancaHomePage.SetPassengers(numberpassengers);
		aviancaHomePage.waitObject(aviancaHomePage.searchButtom);
		aviancaHomePage.makeQuery();

	}

	public boolean allElementsAreVisible(String originCity, String destinyCity, String departureDayCalendar,
			String arrivalDayCalendar, String numberpassengers) {
		if ((originCity != null) && (destinyCity != null) && (departureDayCalendar != null)
				&& (arrivalDayCalendar != null) && (numberpassengers != null))
			return true;
		return false;
	}

}
