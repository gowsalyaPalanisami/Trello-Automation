package POMclass_genericiutility2_owntestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloAutomationPage {
	
	WebDriver driver;
	
	public TrelloAutomationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getaddListOption() {
		return addListOption;
	}

	public WebElement getChangeVisibilityOption() {
		return changeVisibilityOption;
	}


	public WebElement getPrivateOption() {
		return privateOption;
	}

	public WebElement getenterListNameOption()
    {
    	return enterListNameOption;
    }
	
	public WebElement getaddList() {
		return addList;
	}
	
	
	@FindBy(xpath = "//button[@data-testid = 'board-visibility-option-org']")
	private WebElement changeVisibilityOption;
	
	@FindBy(xpath = "//button[@data-testid = 'board-visibility-dropdown-Private']")
	private WebElement privateOption;
	
	@FindBy(css = "button[data-testid = 'list-composer-button']")
	private WebElement addListOption;
	
	@FindBy(name = "Enter list name…")
	private WebElement enterListNameOption;
	
	@FindBy(css = "button[type = 'submit']")
	private WebElement addList;
	
	

}
