package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class YahooSignUp {
		
	WebDriver driver;
	
	// constructor to initialize webdriver field
	
	public YahooSignUp(WebDriver passedDriver) {
		driver = passedDriver;
	}
	
	public void launchPage() {
		driver.get("https://login.yahoo.com/account/create");
	}
	
	public WebElement getFirstName() {
		
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/fieldset/div/div[1]/input"));
		return firstName;	

	}
	
	public WebElement getLastName() {
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"usernamereg-lastName\"]"));
		return lastName;

	}
	
	public WebElement getEmail() {
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"usernamereg-yid\"]"));
		return email;

	}
	
	public WebElement getPassword() {
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"usernamereg-password\"]"));
		return password;

	}
	
	public WebElement getPhone() {
		
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"usernamereg-phone\"]"));
		return phone;


	}
	
	public void setMonth(String month) {
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"usernamereg-month\"]"));
		
		Select monthSelect = new Select(dropdown);
		
		monthSelect.selectByVisibleText(month);

	}
	
	public WebElement getBirthDay() {
		
		WebElement birthday = driver.findElement(By.xpath("//*[@id=\"usernamereg-day\"]//*[@id=\"usernamereg-day\"]"));
		return birthday;

	}
	
	public WebElement getBirthYear() {
		
		WebElement birthYear = driver.findElement(By.xpath("//*[@id=\"usernamereg-year\"]"));
		return birthYear;

	}
	
	public WebElement getGender() {
		
		WebElement gender = driver.findElement(By.xpath("//*[@id=\"usernamereg-freeformGender\"]"));
		return gender;
	}
	
	
	public WebElement getLogo() {
		return driver.findElement(By.xpath("/html/body/div[2]/div[1]/span[1]/a/img[1]"));
	}
	
	
	
}
