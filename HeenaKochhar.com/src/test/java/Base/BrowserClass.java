package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserClass {

	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openEdgeBrowser()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Automation\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();	
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
}
