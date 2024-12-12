package Synchronization;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import POMclass_genericiutility2_owntestcase.LoginToContiPage_1;
import POMclass_genericiutility2_owntestcase.TrelloAutomationPage;
import POMclass_genericiutility2_owntestcase.TrelloBoardsPage_1;
import POMclass_genericiutility2_owntestcase.TrelloHomePage_1;
import POMclass_genericiutility2_owntestcase.TrelloLogout_1;
import generciutility.WebDriverUtility;
import generciutility2_Owntestcase.GroundClass;

public class SkyClass extends GroundClass {
	
	@Test
	public void LoginFeature() throws Throwable
	{
		WebDriverUtility.implicitWait(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		TrelloHomePage_1 homePage = new TrelloHomePage_1(driver);
		String ExpectedTitle = "Manage Your Team’s Projects From Anywhere | Trello";
		wait.until(ExpectedConditions.titleIs(ExpectedTitle));
		String Actualtitle = driver.getTitle();
		if(Actualtitle.equals(ExpectedTitle))
		{
			System.out.println("Pass: Title is verified : " + Actualtitle );
			System.out.println("Actualtitle : " +Actualtitle);
			System.out.println("ExpectedTitle : " +ExpectedTitle);
		}
		else
			System.out.println("Fail :  Title is not verified ");
		homePage.getLoginoption().click();
		System.out.println("Actualtitle : " +Actualtitle);
		System.out.println("ExpectedTitle : " +ExpectedTitle);
		LoginToContiPage_1 loginPage = new LoginToContiPage_1(driver);
		String ExpectedLoginPageTitle = "Log in to continue - Log in with Atlassian account";
		Thread.sleep(3000);
		String ActualloginpageTitle = driver.getTitle();
		if(ActualloginpageTitle.equals(ExpectedLoginPageTitle))
		{
			System.out.println("Pass : " +ActualloginpageTitle);
			System.out.println("ActualloginpageTitle : " +ActualloginpageTitle);
			System.out.println("ExpectedLoginPageTitle : " +ExpectedLoginPageTitle);
			
		}
		else
			System.out.println("Fail ");
		loginPage.getEmailtxtfield().sendKeys(fileutils.getValueForkey("email"));
		loginPage.getLoginContinueButton().click();
		WebElement Passwordfield = wait.until(ExpectedConditions.elementToBeClickable(loginPage.getPasswordtxtfield()));
		Passwordfield.sendKeys(fileutils.getValueForkey("password"));
		loginPage.getFlutterButton().click();
		loginPage.getPassLoginButton().click();
		Thread.sleep(3000);
		TrelloBoardsPage_1 BoardsPage = new TrelloBoardsPage_1(driver);
		System.out.println(driver.getTitle());
		WebElement clickmember = wait.until(ExpectedConditions.elementToBeClickable(BoardsPage.getClickMembersOption()));
		clickmember.click();
		BoardsPage.getInviteWorkspaceMemberOption().click();
		BoardsPage.getEmailtxtName().sendKeys(fileutils.getValueForkey("emailaddress"));
		BoardsPage.getEmailtxtName().sendKeys(Keys.ENTER);
		BoardsPage.getSendInviteOption().click();
		BoardsPage.getRemoveMemeberOption().click();
		BoardsPage.getremoveMemberfromWorkspace().click();
		driver.navigate().back();
		driver.navigate().back();
		BoardsPage.getNewTrelloBoard().click();
		BoardsPage.getboardTitleField().sendKeys(fileutils.getValueForkey("Boardtitle"));
		BoardsPage.getCreateBoardOption().click();
		TrelloAutomationPage AutomationPage = new TrelloAutomationPage(driver);
		AutomationPage.getChangeVisibilityOption().click();
		AutomationPage.getPrivateOption().click();
		AutomationPage.getaddListOption().click();
		AutomationPage.getenterListNameOption().sendKeys(fileutils.getValueForkey("Listname"));
		AutomationPage.getaddList().click();
		driver.navigate().back();
	}
	
	@Test
	public void LogoutFeature() throws Throwable
	{
		TrelloLogout_1 logout = new TrelloLogout_1(driver);
		logout.getClickProfileOption().click();
		logout.getLogoutOption().click();
		String ExpectedLogouttitle = "Log out of your Atlassian account - Log in with Atlassian account";
		Thread.sleep(3000);
		String actualLogoutTitle = driver.getTitle();
		if(actualLogoutTitle.equals(ExpectedLogouttitle))
		{
			System.out.println("pass ");
			System.out.println("ExpectedLogouttitle : " +ExpectedLogouttitle);
			System.out.println("actualLogoutTitle : " +actualLogoutTitle);
		}
		logout.getLogoutPage().click();
	}

}
