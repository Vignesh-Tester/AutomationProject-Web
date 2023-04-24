package bankingDemoPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	

	WebDriver driver;

	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="// p[@class='smallText']/b")
	WebElement welcomeText;
	
	@FindBy(xpath="//a[normalize-space()='Open New Account']")
	WebElement openAccount;
	
	public void verifyLoginStatus() {
		welcomeText.isDisplayed();	
		openAccount.click();
	}
	

}
