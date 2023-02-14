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
import PomModule.ChashParandi;
import PomModule.Header;
import PomModule.MadeToOrder;
import PomModule.ParandiArchives;
import PomModule.SignIn;

public class MakeToOrder extends BrowserClass {

	private WebDriver driver;
	private Header header;
	private SignIn signin;
	private ParandiArchives parandiArchives;
	private ChashParandi chashParandi;
	
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
	    parandiArchives=new ParandiArchives(driver);
	    chashParandi=new ChashParandi(driver);
	}
	
	@Test
	public void makeToOrder()
	{
		System.out.println("@BeforeMethod");
		driver.get("https://www.heenakochhar.com");
		 
		header.openSignInPage();
		
		
		signin.sendUsername("Dudes heart");
		signin.sendpassword("Suruchi@21jan");
		signin.clickOnSubmit();
		
		header.hoverOnAccessories();
		header.clickOnParandi();
		
		
		parandiArchives.clickOnParandi();
		
		
		chashParandi.clickOnMadeToOrder();
		
		MadeToOrder madeToOrder=new MadeToOrder(driver);
		madeToOrder.insertacrossBack("11");
		madeToOrder.insertacrossFront("11");
		madeToOrder.insertarmHole("11");
		madeToOrder.insertbicep("11");
		madeToOrder.insertbottomCircumferenceAnkle("11");
		madeToOrder.insertbottomLength("11");
		madeToOrder.insertbottomWaist("11");
		madeToOrder.insertbust("11");
		madeToOrder.insertelbow("11");
		madeToOrder.inserthip("11");
		madeToOrder.insertknee("11");
		madeToOrder.insertLength("11");
		madeToOrder.insertLength("11");
		madeToOrder.insertneckDeepBack("11");
		madeToOrder.insertneckDeepFront("11");
		madeToOrder.insertshoulder("11");
		madeToOrder.insertsleeveLength("11");
		madeToOrder.insertthigh("11");
		madeToOrder.insertunderBust("11");
		madeToOrder.insertupperBust("11");
		madeToOrder.insertwaist("11");
		madeToOrder.insertwristCircumference("11");
		madeToOrder.insertsubmit();

	
	
	}
	
	@AfterClass
	public void quitBrowser() 
	{
		
		header=null;
		signin=null;
		parandiArchives=null;
		chashParandi=null;
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver=null;
		System.gc();
	}
}
