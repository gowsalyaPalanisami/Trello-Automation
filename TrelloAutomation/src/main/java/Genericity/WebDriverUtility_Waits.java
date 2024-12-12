package Genericity;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility_Waits {
	
	public void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
