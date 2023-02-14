package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart 
{
	@FindBy (xpath="(//a[text()='×'])[1]")
	private WebElement cancelProduct;
	
	@FindBy (xpath="(//img[contains(@class,'attachment-woo')])[1]")
	private WebElement viewProduct;
	
	@FindBy (xpath="(//input[@class='minus'])[1]")
	private WebElement minusQuantity;
	
	@FindBy (xpath="(//input[@class='plus'])[1]")
	private WebElement plusQuantity;
	
	@FindBy (xpath="//button[text()='Update cart']")
	private WebElement updateCart;
	
	
	@FindBy (xpath="//div[@class='wc-proceed-to-checkout']")
	private WebElement proceedToCheckout;

	
	
	//Constructor
	public ShoppingCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method
	
	public void ClickOnCancelProduct()
	{
		cancelProduct.click();
	}
	
	public void ClickOnViewProduct()
	{
		viewProduct.click();
	}
	
	public void ClickOnMinusQuantity()
	{
		minusQuantity.click();
	}
	public void ClickOnPlusQuantity()
	{
		plusQuantity.click();
	}
	public void ClickOnUpdateCart()
	{
		boolean result=updateCart.isEnabled();
		if(result==true)
		{
		System.out.println("Button is enabled"+result);
		updateCart.click();
		}
		else
		{
			System.out.println("Button is not enabled"+result);
			updateCart.click();
		}
		
	}
	public void ClickOnProceedToCheckout()
	{
		proceedToCheckout.click();
		
	}
	
}
