package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SawaanArchives {

	private WebDriver driverg;
	
	private Actions act;
	
	@FindBy (xpath="(//div[@class='hover-img']//img)[1]")
	private WebElement sadhya;
	
	@FindBy (xpath="//span[text()='Add to wishlist'][1]")
	private WebElement addToWishlist;
	
	@FindBy (xpath="(//a[text()='Quick view'])[1]")
	private WebElement quickReview;
	
	
	//constructor
	public SawaanArchives(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverg=driver;
		act=new Actions(driverg);
	}
	
	
	
	//method
	
	public void clickOnSadhya()
	{
		sadhya.click();
	}
	
	public void hoveraddOnWishlist()
	{
		
		act.moveToElement(addToWishlist).click().build().perform();
	}
	
	public void clickOnquickReview() 
	{
		
		act.moveToElement(quickReview).click().build().perform();	
	}
	}
