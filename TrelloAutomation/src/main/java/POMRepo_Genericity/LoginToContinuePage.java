package POMRepo_Genericity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToContinuePage {
	WebDriver driver;
	
	public LoginToContinuePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "login-info")
	private WebElement LoginToContinuePage;

	public WebElement getLoginToContinuePage() {
		return LoginToContinuePage;
	}
}
