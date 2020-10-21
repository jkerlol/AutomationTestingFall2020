package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Pages.fbSignUpPage;





public class ClassExamples {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/modollas/Desktop/Selenium/WebDriver/chromedriver"
				);
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://login.yahoo.com/account/create");
		
		System.out.print(driver.getTitle());
		driver.quit();
			
	
	}

}
