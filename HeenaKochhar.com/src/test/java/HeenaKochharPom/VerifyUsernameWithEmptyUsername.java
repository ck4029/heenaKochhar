package HeenaKochharPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.BrowserClass;
import PomModule.Header;
import PomModule.SignIn;

public class VerifyUsernameWithEmptyUsername extends BrowserClass{

	private WebDriver driver;
	private Header header;
	private SignIn signin;
	private SoftAssert soft;
	
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
		soft=new SoftAssert();
	}

		
		@Test
		public void verifyEmptyUsername()
		{
			System.out.println("@BeforeMethod");
			driver.get("https://www.heenakochhar.com");
			header.openSignInPage();
			signin.sendUsername("");
			String actualUsername=signin.verifyUsernamePlaceholder();
			String expectedUsername="Username or email address *";
			soft.assertEquals(actualUsername, expectedUsername, expectedUsername);
			signin.sendpassword("Suruchi@21jan");
			String actualPassword=signin.verifyPasswordPlaceholder();
			String expectedPassword="Password *";
			soft.assertEquals(actualPassword, expectedPassword, expectedPassword);
			signin.clickOnSubmit();
			String actualText=signin.verifySubmit("LOG IN");
			String expectedText="LOG IN";
			Assert.assertEquals(actualText, expectedText, expectedText);
			String actual=signin.verifyEmptyUsername();
			String expectedError="Error: Username is required.";
			soft.assertEquals(actual, expectedError, expectedError);
			soft.assertAll();
		}
		
		
		@AfterClass
		public void clearMemory()
		{
			header=null;
			signin=null;
			soft=null;
		}
		
		@AfterTest
		public void closeBrowser()
		{
			driver.quit();
			driver=null;
			System.gc();
		}
}
