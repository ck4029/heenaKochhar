import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomModule.Header;
import PomModule.Sadhya;
import PomModule.SawaanArchives;
import PomModule.SignIn;

public class test {

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
		
		header.hoverOnCollection();
		header.clickOnSaawan();
		
		SawaanArchives sawaanArchives=new SawaanArchives(drivertest);
		sawaanArchives.clickOnSadhya();
		
		Sadhya sadhya=new Sadhya(drivertest);
		sadhya.clickOnPlusQuantity();
		sadhya.clickOnAddToCart();
		
	}

}
