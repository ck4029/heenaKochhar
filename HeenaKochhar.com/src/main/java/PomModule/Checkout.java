package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {

	@FindBy (xpath="//a[text()='OK']")
	private WebElement acceptPopUp;
	
	@FindBy (xpath="//input[@name='billing_company']")
	private WebElement companyName;
	
	@FindBy (xpath="(//span[@aria-label='Country / Region'])[1]")
	private WebElement country;
	
	@FindBy (xpath="//li[text()='India']")
	private WebElement selectCountry;
	
	@FindBy (xpath="//input[@name='billing_address_1']")
	private WebElement streetAddress;
	
	@FindBy (xpath="//input[@name='billing_address_2']")
	private WebElement street;
	
	@FindBy (xpath="//input[@name='billing_city']")
	private WebElement city;
	
	@FindBy (xpath="(//span[@class='select2-selection__arrow'])[2]")
	private WebElement state;
	
	@FindBy (xpath="//li[text()='Maharashtra']")
	private WebElement selectState;
	
	@FindBy (xpath="//input[@name='billing_postcode']")
	private WebElement zipcode;
	
	@FindBy (xpath="//input[@name='billing_phone']")
	private WebElement phone;
	
	@FindBy (xpath="//button[@name='woocommerce_checkout_place_order']")
	private WebElement placeOrder;
	
	//Construtor
	
	public Checkout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	//method
	
	public void clickAcceptPopUp()
	{
		acceptPopUp.click();
	}
	
	public void sendCompanyName()
	{
		companyName.sendKeys("xyz");
	}
	
	public void sendCountry()
	{
		country.click();
	}
	
	public void sendSelectCountry()
	{
		selectCountry.click();
	}
	
	public void sendStreetAddress()
	{
		streetAddress.sendKeys("ncajkncja");
	}
	
	public void sendStreet()
	{
		street.sendKeys("adcadcad");
	}
	
	public void sendCity()
	{
		city.sendKeys(" ");
	}
	
	public void sendState()
	{
		state.click();
	}
	public void sendSelectState()
	{
		selectState.click();
	}
	public void sendZipcode()
	{
		zipcode.sendKeys("493849");
	}
	public void sendPhone()
	{
		phone.sendKeys("9988738738");
	}
	public void sendPlaceOrder()
	{
		placeOrder.click();
	}
	
}
