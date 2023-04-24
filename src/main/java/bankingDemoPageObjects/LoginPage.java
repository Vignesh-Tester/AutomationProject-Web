package bankingDemoPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver ;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passWord;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement LogIn;
	
	public void loginApplication(String validUsername, String validPassword) {
		
		userName.sendKeys(validUsername);
		passWord.sendKeys(validPassword);
		LogIn.click();
	}
	
	public void goTo() {
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}
	
}
