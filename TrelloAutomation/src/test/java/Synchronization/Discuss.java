package Synchronization;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POMrepository.TrelloHomePage;
import POMrepository.TrelloLoginToContinuePage;

import generciutility.BaseClass;

public class Discuss extends BaseClass {

	@Test
	public void login() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		webdriverUtils.implicitWait(driver);
		// Verify for the home page
		String expHomePageTitle = "Manage Your Team’s Projects From Anywhere | Trello";
		String actualHomePageTitle = driver.getTitle();
		if (actualHomePageTitle.equals(expHomePageTitle)) {
			System.out.println("Pass: TrelloHomePage is displayed upon verification Of it's title");
			TrelloHomePage homePage = new TrelloHomePage(driver);
			homePage.getLoginOption().click();
			String expLoginToContPage = "Log in to continue - Log in with Atlassian account";
			wait.until(ExpectedConditions.titleIs(expLoginToContPage));
			String actualLoginToContPage = driver.getTitle();
			if (actualLoginToContPage.equals(expLoginToContPage)) {
				System.out.println("Pass: The Login To Cont Page is displayed and it is verified.");
				System.out.println("actualLoginToContPage: " + actualLoginToContPage);
				System.out.println("expLoginToContPage: " + expLoginToContPage);
				TrelloLoginToContinuePage loginToCont = new TrelloLoginToContinuePage(driver);
				loginToCont.getUsernameTextfield().sendKeys(fileUtils.getValueForkey("email"));
				loginToCont.getContinueSubmitButton().submit();
				loginToCont.getPasswordTextfield().sendKeys(fileUtils.getValueForkey("password"));
				loginToCont.getLogInSubmitButton().submit();
			} else {
				System.out.println("Fail: The Login To Cont Page is not displayed and it is verified.");
				System.out.println("actualLoginToContPage: " + actualLoginToContPage);
				System.out.println("expLoginToContPage: " + expLoginToContPage);
			}

		} else {
			System.out.println("Fail: TrelloHomePage is not displayed upon verification Of it's title");
		}

	}

	@Test
	public void logOut() {

	}
}
