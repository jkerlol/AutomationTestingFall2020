package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.YahooSignUp;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class featureTest2 {
	
	WebDriver driver;
	YahooSignUp YSU;
	
	@Given("^we have a sign up page to validate$")
	public void we_have_a_sign_up_page_to_validate() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "/Users/modollas/Documents/GitHub/AutomationTestingFall2020/Selenium_JAR/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		YSU = new YahooSignUp(driver);
		
	}

	@When("^we are on the webpage$")
	public void we_are_on_the_webpage() throws Throwable {
	   YSU.launchPage();
	}

	@Then("^we should see the correct URL$")
	public void we_should_see_the_correct_URL() throws Throwable {
		
	   String expectedURL = "https://login.yahoo.com/account/create";
	   Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
		
	}

	@And("^we should the correct title$")
	public void we_should_the_correct_title() throws Throwable {
		
		String expectedTitle = "Yahoo";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		
	}

	@And("^the logo should load!$")
	public void the_logo_should_load() throws Throwable {
	    
		Assert.assertTrue(YSU.getLogo().isDisplayed());
		
	}
	

	@Then("^we want to enter \"([^\"]*)\" into the first name value and \"([^\"]*)\" into the last name value$")
	public void we_want_to_enter_mohammed_into_the_first_name_value_and_arafat_into_the_last_name_value(String name, String lname) throws Throwable {
		YSU.getFirstName().sendKeys("Mohammed");
		YSU.getLastName().sendKeys("Arafat");
	}


	@Then("^if the page is valid, close the page$")
	public void if_the_page_is_valid_close_the_page() throws Throwable {
		Thread.sleep(3000);
	    driver.close();
	}

	
}
