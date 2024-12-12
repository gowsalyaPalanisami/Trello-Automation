package InstagramPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramProfilePage {
	WebDriver driver;
	
	public InstagramProfilePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text() = 'Profile']")
	private WebElement profileclick;
	
	@FindBy(css = "svg[aria-label = 'Options']")
	private WebElement settingsClick;
	
	@FindBy(xpath = "//button[text() = 'Log Out']")
	private WebElement logoutOption;

	public WebElement getProfileclick() 
	{
		return profileclick;
	}
	
	public WebElement getSettingsClick() {
		return settingsClick;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}
}
