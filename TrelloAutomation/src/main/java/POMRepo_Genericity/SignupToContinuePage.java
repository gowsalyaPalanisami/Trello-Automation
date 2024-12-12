package POMRepo_Genericity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupToContinuePage{
	
	WebDriver driver;
	public SignupToContinuePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text() = 'Sign up']")
	private WebElement signUpButton;
	
	public WebElement getSignUpButton() {
		return signUpButton;
	}
	
}
