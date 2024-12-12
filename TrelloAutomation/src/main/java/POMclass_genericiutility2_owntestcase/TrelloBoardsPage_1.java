package POMclass_genericiutility2_owntestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoardsPage_1 {
	WebDriver driver;
	
	public TrelloBoardsPage_1(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getClickMembersOption() {
		return clickMembersOption;
	}
	
	public WebElement getInviteWorkspaceMemberOption() {
		return inviteWorkspaceMemberOption;
	}

	public WebElement getEmailtxtName() {
		return emailtxtName;
	}

	public WebElement getSendInviteOption() {
		return sendInviteOption;
	}
	
	public WebElement getRemoveMemeberOption() {
		return removeMemeberOption;
	}

	public WebElement getremoveMemberfromWorkspace() {
		return removeMemberfromWorkspace;
	}
	
	public WebElement getNewTrelloBoard() {
		return newTrelloBoard;
	}
	public WebElement getboardTitleField()
	{
		return boardTitleField;
	}
	
	public WebElement getCreateBoardOption() {
		return createBoardOption;
	}
	public WebElement getclickonSeleniumBoardOption()
	{
		return clickonSeleniumBoardOption;
	}


	@FindBy(xpath = "(//span[text() = 'Members'])[1]")
	private WebElement clickMembersOption;
	
	@FindBy(xpath = "//button[@class = 'w2Ok_QPiPTxPuy bxgKMAm3lq5BpA SdamsUKjxSBwGb SEj5vUdI3VvxDc']")
	private WebElement inviteWorkspaceMemberOption;
	
	@FindBy(xpath = "//input[@placeholder = 'Email address or name']")
	private WebElement emailtxtName;
	
	@FindBy(xpath = "//span[text() = 'Send invite']")
	private WebElement sendInviteOption;
	
	@FindBy(xpath = "//button[contains(@class , 'RGbFPavlhzMAS7 bxgKMAm3lq5BpA SEj5vUdI3VvxDc')]")
	private WebElement removeMemeberOption;
	
	@FindBy(xpath = "//p[text() = 'Remove from Workspace']")
	private WebElement removeMemberfromWorkspace;

	@FindBy(xpath = "//span[text() = 'Create new board']")
	private WebElement newTrelloBoard;
	
	@FindBy(xpath = "//input[@data-testid = 'create-board-title-input']")
	private WebElement boardTitleField;
	
	@FindBy(xpath = "//button[@data-testid = 'create-board-submit-button']")
	private WebElement createBoardOption;
	
	@FindBy(xpath = "(//div[@class = 'LinesEllipsis  '])[2]")
	private WebElement clickonSeleniumBoardOption;
	
	

}
