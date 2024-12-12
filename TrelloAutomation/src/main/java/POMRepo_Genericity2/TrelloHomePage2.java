package POMRepo_Genericity2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePage2 {
	WebDriver driver;
	
	public TrelloHomePage2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class = 'Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")
	private WebElement LoginOption;

	public WebElement getLoginOption() {
		return LoginOption;
	}
	

}
