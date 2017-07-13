package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SharedSD {

	private static final String URL = "https://facebook.com/";
	private static WebDriver driver = null;

	@Given("^I open the default browser$")
	public static void before() {

		System.setProperty("webdriver.chrome.driver",
				"/Volumes/StorEDGE/SeleniumInstalls/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@Then("^I close the default browser$")
	public static void after() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
