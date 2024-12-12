package POMclass_genericiutility2_owntestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLogout_1 {
WebDriver driver;
	
	public TrelloLogout_1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//span[@aria-label = 'Gowsalya (gowsalyapalanisami95)']")
	private WebElement clickProfileOption;
	
	@FindBy(xpath = "//span[text() = 'Log out']")
	private WebElement LogoutOption;
	
	@FindBy(xpath = "//span[text() = 'Log out']")
	private WebElement LogoutPage;

	public WebElement getClickProfileOption() {
		return clickProfileOption;
	}

	

	public WebElement getLogoutOption() {
		return LogoutOption;
	}

	

	public WebElement getLogoutPage() {
		return LogoutPage;
	}

	

}
