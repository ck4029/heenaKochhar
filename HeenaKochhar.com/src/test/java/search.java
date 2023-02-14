import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomModule.Header;
import PomModule.SignIn;

public class search {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drivertest=new ChromeDriver();
		drivertest.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		drivertest.manage().window().maximize();
		
		drivertest.get("https://www.heenakochhar.com");
		
		Header header=new Header(drivertest);
		header.openSignInPage();
		
		SignIn signin=new SignIn(drivertest);
		signin.sendUsername("dudes heart");
		signin.sendpassword("Suruchi@21jan");
		signin.clickOnSubmit();
		
		header.clickOnSearch();
		header.clickOnSearchProduct("juttis");
	}

}
