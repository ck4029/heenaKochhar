package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LostYourPassword {
//Variable
	@FindBy(xpath="//input[@name='user_login']")
	private WebElement userName;
	
	@FindBy(xpath="//button[text()='Reset password']")
	private WebElement resetPassword;
	//Constructor
	
	public LostYourPassword(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Method
	
	public void sendUserName()
	{
		userName.sendKeys("dudes heart");
	}
	public void clickOnResetPassword()
	{
		resetPassword.click();
	}
	
}
