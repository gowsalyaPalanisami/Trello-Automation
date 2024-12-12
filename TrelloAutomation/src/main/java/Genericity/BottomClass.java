package Genericity;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import generciutility.FileUtility;
import generciutility.WebDriverUtility;

public class BottomClass {
	
	public WebDriver driver;
	public FileUtility fileutils = new FileUtility();
	public WebDriverUtility webdriverutils = new WebDriverUtility();
	
	@BeforeClass
	public void primarySetUp() throws Throwable
	{
		String browser = fileutils.getValueForkey("browser");
		if(browser.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
			driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(fileutils.getValueForkey("url"));
		}
	
	@AfterClass
	public void finalSetUp()
	{
		driver.manage().window().minimize();
//		driver.quit();
	}
	
	}


