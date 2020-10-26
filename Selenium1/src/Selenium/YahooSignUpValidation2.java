package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.YahooSignUp;
import Pages.fbSignUpPage;


public class YahooSignUpValidation2 {
	WebDriver driver;
	YahooSignUp YSU;
	
@BeforeMethod 
	
	public void setupTestEnvironment() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/modollas/Documents/GitHub/AutomationTestingFall2020/Selenium_JAR/WebDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		YSU = new YahooSignUp(driver);
		
	}
	


	@Test

	public void testPageTitle() {
	
	String expectedTitle = "Yahoo";
	
	YSU.launchPage();
	
	Assert.assertEquals(driver.getTitle(), expectedTitle);
	
	}


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
