package Synchronization;


import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Genericity.BottomClass;
import POMRepo_Genericity2.LoginToContiPage2;
import POMRepo_Genericity2.TrelloHomePage2;

public class TopClass extends BottomClass {
	
	@Test
	public void Login() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		webdriverutils.implicitWait(driver);
		TrelloHomePage2 homepage2 = new TrelloHomePage2(driver);
		String HomepageTitle = driver.getTitle();
		System.out.println("HomepageTitle : " +HomepageTitle);
		homepage2.getLoginOption().click();
		Thread.sleep(3000);
		LoginToContiPage2 loginpage2 = new LoginToContiPage2(driver);
		String Loginpagetitle = driver.getTitle();
		System.out.println("Loginpagetitle : " +Loginpagetitle);
		loginpage2.getEmailtxtfield().sendKeys(fileutils.getValueForkey("email"));
		loginpage2.getLoginContinueButton().click();
		driver.switchTo().activeElement().sendKeys(fileutils.getValueForkey("password"));
		Thread.sleep(3000);
		loginpage2.getFlutterButton().click();
	
		if(loginpage2.getFlutterButton().isEnabled())
		{
			System.out.println("Status of Flutter button :  is enabled");
		}
		else
		{
			System.out.println("Status of Flutter button :  is disabled");
		}
		loginpage2.getPassLoginButton().click();
		
		wait.until(ExpectedConditions.not(ExpectedConditions.titleContains(Loginpagetitle)));
		System.out.println(driver.getTitle());
		
		
		
	}

}
