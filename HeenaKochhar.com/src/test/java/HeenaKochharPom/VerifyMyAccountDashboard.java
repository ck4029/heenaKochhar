package HeenaKochharPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BrowserClass;
import PomModule.Header;
import PomModule.MyAccount;
import PomModule.SignIn;

public class VerifyMyAccountDashboard extends BrowserClass{

	private WebDriver driver;
	private Header header;
	private SignIn signin;
	private MyAccount myAccount;
	
	@Parameters("browser123")
	@BeforeTest
	public void launchBrowser(String browser)
	{
	if(browser.equals("Chrome"))	
	{
		driver=openChromeBrowser();
	   
	}
	if(browser.equals("Edge"))
	{
		driver=openEdgeBrowser();
	}
	if(browser.equals("Firefox"))
	{
		driver=openFirefoxBrowser();
	}
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void createPomObject()
	{
		header=new Header(driver);
		signin=new SignIn(driver);
		myAccount=new MyAccount(driver);
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("@BeforeMethod");
		driver.get("https://www.heenakochhar.com");
		
		header.openSignInPage();
		
		
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
		String actualAccount=header.myAccountVerify();
		String expectedAccount="";
		header.clickOnmyAccountDashboard();
		myAccount.clickOnmyAccountOrders();
		myAccount.clickOnOrdersView();
		
	}
	
	@Test
	public void verifyOrdersPay()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		myAccount.clickOnmyAccountOrders();
		myAccount.clickOnOrdersPay();
		
	}
	
	@Test
	public void verifyOrdersCancel()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		myAccount.clickOnmyAccountOrders();
		myAccount.clickOnOrderCancel();
		
	}
	
	@Test
	public void verifyAddress()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		myAccount.clickOnmyAccountAddress();
	}
	
	@Test
	public void verifyAccountDetails()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		myAccount.clickOnmyAccountAccountDetails();
	}
	@Test
	public void verifyWishlist()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnmyAccountDashboard();
		myAccount.clickOnmyAccountWishlist();
		myAccount.clickOnWishlistRemove();
	}
	
	@AfterMethod
	public void logout()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnLogout();
	}
	

	@AfterClass
	public void quitTab()
	{
		header=null;
		signin=null;
		myAccount=null;
	}
	
	@AfterTest
	public void quitBrowser()
	{
		driver.quit();
		driver=null;
		System.gc();
	}

}
