package TestNgPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomModule.Checkout;
import PomModule.Header;
import PomModule.ShoppingCart;
import PomModule.SignIn;
import PomModule.ViewShoppingCart;

public class verifyShoppingCartUpdate {

	WebDriver driver;
	Header header;
	ViewShoppingCart viewShoppingCart;
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
	public void loginurl()
	{
		System.out.println("@BeforeMethod");
		driver.get("https://www.heenakochhar.com");
		header=new Header(driver);
		header.openSignInPage();
		
		SignIn signin=new SignIn(driver);
		signin.sendUsername("Dudes heart");
		signin.sendpassword("Suruchi@21jan");
		signin.clickOnSubmit();
		header.clickOnCart();
		viewShoppingCart=new ViewShoppingCart(driver);
	}
	
	@Test
	
	public void verifyCloseButton()
	{
		
		viewShoppingCart.clickOnClose();
	}
	
	@Test
	public void verifyViewProduct()
	{
		
		viewShoppingCart.clickOnViewProduct();
	}
	
	@Test
	public void verifyCancelProduct()
	{
		
		viewShoppingCart.clickOnCancelProduct();
	}
	
	@Test
	public void verifyShoppingCartCheckout()
	{
		viewShoppingCart.clickOnCheckOut();
		Checkout checkout=new Checkout(driver);
		checkout.clickAcceptPopUp();
	}
	
	@Test
	public void verifyViewcart()
	{
		viewShoppingCart.clickOnCartViewCart();
		
		ShoppingCart shoppingCart=new ShoppingCart(driver);
		shoppingCart.ClickOnPlusQuantity();
		shoppingCart.ClickOnUpdateCart();
	}
	
	@AfterMethod
	public void closeTab()
	{
		System.out.println("@AfterMethod");
		header.hoverOnMyAccountForLogout();
		header.clickOnLogout();
	}
	
	
	
	@AfterClass
	public void quitBrowser()
	{
		driver.quit();
	}
}
