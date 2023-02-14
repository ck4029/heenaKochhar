package TestNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomModule.Header;
import PomModule.SignIn;

public class VerifyHeaderTab {
	private WebDriver driver;
	private Header header;
	@BeforeTest
	public void LaunchChromeBrowser()
	{
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
	
	public void verifyHeadertext()
	{
		header.verifyHeader(2);
		header.verifyHeader(3);
		String actualdata=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		String expectedUrl="https://www.heenakochhar.com/";
		String expectedTitle="Indian clothing store online | Indian dresses online - New";
		
		if(actualdata.equals(expectedUrl) && actualTitle.equals(expectedTitle))
		{
			System.out.println(header.verifyHeader(3));
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
		driver.close();
	}
}
