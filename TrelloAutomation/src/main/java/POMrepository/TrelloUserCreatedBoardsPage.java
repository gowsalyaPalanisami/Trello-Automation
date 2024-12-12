package POMrepository;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloUserCreatedBoardsPage {
	WebDriver driver;

	public TrelloUserCreatedBoardsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "button[aria-label='Show menu']")
	private WebElement showMenuOption;
	
	@FindBy(xpath = "//button[.='Close board']")
	private WebElement closeBoardMenuOption;
	
	@FindBy(xpath = "//button[.='Close']")
	private WebElement confirmCloseButton;
	
	@FindBy(xpath = "//button[.='Permanently delete board']")
	private	WebElement permanentlyDeleteBoardOption;
	
	@FindBy(xpath = "//button[.='Delete']")
	private WebElement deleteConfirmButton;

	public WebElement getShowMenuOption() {
		return showMenuOption;
	}

	public WebElement getCloseBoardMenuOption() {
		return closeBoardMenuOption;
	}

	public WebElement getConfirmCloseButton() {
		return confirmCloseButton;
	}

	public WebElement getPermanentlyDeleteBoardOption() {
		return permanentlyDeleteBoardOption;
	}

	public WebElement getDeleteConfirmButton() {
		return deleteConfirmButton;
	}
	
	
}


