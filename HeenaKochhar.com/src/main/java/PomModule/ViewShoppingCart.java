package PomModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewShoppingCart 
{
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//a[text()='close']")
	private WebElement close;
	
	@FindBy(xpath="(//a[text()='×'])[1]")
	private WebElement cancelProduct;
	@FindBy(xpath="(//a[text()='Show'])[1]")
	private WebElement viewProduct;
    @FindBy(xpath="(//a[text()='View cart'])[2]")
	private WebElement viewCart;
	@FindBy(xpath="//a[text()='View cart']")
	private WebElement cartViewCart;
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement checkOut;
	

	//Constructor
	
	public ViewShoppingCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions(driver);
	}
	
	
	//methods
	
	public void clickOnClose()
	{
		act.moveToElement(close).click().build().perform();
	}
	public void clickOnCancelProduct()
	{
		act.moveToElement(cancelProduct).click().build().perform();
	}
	public void clickOnViewProduct()
	{
		viewProduct.click();
	}
	public void clickOnViewCart()
	{
		viewCart.click();
	}
	
	public void clickOnCheckOut() 
	{
	
		act.moveToElement(checkOut).perform();
	
		act.click().perform();
	}
	
	public void clickOnCartViewCart()
	{
		cartViewCart.click();
	}
	
}
