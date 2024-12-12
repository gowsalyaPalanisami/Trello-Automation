package POMrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginToContinuePage {
	WebDriver driver;

	public TrelloLoginToContinuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement usernameTextfield;

	@FindBy(xpath = "//button[@id='login-submit' and .='Continue']")
	private WebElement continueSubmitButton;

	@FindBy(id = "password")
	private WebElement passwordTextfield;

	@FindBy(xpath = "//button[@id='login-submit' and .='Log in']")
	private WebElement logInSubmitButton;

	public WebElement getUsernameTextfield() {
		return usernameTextfield;
	}

	public WebElement getContinueSubmitButton() {
		return continueSubmitButton;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLogInSubmitButton() {
		return logInSubmitButton;
	}

}
