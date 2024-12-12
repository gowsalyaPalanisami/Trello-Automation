package InstagramPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLoginPage {
	WebDriver driver;
	public InstagramLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	private WebElement emailtxtfield;
	
	@FindBy(name = "password")
	private WebElement passwordtxtfield;
	
	@FindBy(css = "button[type = 'submit']")
	private WebElement loginButton;
	

	public WebElement getEmailtxtfield() {
		return emailtxtfield;
	}
	public WebElement getPasswordtxtfield() {
		return passwordtxtfield;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
}

