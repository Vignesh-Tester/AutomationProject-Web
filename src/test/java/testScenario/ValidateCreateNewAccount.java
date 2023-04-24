package testScenario;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import bankingDemoPageObjects.AccountDetailsPage;
import bankingDemoPageObjects.AccountOpenedPage;
import bankingDemoPageObjects.HomePage;
import bankingDemoPageObjects.LoginPage;
import bankingDemoPageObjects.OpenAccountPage;

public class ValidateCreateNewAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		LoginPage logPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		OpenAccountPage openAccPage = new OpenAccountPage(driver);
		AccountOpenedPage accOpenPage = new AccountOpenedPage(driver);
		AccountDetailsPage accOverviewPage = new AccountDetailsPage(driver);
		logPage.goTo();
		logPage.loginApplication("john", "demo");
		homePage.verifyLoginStatus();
		openAccPage.SelectAccountType("SAVINGS");
		openAccPage.SelectAccountNumber(0);
		accOpenPage.getAccountcreationConfirmation();
		String value1 = accOverviewPage.getFundTransfermessage();
		
		Assert.assertEquals(value1, "Funds Transfer Received");
		
		System.out.println(value1);
	}

}
