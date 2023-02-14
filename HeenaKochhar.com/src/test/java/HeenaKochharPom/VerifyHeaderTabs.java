package HeenaKochharPom;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.BrowserClass;
import PomModule.Header;
import PomModule.SignIn;
import utils.UtilityClass;

public class VerifyHeaderTabs extends BrowserClass{

	private WebDriver driver;
	private Header header;
	private SignIn signin;
	private SoftAssert soft;
	String testID;
	
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
		soft=new SoftAssert();
	    signin=new SignIn(driver);
		
	}

	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException
	{
		driver.get("https://www.heenakochhar.com");
		header.openSignInPage();
	   
		signin.sendUsername(UtilityClass.getexcelSheet("Sheet1", 1, 0));
		signin.sendpassword(UtilityClass.getexcelSheet("Sheet1", 1, 1));
		signin.clickOnSubmit();
	}
	
	@Test
	
	public void verifyHeadertext()
	{
		testID="T101";
		header.verifyHeader();
		
		String actualdata=driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		String expectedUrl="https://www.heenakochhar.com/";
		String expectedTitle="Indian clothing store online | Indian dresses online - Ne";
		
		soft.assertEquals(actualdata, expectedUrl);
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertAll();
	}
	
	@AfterMethod
	public void failedTest(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			UtilityClass.captureScreenShot(testID+".jpg");
		}
	}
	@AfterClass
	public void logout()
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
