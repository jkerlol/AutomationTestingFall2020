package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fbSignUpPage {
	
	private WebDriver driver;
	public WebElement fName = driver.findElement(By.xpath("//*[@id=\"u_0_n\"]"));
	
	// this is our constructor
	
	public fbSignUpPage(WebDriver pass) {
		
		driver = pass;
		
	}
	
	// this method lauches our page!
	
	public void launchPage() {
		driver.get("https://www.facebook.com/signup");
	}
	
	// gets first name text box
	
	public WebElement getFirstName() {
		
		WebElement fName = driver.findElement(By.xpath("//*[@id=\"u_0_n\"]"));
		return fName;
		
	}
	
	// gets last name text box
	
	public WebElement getLastName() {
		
		WebElement lName = driver.findElement(By.xpath("//*[@id=\"u_0_p\"]"));
		return lName;
	}
	
	// gets our email textbox
	
	public WebElement getEmail() {
		WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div[2]/div[1]/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
		return email;
	}
	
	
	// gets our password
	
		public WebElement getPassword() {
			WebElement pw = driver.findElement(By.xpath("//*[@id=\"password_step_input\"]"));
			return pw;
		}
		
		
		public void selectGender (String gender) {
			
			if (gender.equals("Male")) {
				driver.findElement(By.xpath("//*[@id=\"u_0_5\"]")).click();
			}
			
			else if (gender.equals("Female")) {
				driver.findElement(By.xpath("//*[@id=\"u_0_4\"]")).click();
			}
			
			else 
				
				driver.findElement(By.xpath("//*[@id=\"u_0_6\"]")).click();
			
		}
}
