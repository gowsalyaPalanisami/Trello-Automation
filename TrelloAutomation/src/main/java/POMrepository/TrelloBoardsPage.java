package POMrepository;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class TrelloBoardsPage {
	WebDriver driver;

	public TrelloBoardsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='board-tile mod-add' and contains(.,'Create new board')]")
	private WebElement createNewBoardOption;
	
	@FindBy(css = "input[data-testid='create-board-title-input']")
	private WebElement boardTitleTextField;
	
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement createBoardSubmitButton;
	
	@FindBy(css = "button[data-testid='header-member-menu-button']")
	private WebElement userMenuOption;
	
	@FindBy(css = "button[data-testid='account-menu-logout']")
	private WebElement logoutOption;

	@FindBy(xpath = "//div[@data-testid='cookies-consent-banner']//button[.='Accept all']")
	private WebElement acceptAllCookiesButton;
	
	@FindBy(xpath = "//a[@class='board-tile']//div[@title]")
	private List<WebElement> usercreatedBoards;
	
	public WebElement getCreateNewBoardOption() {
		return createNewBoardOption;
	}

	public WebElement getBoardTitleTextField() {
		return boardTitleTextField;
	}

	public WebElement getCreateBoardSubmitButton() {
		return createBoardSubmitButton;
	}

	public WebElement getUserMenuOption() {
		return userMenuOption;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}

	public WebElement getAcceptAllCookiesButton() {
		return acceptAllCookiesButton;
	}

	public List<WebElement> getUsercreatedBoards() {
		return usercreatedBoards;
	}
	
	
}


