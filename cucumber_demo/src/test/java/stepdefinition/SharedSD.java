package stepdefinition;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SharedSD {

	public static final String USERNAME = "echo1225";
	public static final String ACCESS_KEY = "1f9f3cc8-864f-43f4-9eaf-9ce3a18c6881";
	public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";

	private static final String myURL = "https://facebook.com/";
	private static WebDriver driver = null;
	
	@Given("^I open the default browser$")
	public static void before() throws MalformedURLException {

//		System.setProperty("webdriver.chrome.driver",
//				"/Volumes/StorEDGE/SeleniumInstalls/chromedriver");
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get(URL);
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "macOS 10.12");
	    caps.setCapability("version", "59.0");
	 
	    driver = new RemoteWebDriver(new URL(URL), caps);
	    
	    driver.get(myURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
