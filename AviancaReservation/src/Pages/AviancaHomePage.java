package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.BasePage;

public class AviancaHomePage extends BasePage {
	public AviancaHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = ".//*[@id='vuelos']")
	public WebElement flightsButtom;

	@FindBy(xpath = ".//*[@id='ctl00_g_c1b9b0ad_83b8_4ff7_abbb_170c4e8795d0_ctl00_booking_rbIdaRegreso']")
	public WebElement roundtripRadioButtom;

	@FindBy(id = "idctl00_g_c1b9b0ad_83b8_4ff7_abbb_170c4e8795d0_ctl00_booking_ddlCiudadOrigenBooking")
	public WebElement originCity;

	@FindBy(id = "ui-id-1")
	public WebElement originCitySelected;

	@FindBy(id = "idctl00_g_c1b9b0ad_83b8_4ff7_abbb_170c4e8795d0_ctl00_booking_ddlCiudadDestinoBooking")
	public WebElement destinationCity;

	@FindBy(id = "ui-id-2")
	public WebElement DestinyCitySelected;

	@FindBy(xpath = ".//*[@id='btn_calendar_1']")
	public WebElement departureDayCalendarButtom;

	@FindBy(xpath = ".//*[@id='ctl00_g_c1b9b0ad_83b8_4ff7_abbb_170c4e8795d0_ctl00_booking_txtFechaIda']")
	public WebElement departureDayCalendar;

	@FindBy(xpath = ".//*[@id='btn_calendar_2']")
	public WebElement arrivalDayCalendarButtom;

	@FindBy(xpath = ".//*[@id='ctl00_g_c1b9b0ad_83b8_4ff7_abbb_170c4e8795d0_ctl00_booking_txtFechaRegreso']")
	public WebElement arrivalDayCalendar;

	@FindBy(xpath = ".//*[@id='ctl00_g_c1b9b0ad_83b8_4ff7_abbb_170c4e8795d0_ctl00_booking_ddlAdultos']")
	public WebElement numberOfPassangers;

	@FindBy(xpath = ".//*[@id='ctl00_g_c1b9b0ad_83b8_4ff7_abbb_170c4e8795d0_ctl00_booking_BtnGuardar']")
	public WebElement searchButtom;

	public void clickonFlight() {
		flightsButtom.click();
	}

	public void clickonRoundTripButtom() {
		roundtripRadioButtom.click();
	}

	public void clickAndSetOrigin(String city) {
		originCity.sendKeys(city);
		originCitySelected.click();
	}

	public void clickAndSetDestiny(String city) {

		destinationCity.sendKeys(city);
		DestinyCitySelected.click();
	}

	public void clickAndSetDateDeparture(String Date) {
		departureDayCalendarButtom.click();

	}

	public void clickAndSetDateArrival(String Date) {
		arrivalDayCalendarButtom.click();
		arrivalDayCalendar.sendKeys(Date);
	}

	public void SetPassengers(String passangers) {
		numberOfPassangers.click();
		numberOfPassangers.sendKeys(passangers);
	}

	public void makeQuery() {
		searchButtom.click();

	}
}
