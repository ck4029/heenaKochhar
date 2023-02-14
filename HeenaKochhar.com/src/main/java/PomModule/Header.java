package PomModule;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header 
{
	//Variable
	
	private WebDriver driverg;
	
	private Actions act;
	
	@FindBy (xpath="(//img[@alt='Heena Kochhar'])[1]")
	private WebElement logo;
	//li[contains(@class,'menu-item menu-item-type-custom menu-item-')]//a
	@FindBy (xpath="//li[contains(@class,'menu-item menu-item-type-custom menu-item-')]//a")
	private List<WebElement> links;
	//div[contains(@class,'wd-header-nav wd-he')]//li//a[@class='woodmart-nav-link']
	@FindBy (xpath="(//span[text()='COLLECTIONS'])[1]")
	private WebElement collection;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[3]")
	private WebElement gulfaiz;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[4]")
	private WebElement hamnafas;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[5]")
	private WebElement saawan;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[6]")
	private WebElement sheerKhurma;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[7]")
	private WebElement chandBibi;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[8]")
	private WebElement alehda;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[9]")
	private WebElement gulNilofer;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[10]")
	private WebElement sherbat;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[11]")
	private WebElement tarruf;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[12]")
	private WebElement dhoopKinarey;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[13]")
	private WebElement hussna;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[14]")
	private WebElement khuld;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[15]")
	private WebElement madno;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[16]")
	private WebElement chakori;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[17]")
	private WebElement dastangoi;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[18]")
	private WebElement dilNoor;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[19]")
	private WebElement dilli;
	
	//Collections End
	
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[20]")
	private WebElement janab;
	//Accessories Start
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[21]")
	private WebElement accessories;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[22]")
	private WebElement parandi;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[23]")
	private WebElement potlisJholas;
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[24]")
	private WebElement juttis;
	
	//Accessories Ends
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[25]")
	private WebElement  bestSeller;
	
	//Blog header
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[26]")
	private WebElement  blog;
	
	
	//Help header
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[27]")
	private WebElement  help;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[28]")
	private WebElement  about;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[29]")
	private WebElement  faqs;
	
	@FindBy (xpath="(//a[@class='woodmart-nav-link'])[30]")
	private WebElement  contact;
	
	
	//Help header Ends
	@FindBy (xpath="(//a[@title='My account'])[1]")
	private WebElement  myAccount;
	
	@FindBy (xpath="(//a[@aria-label='Search'])[1]")
	private WebElement  search;
	
	@FindBy (xpath="(//a[@href='https://www.heenakochhar.com/wishlist/'])[1]")
	private WebElement  wishlist;
	
	@FindBy (xpath="(//a[@title='Shopping cart'])[1]")
	private WebElement cart;
	
	//My Account
	@FindBy (xpath="(//a[@title='My account'])[1]")
	private WebElement  myAccountForLogout;
	
	
	@FindBy (xpath="(//span[text()='Dashboard'])[1]")
	private WebElement  myAccountDashboard;
	
	
	@FindBy (xpath="(//span[text()='Logout'])[1]")
	private WebElement logout;
	
	@FindBy (xpath="(//span[text()='Addresses'])[1]")
	private WebElement address;
	
	@FindBy (xpath="(//span[text()='Orders'])[1]")
	private WebElement orders;
	
	@FindBy (xpath="(//span[text()='Wishlist'])[1]")
	private WebElement wishlistMyaccount;
	
	@FindBy (xpath="(//input[@title='Search for products'])[2]")
	private WebElement searchProduct;
	
	@FindBy (xpath="(//a[@title='My account'])[1]")
	private WebElement myAccountVerify;
	
	//My account ends
	//Constructor
	public Header(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driverg=driver;
		act=new Actions(driverg);
	}
	
	
	//Method
	
	public void clickOnLogo()
	{
		logo.click();
	}
	
	public void verifyHeader()
	{
		int count=1;
		while(count<=31)
		{
				
		for(WebElement e:links)
		{
			e.getText();
			System.out.println(e.getText());
		}
			
			count++;
			break;
		}
	}
	
	public void hoverOnCollection()
	{
		act.moveToElement(accessories).perform();
	}
	public void clickOnGulfaiz()
	{
		gulfaiz.click();
	}
	public void clickOnHamnafas()
	{
		hamnafas.click();
	}
	public void clickOnSaawan()
	{
		act.click(saawan).click().build().perform();
	}
	public void clickOnSheerKhurma()
	{
		sheerKhurma.click();
	}
	public void clickOnChandBibi()
	{
		chandBibi.click();
	}
	public void clickOnAlehda()
	{
		alehda.click();
	}
	public void clickOngulNilofer()
	{
		gulNilofer.click();
	}
	public void clickOnSherbat()
	{
		sherbat.click();
	}
	public void clickOnTarruf()
	{
		tarruf.click();
	}
	public void clickOnDhoopKinarey()
	{
		dhoopKinarey.click();
	}
	public void clickOnKhuld()
	{
		khuld.click();
	}
	public void clickOnHussna()
	{
		hussna.click();
	}
	public void clickOnMadno()
	{
		madno.click();
	}
	public void clickOnChakori()
	{
		chakori.click();
	}
	public void clickOnDastangoi()
	{
		dastangoi.click();
	}
	public void clickOnDilNoor()
	{
		dilNoor.click();
	}
	public void clickOnDilli()
	{
		dilli.click();
	}
	public void clickOnJanab()
	{
		janab.click();
	}
	public void hoverOnAccessories()
	{
		
		act.moveToElement(accessories).perform();
	}
	public void clickOnParandi()
	{
		parandi.click();
	}
	public void clickOnPotlisJholas()
	{
		potlisJholas.click();
	}
	public void clickOnJuttis()
	{
		juttis.click();
	}
	public void clickOnBestSeller()
	{
		bestSeller.click();
	}
	public void clickOnBlog()
	{
		blog.click();
	}
	
	public void hoverOnHelp()
	{
		
		act.moveToElement(help).perform();
	}
	
	public void clickOnAbout()
	{
		about.click();
	}
	
	public void clickOnFaqs()
	{
		faqs.click();
	}
	
	public void clickOnContact()
	{
		contact.click();
	}
	
	public void openSignInPage()
	{
		myAccount.click();
		
	}
	
	public String myAccountVerify()
	{
		String login=myAccount.getText();
		
		return login;
	}
	
	public void clickOnSearch()
	{
		search.click();
	}
	
	public void clickOnWishlist()
	{
		wishlist.click();
	}

	public void clickOnCart()
	{
		act.moveToElement(cart).click().build().perform();
		
	}
	
	
	public void clickOnLogout()
	{
		logout.click();
	}
	
	public void clickOnWishlistMyaccount()
	{
		wishlistMyaccount.click();
	}
	
	public void clickOnAddress()
	{
		address.click();
	}
	
	public void clickOnOrders()
	{
		orders.click();
	}
	public void hoverOnMyAccountForLogout()
	{
		act.moveToElement(myAccountForLogout).build().perform();
	}
	
	public String clickOnSearchProduct(String product)
	{
		searchProduct.click();
		act.moveToElement(searchProduct).click().build().perform();
		searchProduct.sendKeys(product);
		act.click().perform();
		return product;
		
	}
	
	public void clickOnmyAccountDashboard()
	{
		act.moveToElement(myAccountDashboard).click().build().perform();
	}
}
