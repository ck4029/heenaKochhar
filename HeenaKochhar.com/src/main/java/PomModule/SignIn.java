package PomModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn 
{
	//variable
		@FindBy(xpath="(//a[text()='close'])[1]")
		private WebElement close;
		
		@FindBy(xpath="(//input[@type='text'])[3]")
		private WebElement userName;
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement password;
		
		//check box
		@FindBy(xpath="//span[text()='Remember me']")
		private WebElement rememberMe;
		
		@FindBy(xpath="(//button[@type='submit'])[2]")
		private WebElement submit;
		
		//LostYourPassword
		@FindBy(xpath="//a[text()='Lost your password?']")
		private WebElement lostYourPassword;
		
		//CreateNewAccount
		
		@FindBy(xpath="//a[text()='Create an Account']")
		private WebElement createNewAccount;
		
		//validation username and password wrong credentials
		
		@FindBy (xpath="//li[text()=': The username or password you entered is incorrect. ']")
		private WebElement incorrectPassword; 
		
		@FindBy (xpath="//li[text()=' The password field is empty. ']")
		private WebElement emptyPass;
		
		@FindBy (xpath="//li[text()=' Username is required. ']")
		private WebElement emptyUsername;
		
		@FindBy (xpath="//label[@for='username']")
		private WebElement usernamePlaceholder;
		
		@FindBy (xpath="//label[@for='password']")
		private WebElement passwordPlaceholder;
		
		@FindBy (xpath="//button[@name='login']")
		private WebElement verifySubmit;
		//constructor
		
		public SignIn(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		//method
		public String sendUsername(String username)
		{
			userName.sendKeys(username);
			return username;
		}
		public String sendpassword(String pass)
		{
			password.sendKeys(pass);
			return pass;
		}
		public void clickOnRememberMe()
		{
			rememberMe.click();
			boolean result=rememberMe.isSelected();
			if(result==true)
			{
				System.out.println("Check box is selected: "+result);
				rememberMe.click();
			}
			else
			{
				System.out.println("Check box is not selected: "+result);
				rememberMe.click();
			}
					
		}
		public void clickOnSubmit()
		{
			submit.click();
		}
		
		public void clickOnLostYourPassword()
		{
			lostYourPassword.click();
		}
		
		public void clickOnCreateNewAccount()
		{
			createNewAccount.click();
		}
		
		public String verifyIncorrectPassword()
		{
			String pass=incorrectPassword.getText();
			return pass;
		}

		public String verifyEmptyPassword()
		{
			String emppass=emptyPass.getText();
			return emppass;
		}
		
		public String verifyEmptyUsername()
		{
			String empUsername=emptyUsername.getText();
			return empUsername;
		}
		
		public String verifyUsernamePlaceholder()
		{
			String namePlaceholder=usernamePlaceholder.getText();
			return namePlaceholder;
		}
		
		public String verifyPasswordPlaceholder()
		{
			String passPlaceholder=passwordPlaceholder.getText();
			return passPlaceholder;
		}
		public String verifySubmit(String submitVerif)
		{
			verifySubmit.getAttribute(submitVerif);
			return submitVerif;
		}
}
