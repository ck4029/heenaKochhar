package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sadhya {
	//Select Size
	
	@FindBy (xpath="(//span[@class='wd-swatch-text'])[1]")
	private WebElement xsSize;
	
	@FindBy (xpath="(//span[@class='wd-swatch-text'])[2]")
	private WebElement sSize;
	
	@FindBy (xpath="(//span[@class='wd-swatch-text'])[3]")
	private WebElement mSize;
	
	@FindBy (xpath="(//span[@class='wd-swatch-text'])[4]")
	private WebElement lSize;
	
	@FindBy (xpath="(//span[@class='wd-swatch-text'])[5]")
	private WebElement xlSize;
	
	@FindBy (xpath="(//span[@class='wd-swatch-text'])[6]")
	private WebElement xxlSize;
	
	@FindBy (xpath="(//span[@class='wd-swatch-text'])[7]")
	private WebElement xxxlSize;
	
	@FindBy (xpath="(//span[@class='wd-swatch-text'])[8]")
	private WebElement xxxxlSize;
	
	//Size Ends
	
	//Quantity 
	@FindBy(xpath="//input[@class='minus']")
	private WebElement minusQuantity;
	
	@FindBy (xpath="//input[@class='plus']")
	private WebElement plusQuantity;
	
	//Quantity Ends
	@FindBy (xpath="(//span[text()='Add to wishlist'])[1]")
	private WebElement addToWishlist;
	
	@FindBy (xpath="//span[text()='Size Guide']")
	private WebElement sizeGuide;
	
	
	//Made To Order
	@FindBy (xpath="//a[text()='Made To Order']")
	private WebElement madeToOrder;
	
	
	
	@FindBy (xpath="//button[text()='Add to cart']")
	private WebElement addToCart;
	
	
	
	
	
	//constructor
	public Sadhya(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnXsSize()
	{
		xsSize.click();
	}
	public void clickOnSSize()
	{
		sSize.click();
	}
	public void clickOnMSize()
	{
		mSize.click();
	}
	public void clickOnLSize()
	{
		lSize.click();
	}
	public void clickOnXlSize()
	{
		xlSize.click();
	}
	public void clickOnXxlSize()
	{
		xxlSize.click();
	}
	public void clickOnXxxlSize()
	{
		xxxlSize.click();
	}
	public void clickOnXxxxlSize()
	{
		xxxxlSize.click();
	}
	
	public void clickOnMinusQuantity()
	{
		minusQuantity.click();
	}
	
	public void clickOnPlusQuantity()
	{
		plusQuantity.click();
	}
	
	
	public void clickOnAddToWishlist()
	{
		addToWishlist.click();
	}
	
	public void clickOnSizeGuide()
	{
		sizeGuide.click();
	}
	
	public void clickOnMadeToOrder()
	{
		madeToOrder.click();
	}
	
	
	
	
	public void clickOnAddToCart()
	{
		addToCart.click();
	}
	
	
	
}
