package FacebookTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDrivenTesting {
	WebDriver driver;
	@Parameters("browserName")
	@Test(enabled = false)
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}else if(browserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
	}
	
	@Parameters({"browserName", "url", "username", "pwd"})
	@Test
	public void sampleScript(String browserName, String url, String username, String pwd)
	{
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}else if(browserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[.='Sign in']")).submit();
	}

}
