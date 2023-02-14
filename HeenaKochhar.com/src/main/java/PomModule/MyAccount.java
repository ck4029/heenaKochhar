package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

	private WebDriver driver;
	private Actions act;
	//variables
	
	@FindBy (xpath="(//a[text()='Dashboard'])[1]")
	private WebElement  myAccountDashboard;
	//dashboard display
	@FindBy (xpath="(//a[text()='Orders'])[2]")
	private WebElement dashOrders;
	
	@FindBy (xpath="(//a[text()='Addresses'])[2]")
	private WebElement dashAddress;
	@FindBy (xpath="(//a[text()='Account details'])[2]")
	private WebElement dashAccountDetails;
	@FindBy (xpath="(//a[text()='Wishlist'])[2]")
	private WebElement dashWishlist;
	@FindBy (xpath="(//a[text()='Logout'])[2]")
	private WebElement dashLogout;
	//dash end
	@FindBy (xpath="(//a[text()='Orders'])[1]")
	private WebElement  myAccountOrders;
	
	@FindBy (xpath="(//a[text()='Addresses'])[1]")
	private WebElement  myAccountAddress;

	@FindBy (xpath="(//a[text()='Account details'])[1]")
	private WebElement  myAccountAccountDetails;
	
	@FindBy (xpath="(//a[text()='Wishlist'])[1]")
	private WebElement  myAccountWishlist;
	
	@FindBy (xpath="(//a[text()='Pay'])[1]")
	private WebElement  ordersPay;
	@FindBy (xpath="(//a[text()='View'])[1]")
	private WebElement  ordersView;
	@FindBy (xpath="(//a[text()='Cancel'])[1]")
	private WebElement orderCancel;
	
	@FindBy (xpath="//a[@class='wd-wishlist-remove']")
	private WebElement wishlistRemove;
	
	@FindBy (xpath="(//a[text()='Logout'])[1]")
	private WebElement myAccountlogout;
	
	//constructor
	
	public MyAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		act=new Actions(driver);
	}
	
	
	//method
	
	public void clickOnmyAccountDashboard()
	{
		act.moveToElement(myAccountDashboard).click().build().perform();
	}
	public void clickOnDashboardOrders()
	{
		act.moveToElement(dashOrders).click().build().perform();
	}
	public void clickOnDashboardAddress()
	{
		act.moveToElement(dashAddress).click().build().perform();
	}
	public void clickOnDashboardAccountDetails()
	{
		act.moveToElement(dashAccountDetails).click().build().perform();
	}
	public void clickOnDashboardWishlist()
	{
		act.moveToElement(dashWishlist).click().build().perform();
	}
	
	public void clickOnDashboardLogout()
	{
		act.moveToElement(dashLogout).click().build().perform();
	}
	
	public void clickOnmyAccountOrders()
	{
		act.moveToElement(myAccountOrders).click().build().perform();
	}
	
	public void clickOnmyAccountAddress()
	{
		act.moveToElement(myAccountAddress).click().build().perform();
	}
	
	public void clickOnmyAccountAccountDetails()
	{
		act.moveToElement(myAccountAccountDetails).click().build().perform();
	}
	
	public void clickOnmyAccountWishlist()
	{
		act.moveToElement(myAccountWishlist).click().build().perform();
	}
	
	public void clickOnOrdersPay()
	{
		act.moveToElement(ordersPay).click().build().perform();
	}
	
	public void clickOnOrdersView()
	{
		act.moveToElement(ordersView).click().build().perform();
	}
	
	public void clickOnOrderCancel()
	{
		act.moveToElement(orderCancel).click().build().perform();
	}
	
	public void clickOnWishlistRemove()
	{
		act.moveToElement(wishlistRemove).click().build().perform();
	}
	
	public void clickOnmyAccountLogout()
	{
		act.moveToElement(myAccountlogout).click().build().perform();
		
	}
}
