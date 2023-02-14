package TestNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomModule.Header;
import PomModule.SignIn;

public class VerifyHelpHeader {

	WebDriver driver;
	Header header;
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
	public void Login()
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
	public void verifyAboutUs() 
	{
		header.hoverOnHelp();
		header.clickOnAbout();
		String actualUrl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedUrl="https://www.heenakochhar.com/about/";
		String expectedTitle="Hand Crafted designer wear, Ajrakh Prints dresses in Delhi %";
		
		if(actualUrl.equals(expectedUrl)&& actualTitle.equals(expectedTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void verifyFAQS()
	{
		header.hoverOnHelp();
		header.clickOnFaqs();
		String actualUrl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedUrl="https://www.heenakochhar.com/faqs/";
		String expectedTitle="Designer Festive wear in Delhi, Indian clothing store online";
		
		if(actualUrl.equals(expectedUrl)&& actualTitle.equals(expectedTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@Test
	public void verifyContact()
	{
		header.hoverOnHelp();
		header.clickOnContact();
		String actualUrl=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		
		String expectedUrl="https://www.heenakochhar.com/faqs/";
		String expectedTitle="Choga| Choga price in New Delhi - Heenakochhar";
		
		if(actualUrl.equals(expectedUrl)&& actualTitle.equals(expectedTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
	@AfterMethod
	public void logout()
	{
		header.hoverOnMyAccountForLogout();
		header.clickOnLogout();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
}
