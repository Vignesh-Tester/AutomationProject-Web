package bankingDemoPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenAccountPage {
	WebDriver driver;

	public OpenAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="type")
	WebElement accountTypedropdown;
	
	
	@FindBy(id="fromAccountId")
	WebElement accountNodropdown;
	
	@FindBy(xpath="//input[@value='Open New Account']")
	WebElement clickOpenAccount;
	
	
	public  void SelectAccountType(String accountType) {
	      Select drop = new Select(accountTypedropdown);
	      drop.selectByVisibleText(accountType);
	}
	
	
	public  void SelectAccountNumber(int index) {
	      Select dropdown = new Select(accountNodropdown);
	      dropdown.selectByIndex(index);
	      clickOpenAccount.click();
	}
	
	
	
	
	

}
