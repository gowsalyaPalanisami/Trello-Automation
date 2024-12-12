package Synchronization;

import java.io.IOException;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Genericity.BasisClass;
import POMRepo_Genericity.LoginToContinuePage;
import POMRepo_Genericity.SignupToContinuePage;
import POMRepo_Genericity.TrelloHomePage1;

public class MajorClass extends BasisClass{
	
	@Test
	public void Signup() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		String Expectedtitle = "Manage Your Team’s Projects From Anywhere | Trello";
		wait.until(ExpectedConditions.titleIs(Expectedtitle));
		String Actualtitle = driver.getTitle();
		if(Actualtitle.equals(Expectedtitle))
		{
			System.out.println("Pass : Home page title is verified and is same");
			System.out.println(driver.getTitle());
			TrelloHomePage1 homepage = new TrelloHomePage1(driver);
			homepage.getEmailtxtfield().sendKeys(fileutils.getValueForkey("email"));
			homepage.getSignUpitsFreeButton().click();
		}
		else
		{
			System.out.println("Fail :  Home page title is verified and not same");
		}
		SignupToContinuePage signup = new SignupToContinuePage(driver);
		System.out.println(driver.getTitle());
		signup.getSignUpButton().click();
		
		LoginToContinuePage login = new LoginToContinuePage(driver);
		String ExpectedErrorTitle = "It looks like you've already got an account associated with this email. Log in instead or reset your password if you've forgotten it";
        Thread.sleep(5000);
		String ActualErrorTitle = login.getLoginToContinuePage().getText();
	
		if(ActualErrorTitle.equals(ExpectedErrorTitle))
	    {
	    	System.out.println(ActualErrorTitle);
	    	System.out.println(ExpectedErrorTitle);
	    	System.out.println("Login Failed : You have account already");
	    }
	    else
	    	System.out.println("Login success : you can create new account");
	}
	
	@Test
	public void close()
	{
		driver.manage().window().minimize();
		driver.quit();
	}
}
