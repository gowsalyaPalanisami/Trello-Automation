package Synchronization;

import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import InstagramPOMGenericUtility.BaseDetails;
import InstagramPOMclasses.InstagramHomePage;
import InstagramPOMclasses.InstagramLoginPage;
import InstagramPOMclasses.InstagramLogoutPage;
import InstagramPOMclasses.InstagramProfilePage;
import InstagramPOMclasses.InstagramSearch;

public class MainDetails extends BaseDetails{
	

	@Test
	public void login() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		webdriverUtils.implicitWait(driver);
		InstagramLoginPage login = new InstagramLoginPage(driver);
		login.getEmailtxtfield().sendKeys(FileUtils.getValueForkey("email"));
		login.getPasswordtxtfield().sendKeys(FileUtils.getValueForkey("password"));		
		login.getLoginButton().click();
		System.out.println("Login success");
		InstagramHomePage homepage = new InstagramHomePage(driver);
		homepage.getHomeOption().click();
		System.out.println("Homepage clicked");
		InstagramSearch search = new InstagramSearch(driver);
		Thread.sleep(5000);
		search.getInstaSearchOption().click();
		WebElement entername = search.getinnerSearch();
//		Actions actions = new Actions(driver);
		entername.sendKeys("girinath_r.p");
		Thread.sleep(5000);
		search.getexactName().click();	
		Thread.sleep(5000);
		System.out.println("I found girinath");
		search.getfollowRequest().click();
		System.out.println("Followrequest given");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println("Reached Homepage again");
		InstagramProfilePage profilepage = new InstagramProfilePage(driver);
		Thread.sleep(2000);
		profilepage.getProfileclick().click();
		Thread.sleep(2000);
		profilepage.getSettingsClick().click();
		Thread.sleep(2000);
		profilepage.getLogoutOption().click();
		Thread.sleep(2000);
		System.out.println("Logout success");
		InstagramLogoutPage logout = new InstagramLogoutPage(driver);
		String expInstagramLogoutPage = "Instagram";
		String actualtitle = driver.getTitle();
			if(expInstagramLogoutPage.equals(actualtitle))
			{
				System.out.println("pass");
				System.out.println("actualtitle :" +actualtitle);
				System.out.println("expInstagramLogoutPage : " +expInstagramLogoutPage);
				logout.getSignupAgain().click();
				Thread.sleep(2000);
			}
			else
			{
				System.out.println("Fail");
			}		
	}
	
	@Test
	public void logOut()
	{
		
	}
}
