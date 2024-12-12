package InstagramPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLogoutPage {
	WebDriver driver;
	
	public InstagramLogoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text() = 'Sign up']")
	private WebElement signupAgain;

	public WebElement getSignupAgain() {
		return signupAgain;
	}
}
