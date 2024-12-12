package InstagramPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramHomePage {
	WebDriver driver;
	
	public InstagramHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text() = 'Home']")
	private WebElement HomeOption;

	public WebElement getHomeOption() {
		return HomeOption;
	}
}
