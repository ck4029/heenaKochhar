package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MadeToOrder {

	@FindBy (xpath="//input[@name='kurta-length']")
	private WebElement length;
	
	@FindBy (xpath="//input[@name='across-back']")
	private WebElement acrossBack;
	
	@FindBy (xpath="//input[@name='across-front']")
	private WebElement acrossFront;
																						
	
	@FindBy (xpath="//input[@name='shoulder']")
	private WebElement shoulder;
	
	@FindBy (xpath="//input[@name='upper-bust']")
	private WebElement upperBust;
	
	@FindBy (xpath="//input[@name='bust']")
	private WebElement bust;
	
	@FindBy (xpath="//input[@name='under-bust']")
	private WebElement underBust;
	
	@FindBy (xpath="//input[@name='waist']")
	private WebElement waist;
	
	@FindBy (xpath="//input[@name='hip']")
	private WebElement hip;
	
	@FindBy (xpath="//input[@name='arm-hole']")
	private WebElement armHole;
	
	@FindBy (xpath="//input[@name='bicep']")
	private WebElement bicep;
	
	@FindBy (xpath="//input[@name='elbow']")
	private WebElement elbow;
	
	@FindBy (xpath="//input[@name='wrist-circumference']")
	private WebElement wristCircumference;
	
	@FindBy (xpath="//input[@name='sleeve-length']")
	private WebElement sleeveLength;
	
	@FindBy (xpath="//input[@name='neck-deep-front']")
	private WebElement neckDeepFront;
	
	@FindBy (xpath="//input[@name='neck-deep-back']")
	private WebElement neckDeepBack;
	
	@FindBy (xpath="//input[@name='bottom-length']")
	private WebElement bottomLength;
	
	@FindBy (xpath="//input[@name='bottom-waist']")
	private WebElement bottomWaist;
	
	@FindBy (xpath="//input[@name='thigh']")
	private WebElement thigh;
	
	@FindBy (xpath="//input[@name='knee']")
	private WebElement knee;
	
	@FindBy (xpath="//input[@name='bottom-circumference-ankle']")
	private WebElement bottomCircumferenceAnkle;
	
	@FindBy (xpath="(//input[@type='submit'])[1]")
	private WebElement submit;
	
	//Made To Order Ends
	
	
	
	//Constructor
	
	public MadeToOrder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//methods
	public String insertLength(String leng)
	{
		length.sendKeys(leng);
		return leng; 
	}
	public String insertacrossBack(String crossBack)
	{
		acrossBack.sendKeys(crossBack);
		return crossBack;
	}
	public String insertacrossFront(String crossFrontS)
	{
		acrossFront.sendKeys(crossFrontS);
		return crossFrontS;
		
	}
	public String insertshoulder(String shoulderS)
	{
		shoulder.sendKeys(shoulderS);
		return shoulderS;
	}
	public String insertupperBust(String upperBustS)
	{
		upperBust.sendKeys(upperBustS);
		return upperBustS;
	}
	public String insertbust(String bustS)
	{
		bust.sendKeys(bustS);
		return bustS;
	}
	public String insertunderBust(String underBustS)
	{
		underBust.sendKeys(underBustS);
		return underBustS;
	}
	public String insertwaist(String waistt)
	{
		waist.sendKeys(waistt);
		return waistt;
	}
	public String inserthip(String thipp)
	{
		hip.sendKeys(thipp);
		return thipp;
	}
	public String insertarmHole(String armHoles)
	{
		armHole.sendKeys(armHoles);
		return armHoles;
	}
	public String insertbicep(String biceps)
	{
		bicep.sendKeys(biceps);
		return biceps;
	}
	public String insertelbow(String elbows)
	{
		elbow.sendKeys(elbows);
		return elbows;
	}
	public String insertwristCircumference(String wristCircumferences)
	{
		wristCircumference.sendKeys(wristCircumferences);
		return wristCircumferences;
	}
	public String insertsleeveLength(String sleeveLeng)
	{
		sleeveLength.sendKeys(sleeveLeng);
		
		return sleeveLeng;
	}
	public String insertneckDeepFront(String neckDeepFronts)
	{
		neckDeepFront.sendKeys(neckDeepFronts);
		return neckDeepFronts;
	}
	public String insertneckDeepBack(String neckDeepBacks)
	{
		neckDeepBack.sendKeys(neckDeepBacks);
		return neckDeepBacks;
	}
	public String insertbottomLength(String bottomLeng)
	{
		bottomLength.sendKeys(bottomLeng);
		return bottomLeng;
	}
	public String insertbottomWaist(String bottomWaistS)
	{
		bottomWaist.sendKeys(bottomWaistS);
		return bottomWaistS;
	}
	public String insertthigh(String thighS)
	{
		thigh.sendKeys(thighS);
		return thighS;
	}
	public String insertknee(String kneeS)
	{
		knee.sendKeys(kneeS);
		return kneeS;
	}
	public String insertbottomCircumferenceAnkle(String cirmcumAnkle)
	{
		bottomCircumferenceAnkle.sendKeys(cirmcumAnkle);
		return cirmcumAnkle;
	}
	public void insertsubmit()
	{
		submit.click();
	}
	
}
