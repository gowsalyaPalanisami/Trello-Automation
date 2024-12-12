package POMRepo_Genericity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//1.global variable
//2.constrictor
//3.reinitialization
public class TrelloHomePage1 {
	WebDriver driver;
	
	public TrelloHomePage1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath = "//a[.='Get Trello for free']/preceding-sibling::a[.='Log in']")
//	private WebElement LoginOption;
//
//	public WebElement getLoginOption() {
//		return LoginOption;
//	}
	
	@FindBy(xpath = "//input[@class = 'UiEmailSignupstyles__InputEmail-sc-9nggyw-1 ZIPtJ']")
	private WebElement emailtxtfield;

	public WebElement getEmailtxtfield() {
		return emailtxtfield;
	}

	@FindBy(xpath = "(//button[@type = 'submit'])[1]")
	private WebElement signUpitsFreeButton;
	
	public WebElement getSignUpitsFreeButton() {
		return signUpitsFreeButton;
	}

	
	
	
	
		
		
		
		

}
