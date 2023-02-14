package TestNgPack;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomModule.ChashParandi;
import PomModule.Checkout;
import PomModule.Chithrazat;
import PomModule.Header;
import PomModule.JanabArchives;
import PomModule.ParandiArchives;
import PomModule.Sadhya;
import PomModule.SawaanArchives;
import PomModule.ShoppingCart;
import PomModule.SignIn;
import PomModule.ViewShoppingCart;

public class TestNg {

	 WebDriver driver;
	 Header header;
	 
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("@BeforeClass");
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}

		@BeforeMethod
		public void beforeMethod()
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
		public void verifypassword()
		{
			header.clickOnmyAccountDashboard();
			
		}
		
		@Test
		public void verifyTheLogin()
		{
			System.out.println("@Test");
			String actualUrl=driver.getCurrentUrl();
			String actualTitle=driver.getTitle();
			
			String expectedUrl="https://www.heenakochhar.com/";
			String expectedTitle="Indian clothing store online | Indian dresses online - New";
			
			if(actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle))	
			{
				System.out.println("Pass");
				
			}
			else
			{
				System.out.println("Fail");
			}
		}
		
		@Test(priority=2)
		public void verifyTheCollections()

		{
			
			header.hoverOnCollection();
			header.clickOnSaawan();
			//ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(addr.get(1));
			SawaanArchives sawaanArchives=new SawaanArchives(driver);
			sawaanArchives.clickOnSadhya();
			//ArrayList<String> addr1=new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(addr1.get(2));
			Sadhya sadhya=new Sadhya(driver);
			sadhya.clickOnPlusQuantity();
			sadhya.clickOnAddToCart();
		}
		
		@Test
		public void VerifyTheViewCart()
		{
			header.hoverOnAccessories();
			header.clickOnParandi();
			//ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(addr.get(1));
			ParandiArchives parandiArchives=new ParandiArchives(driver);
			parandiArchives.clickOnParandi();
			//ArrayList<String> addr1=new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(addr.get(2));
			ChashParandi chashParandi=new ChashParandi(driver);
			
			chashParandi.clickOnPlusQuantity();
			chashParandi.clickOnAddToCart();
			
			ViewShoppingCart viewShoppingCart=new ViewShoppingCart(driver);
			
			viewShoppingCart.clickOnViewCart();
			
			String actualUrl=driver.getCurrentUrl();
			String actualTitle=driver.getTitle();
			String expectedUrl="https://www.heenakochhar.com/cart/";
			String expectedTitle="Cart - Heena Kochhar";
			if(actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
			
		}
		
		@Test
		public void VerifyTheFilter()
		{
			header.hoverOnAccessories();
			header.clickOnParandi();
			//ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(addr.get(1));
			ParandiArchives parandiArchives=new ParandiArchives(driver);
			//parandiArchives.clickOnParandi();
			parandiArchives.dragMinPrice();
			parandiArchives.dragMaxPrice();
			
			parandiArchives.clickOnFilter();
			//ArrayList<String> addr1=new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(addr.get(2));
			
			String actualUrl=driver.getCurrentUrl();
			String actualTitle=driver.getTitle();
			String expectedUrl="https://www.heenakochhar.com/cart/";
			String expectedTitle="Cart - Heena Kochhar";
			if(actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
			
		}
		
		@Test(priority=3)
		public void verifyTheCheckOut() throws InterruptedException
		{
			header.clickOnJanab();
			JanabArchives janabArchives=new JanabArchives(driver);
			janabArchives.clickOnJanab();
			Chithrazat chithrazat=new Chithrazat(driver);
			chithrazat.clickOnLSize();
			chithrazat.clickOnAddToCart();
			Thread.sleep(2000);
			ViewShoppingCart viewShoppingCart=new ViewShoppingCart(driver);
			viewShoppingCart.clickOnCheckOut();
			Checkout checkout=new Checkout(driver);
			checkout.clickAcceptPopUp();
			
			String actualUrl=driver.getCurrentUrl();
			String actualTitle=driver.getTitle();
			
			String expectedUrl="https://www.heenakochhar.com/checkout/";
			String expectedTitle="Checkout - Heena Kochhar";
			
			if(actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
		}
		
		
		@Test
		public void verifyGrid()
		{
			header.hoverOnAccessories();
			header.clickOnParandi();
			
			
			ParandiArchives parandiArchives=new ParandiArchives(driver);
			parandiArchives.clickOnGridView4();
			
			String actualUrl=driver.getCurrentUrl();
			String actualTitle=driver.getTitle();
			String expectedUrl="https://www.heenakochhar.com/product-category/accessories/parandi/?per_row=4&shop_view=grid";
			String expectedTitle="Parandi Archives - Heena Kochhar";
			if(actualUrl.equals(expectedUrl) && actualTitle.equals(expectedTitle))
			{
				System.out.println("Pass ");
			}
			else
			{
				System.out.println("Fail");
			}
		}

		@AfterMethod
		public void afterMethod()
		{
			
			System.out.println("@AfterMethod");
			header.hoverOnMyAccountForLogout();
			header.clickOnLogout();
			
			//ArrayList<String> addr=new ArrayList<String>(driver.getWindowHandles());
			//driver.switchTo().window(addr.get(0));
		}
		
		@AfterClass
		public void afterClass()
		{
			System.out.println("@AfterClass");
			
			driver.quit();	
			
		}
	

}
