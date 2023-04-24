package bankingDemoPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountOpenedPage {

	WebDriver driver;

	public AccountOpenedPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//div[@class='ng-scope']//p[1]")
	WebElement verifyText;
	
	@FindBy(xpath="//a[@id='newAccountId']")
	WebElement accountId;
	
	@FindBy(linkText="Accounts Overview")
	WebElement accountsOverview;
	
	
	public void getAccountcreationConfirmation() {
		
		verifyText.isDisplayed();
		accountId.click();
	
	}
	
	
}
