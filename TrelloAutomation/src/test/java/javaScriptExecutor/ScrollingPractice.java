package javaScriptExecutor;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingPractice {
	@Test
	public void scroll() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,100)");
		jse.executeScript("window.scrollTo(0,100)");
		Thread.sleep(2000);
		jse.executeScript("window.scrollTo(0,50)");
		jse.executeScript("window.scrollTo(0,50)");	
	}
	
	@Test
	public void scrollAmount()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Object scrollHeight = jse.executeScript("return document.body.scrollHeight");
		System.out.println(scrollHeight + " : scrollHeight");
		Object scrollWidth = jse.executeScript("return document.body.scrollHeight");
		System.out.println(scrollWidth + " : scrollWidth");
	}
}
