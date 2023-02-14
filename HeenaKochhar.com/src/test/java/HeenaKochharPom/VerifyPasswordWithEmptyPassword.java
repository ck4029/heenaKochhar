package HeenaKochharPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BrowserClass;
import PomModule.Header;
import PomModule.SignIn;

public class VerifyPasswordWithEmptyPassword extends BrowserClass {

	private WebDriver driver;
	private Header header;
	private SignIn signin;
	
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
		
	}

		
		@Test
		public void verifyEmptyPassword()
		{
			System.out.println("@BeforeMethod");
			driver.get("https://www.heenakochhar.com");
			header.openSignInPage();
			signin.sendUsername("Dudes heart");
			signin.sendpassword("");
			signin.clickOnSubmit();
			String actual=signin.verifyEmptyPassword();
			String expectedError=" The password field is empty.";
			if(actual.equals(expectedError))
			{
				System.out.println("pass "+signin.verifyEmptyPassword());
			}
			else
			{
				System.out.println("fail "+signin.verifyEmptyPassword());
				
			}
	
		}
		
		
		@AfterClass
		public void clearMemory()
		{
			header=null;
			signin=null;
			
		}
		
		@AfterTest
		public void closeBrowser()
		{
			driver.quit();
			driver=null;
			System.gc();
		}
}
