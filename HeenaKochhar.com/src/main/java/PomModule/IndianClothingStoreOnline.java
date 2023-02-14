package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndianClothingStoreOnline {

	//Variable declaration
	
	private WebDriver driverg;
	
	private Actions act;
	
	@FindBy (xpath="(//span[text()='COLLECTIONS'])[1]")
	private WebElement collections;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[4]")
	private WebElement saawan;
	
	@FindBy (xpath="(//span[text()='Janab'])[1]")
	private WebElement janab;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[7]")
	private WebElement alehda;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[9]")
	private WebElement sherbat;
	
	//Collections End
	
	//Accessories Start
	@FindBy (xpath="(//span[text()='Accessories'])[1]")
	private WebElement accessories;
	
	@FindBy (xpath="(//a[text()='Parandi'])[1]")
	private WebElement parandi;
	
	@FindBy (xpath="(//a[text()='Potlis/jholas'])[1]")
	private WebElement potlis;
	
	@FindBy (xpath="(//a[text()='Juttis'])[1]")
	private WebElement juttis;
	
	//Accessories End
	
	@FindBy (xpath="(//a[@title='My account'])[1]")
	private WebElement myAccount;
	
	@FindBy (xpath="(//input[@type='text'])[3]")
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath="(//button[@type='submit'])[2]")
	private WebElement login;
	
	//Constructor
	
	public IndianClothingStoreOnline(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverg=driver;
		act=new Actions(driverg);
	}
	
	
	//Method
	
	
	
	public void hoverOnCollections()
	{
		act.moveToElement(collections).perform();
	}
	
	public void clickOnSaawan()
	{
		saawan.click();
	}
	
	public void clickOnJanab()
	{
		janab.click();
	}
	
	public void clickOnAlehda()
	{
		alehda.click();
	}
	
	public void clickOnSherbat()
	{
		sherbat.click();
	}
	
	
	public void hoverOnAccessories() 
	{
		
		
		act.moveToElement(accessories);
	}
	
	public void clickOnParandi()
	{
		parandi.click();
	}
	
	public void clickOnPotlis()
	{
		potlis.click();
	}
	
	public void clickOnJuttis()
	{
		juttis.click();
	}
	
	public void clickOnMyAccount()
	{
		myAccount.click();
	}
	
	public void insertUserName()
	{
		userName.sendKeys("Dudes Heart");
	}
	
	public void insertPassword()
	{
		password.sendKeys("Suruchi@21jan");
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
}
