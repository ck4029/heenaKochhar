package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParandiArchives {

    private WebDriver driver;
	
	private Actions act;
	
	@FindBy (xpath="(//div[@class='hover-img']//img)[1]")
	private WebElement parandi;
	
	@FindBy (xpath="//span[text()='Add to wishlist'][1]")
	private WebElement addToWishlist;
	
	@FindBy (xpath="(//a[text()='Quick view'])[1]")
	private WebElement quickReview;
	
	
	//Filter start
	@FindBy (xpath="(//span[contains(@class,'ui-slider-handle')])[1]")
	private WebElement minPrice;
	
	@FindBy (xpath="//a[text()='Clear filters']")
	private WebElement clearFilter;
	
	
	@FindBy (xpath="(//span[contains(@class,'ui-slider-handle')])[2]")
	private WebElement maxPrice;
	
	@FindBy (xpath="//span[@style='left: 76.875%;']")
	private WebElement maxPriceDrag76;
	
	@FindBy (xpath="//button[text()='Filter']")
	private WebElement filter;
	
	@FindBy (xpath="(((//div[contains(@class,'wd-products-')])[2])//a)[1]")
	private WebElement gridView2;
	
	@FindBy (xpath="(((//div[contains(@class,'wd-products-')])[2])//a)[2]")
	private WebElement gridView3;
	
	@FindBy (xpath="(((//div[contains(@class,'wd-products-')])[2])//a)[3]")
	private WebElement gridView4;
	
	//Filter ends
	//constructor
	public ParandiArchives(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		act=new Actions(driver);
	}
	
	
	
	//method
	
	public void clickOnParandi()
	{
		parandi.click();
	}
	
	public void hoveraddOnWishlist()
	{
		
		act.moveToElement(addToWishlist).click().build().perform();
	}
	
	public void clickOnquickReview() 
	{
		
		act.moveToElement(quickReview).click().build().perform();	
	}
	
	public void dragMinPrice()
	{
		act.dragAndDropBy(minPrice, 23, 0);
	}
	
	public void dragMaxPrice()
	{
		act.dragAndDropBy(maxPrice, -100, 0).perform();
	}
	
	public void clickOnFilter()
	{
		act.moveToElement(filter).click().build().perform();
	}
	
	public void clickOnclearFilter()
	{
		act.moveToElement(clearFilter).click().build().perform();
	}
	
	public void clickOnGridView2()
	{
		act.moveToElement(gridView2).click().build().perform();
	}
	
	public void clickOnGridView3()
	{
		act.moveToElement(gridView3).click().build().perform();
	}
	
	public void clickOnGridView4()
	{
		act.moveToElement(gridView4).click().build().perform();
	}
}
