package bankingDemoPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPage {

	WebDriver driver;

	public AccountDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ng-binding']")
	WebElement fundTransfer;
	
	public String getFundTransfermessage() {
		
	String value = 	fundTransfer.getText();
	
	return value;
	}

	
}
