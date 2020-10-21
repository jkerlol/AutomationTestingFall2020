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
	
	public void testLogoDisplay() {
		
		
		YSU.launchPage();
		
		boolean flag = driver.findElement(By.xpath("/html/body/div[2]/div[1]/span[1]/a/img[1]")).isDisplayed();
		
		Assert.assertTrue(flag);
		
	}
	

	
	@AfterMethod
	
	public void postTestBehavior() {
		
		driver.quit();
		YSU = null;
	}
	
	
	
	
}
