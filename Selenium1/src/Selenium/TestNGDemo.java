package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.fbSignUpPage;


public class TestNGDemo {
	
	
	WebDriver driver;
	fbSignUpPage fb;

	@BeforeSuite
	
	public void initialCheck() {
		System.setProperty("webdriver.chrome.driver" , "/Users/modollas/Desktop/Selenium/WebDriver/chromedriver");
		driver = new ChromeDriver();
		System.out.println("Initial check Complete!");
	}
	
	
	
	@BeforeTest
	
	public void preTestCheck() {
		
		fb = new fbSignUpPage(driver);
		fb.launchPage();
		
		System.out.println("Before test check passed!");
	}
	
	@Test
	
	public void testCase1() {
		
		String title = driver.getTitle();
		
		
		Assert.assertEquals(title, "Sign Up for Facebook | Facebook");
			
	}
	

	
	@AfterTest
	
	public void afterTestCheck() {
		System.out.println("Test is Finished!");
	}
	
	
	
	
	
	
}
