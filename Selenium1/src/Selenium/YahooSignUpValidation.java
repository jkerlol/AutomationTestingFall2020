package Selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.YahooSignUp;

public class YahooSignUpValidation {
	
	WebDriver driver;
	YahooSignUp YSU;
	
	// this method sets up our test environment
	@BeforeMethod 
	
	public void setupTestEnvironment() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/modollas/Documents/GitHub/AutomationTestingFall2020/Selenium_JAR/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		YSU = new YahooSignUp(driver);
		
	}
	
	
	// this test case tests if we are on the correct page by checking URL
	@Test
	
	public void testPageURL() {
		
		String expectedURL = "https://login.yahoo.com/account/create";
		
		YSU.launchPage();
		
		Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
		
	}
	
	// this test case tests if we are on the correct page by verifying the logo
	@Test
	
	public void testLogoDisplay() {
		
		
		YSU.launchPage();
		
		boolean flag = driver.findElement(By.xpath("/html/body/div[2]/div[1]/span[1]/a/img[1]")).isDisplayed();
		
		Assert.assertTrue(flag);
		
	}
	
	// this test case tests if we are on the correct page by checking the page title
	@Test

	public void testPageTitle() {
	
		String expectedTitle = "Yahoo";
		YSU.launchPage();
		Assert.assertEquals(driver.getTitle(), expectedTitle);
	
	}
	
	// this test case tests if we can see the signup button
	@Test

	public void testButtonShown() {
		YSU.launchPage();
		boolean flag = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/div[8]/button")).isDisplayed();
		Assert.assertTrue(flag);
	}
	

	
	@AfterMethod
	
	public void postTestBehavior() {
		
		driver.quit();
		YSU = null;
	}
	
	
	
	
}
