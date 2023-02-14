package TestNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomModule.Header;
import PomModule.MyAccount;
import PomModule.SignIn;

public class VerifyMyAccount {

	private WebDriver driver;
	private Header header;
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("@BeforeClass");
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("@BeforeMethod");
		driver.get("https://www.heenakochhar.com");
		header=new Header(driver);
		header.openSignInPage();
		
		SignIn signin=new SignIn(driver);
		signin.sendUsername("Dudes heart");
		signin.sendpassword("Suruchi@21jan");
		signin.clickOnSubmit();
		
	}
	
	@Test
	public void verifyDashboard()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
	}
	
	@Test
	public void verifyOrdersView()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		
		MyAccount myAccount=new MyAccount(driver);
		myAccount.clickOnmyAccountOrders();
		myAccount.clickOnOrdersView();
		
	}
	
	@Test
	public void verifyOrdersPay()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		
		MyAccount myAccount=new MyAccount(driver);
		myAccount.clickOnmyAccountOrders();
		myAccount.clickOnOrdersPay();
		
	}
	
	@Test
	public void verifyOrdersCancel()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		
		MyAccount myAccount=new MyAccount(driver);
		myAccount.clickOnmyAccountOrders();
		myAccount.clickOnOrderCancel();
		
	}
	
	@Test
	public void verifyAddress()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		
		MyAccount myAccount=new MyAccount(driver);
		myAccount.clickOnmyAccountAddress();
	}
	
	@Test
	public void verifyAccountDetails()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		
		MyAccount myAccount=new MyAccount(driver);
		myAccount.clickOnmyAccountAccountDetails();
	}
	@Test
	public void verifyWishlist()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		
		MyAccount myAccount=new MyAccount(driver);
		myAccount.clickOnmyAccountWishlist();
		myAccount.clickOnWishlistRemove();
	}
	
}
