package Genericutility2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import POMrepository.TrelloBoardsPage;
import POMrepository.TrelloHomePage;
import POMrepository.TrelloLoginToContinuePage;
import POMrepository.TrelloLogoutPage;

public class FoundationClass {
	public WebDriver driver;
	public FileUtility fileUtils = new FileUtility();
	public WebDriverUtility webdriverUtils=new WebDriverUtility();

	@BeforeClass
	public void configBeforeMethod() throws Throwable {
		// Launch Browser
		String browserName = fileUtils.getValueForkey("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
		// Maximize the browser
		driver.manage().window().maximize();
		// Trigger the URL
		driver.get(fileUtils.getValueForkey("url"));
	}

	@AfterClass
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();
	}
	
	public void trelloLogin() throws Throwable {
		webdriverUtils.implicitWait(driver);
		TrelloHomePage homePage = new TrelloHomePage(driver);
		homePage.getLoginOption().click();
		TrelloLoginToContinuePage loginToCont = new TrelloLoginToContinuePage(driver);
		loginToCont.getUsernameTextfield().sendKeys(fileUtils.getValueForkey("email"));
		loginToCont.getContinueSubmitButton().submit();
		loginToCont.getPasswordTextfield().sendKeys(fileUtils.getValueForkey("password"));
		loginToCont.getLogInSubmitButton().submit();
	}
	public void trelloLogout() {
		webdriverUtils.implicitWait(driver);
		TrelloBoardsPage boardsPage = new TrelloBoardsPage(driver);
		boardsPage.getUserMenuOption().click();
		boardsPage.getLogoutOption().click();
		TrelloLogoutPage logoutPage = new TrelloLogoutPage(driver);
		logoutPage.getLogoutSubmitButton().submit();
	}
}


