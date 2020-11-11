package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.fbSignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebookCucumberValidation {
	
	WebDriver driver;
	fbSignUpPage FSU;
	
	
	@Given("^a facebook signup page to test$")
	public void a_facebook_signup_page_to_test() throws Throwable {
	    
		// this is where we setup our text preconditions
		System.setProperty("webdriver.chrome.driver", "/Users/modollas/Documents/GitHub/AutomationTestingFall2020/Selenium_JAR/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// this is where we initialize the Facebook Sign Up page object
		
		FSU = new fbSignUpPage(driver);
		
	}

	@When("^we are on the signup page$")
	public void we_are_on_the_signup_page() throws Throwable {
	  // STEP: WE ARE ON THE SIGNUP PAGE
	  // WE USE THE launchpage() method of the facebook signup page class to launch the browser
		
		FSU.launchPage();
		
	}

	
	@Then("^we verify our first name text box if it is valid then enter \"([^\"]*)\" in the text box$")
	public void we_verify_our_first_name_text_box_if_it_is_valid_then_enter_in_the_text_box(String arg1) throws Throwable {
	    
		Assert.assertTrue(FSU.getFirstName().isDisplayed());
		FSU.getFirstName().sendKeys(arg1);
		
	}

	@And("^then we verify last name test box and enter \"([^\"]*)\" in the text box$")
	public void then_we_verify_last_name_test_box_and_enter_in_the_text_box(String arg1) throws Throwable {
	   
		Assert.assertTrue(FSU.getLastName().isDisplayed());
		FSU.getLastName().sendKeys(arg1);   
		
	}




	@And("^we verify logo for the last step and close the page$")
	public void we_verify_logo_for_the_last_step_and_close_the_page() throws Throwable {
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")).isDisplayed());
		Thread.sleep(2000);
		
		driver.close();
	}
	



}
