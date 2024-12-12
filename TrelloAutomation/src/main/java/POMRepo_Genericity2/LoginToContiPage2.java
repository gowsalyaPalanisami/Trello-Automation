package POMRepo_Genericity2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToContiPage2 {
WebDriver driver;
	
	public LoginToContiPage2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement emailtxtfield;
	
	@FindBy(xpath = "//span[text() = 'Continue']")
	private WebElement LoginContinueButton;
	
	@FindBy(id = "password")
	private WebElement passwordtxtfield;
	
	@FindBy(xpath = "//span[text() = 'Log in']")
	private WebElement PassLoginButton;
	
	@FindBy(xpath = "//input[@id = 'password']/..//span[@aria-hidden='true']")
	private WebElement FlutterButton;

	@FindBy(xpath = "//span[text() = 'Log in']")
	private WebElement Loginbutton;
	

	public WebElement getEmailtxtfield() {
		return emailtxtfield;
	}

	public WebElement getLoginContinueButton() {
		return LoginContinueButton;
	}

	public WebElement getPasswordtxtfield() {
		return passwordtxtfield;
	}

	public WebElement getPassLoginButton() {
		return PassLoginButton;
	}

	public WebElement getFlutterButton() {
		return FlutterButton;
	}
	
	public WebElement getLoginbutton()
	{
		return Loginbutton;
	}
}
