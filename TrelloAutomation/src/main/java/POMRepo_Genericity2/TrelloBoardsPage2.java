package POMRepo_Genericity2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoardsPage2 {

	WebDriver driver;
	public TrelloBoardsPage2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
