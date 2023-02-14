package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChashParandi {

	//Quantity 
		@FindBy(xpath="//input[@class='minus']")
		private WebElement minusQuantity;
		
		@FindBy (xpath="//input[@class='plus']")
		private WebElement plusQuantity;
		
		//Quantity Ends
		@FindBy (xpath="(//span[text()='Add to wishlist'])[1]")
		private WebElement addToWishlist;
		
		//Made To Order
		@FindBy (xpath="//a[text()='Made To Order']")
		private WebElement makeToOrder;
		

		@FindBy (xpath="//button[text()='Add to cart']")
		private WebElement addToCart;
		
		//constructor
		
		public ChashParandi(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		
		//methods
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
		
		
		
		public void clickOnMadeToOrder()
		{
			makeToOrder.click();
		}
		
		public void clickOnAddToCart()
		{
			addToCart.click();
		}
}
