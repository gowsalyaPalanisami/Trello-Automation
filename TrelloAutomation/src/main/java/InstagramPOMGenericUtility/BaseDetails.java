package InstagramPOMGenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import generciutility.WebDriverUtility;

public class BaseDetails {
	public WebDriver driver;
	public FileUtility FileUtils = new FileUtility();
	public WebDriverUtility webdriverUtils=new WebDriverUtility();
	
	@BeforeMethod
	public void configureMethod() throws Throwable
	{
		//launch browser
		String browserName = FileUtils.getValueForkey("browser");
		if(browserName.equals("Chrome"))
		{
			driver = new ChromeDriver();
		} else if(browserName.equals("fireFox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(FileUtils.getValueForkey("url"));
		
	}
	
	@AfterMethod
	public void configAfterMethod() throws Throwable
	{
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.quit();
	}

}
