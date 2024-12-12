package POMclass_genericiutility2_owntestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePage_1 {
	
	WebDriver driver;
	public TrelloHomePage_1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text() = 'Log In']")
	private WebElement Loginoption;
	
	public WebElement getLoginoption() {
		return Loginoption;
	}

	
	
	

}
