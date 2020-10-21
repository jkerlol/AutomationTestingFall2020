package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.YahooSignUp;

public class yahooSignUpValidation3 {

	WebDriver driver;
	YahooSignUp YSU;
	
	@BeforeMethod 
	
	public void setupTestEnvironment() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/modollas/Desktop/Selenium/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		YSU = new YahooSignUp(driver);
		
	}
	
	@Test
	
	public void testPageURL() {
		
		String expectedURL = "https://login.yahoo.com/account/create";
		
		YSU.launchPage();
		
		Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
		
	}
	

	@AfterMethod

	public void postTestBehavior() {
	
	driver.quit();
	YSU = null;
	}
	
	
}
