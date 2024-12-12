package InstagramPOMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramSearch {
	WebDriver driver;
	
	public InstagramSearch(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//span[text() = 'Search']")
	private WebElement instaSearchOption;
	
	@FindBy(css = "input[aria-label = 'Search input']")
	private WebElement innerSearch;
	
	@FindBy(xpath = "//span[text() = 'g.i.r.i.n.a.t.h_r.p']")
	private WebElement exactName;
	
	@FindBy(xpath = "(//div[@dir = 'auto'])[1]")
	private WebElement followRequest;
	
	public WebElement getInstaSearchOption() {
		return instaSearchOption;
	}
	
	public WebElement getinnerSearch()
	{
		return innerSearch;
	}
	
	public WebElement getexactName()
	{
		return exactName;
	}
	
	public WebElement getfollowRequest()
	{
		return followRequest;
		
	}
	

}
