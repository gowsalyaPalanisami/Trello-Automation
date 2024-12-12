package Genericity;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import generciutility.FileUtility;
import generciutility.WebDriverUtility;

public class BasisClass {
	
	public WebDriver driver;
	public FileUtility fileutils = new FileUtility();
	public WebDriverUtility WebDriverUtils = new WebDriverUtility();
	
	@BeforeClass
	public void BaseDetails() throws Throwable
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
	
	
}
