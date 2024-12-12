package Genericutility2;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
/**
 * It will be used to specify the time for finding the element in the DOM during run if loading is delayed.
 * implicitly the wait will applied for every invocation of findElement() or @findBy
 * @author Priya
 * @param driver
 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	/**
	 * It will be used to wait for the title of the webpage to get loaded and to verify the complete part Of it.
	 * @author Divagar
	 * @param driver
	 * @param expectedTitle
	 * @return
	 */
	public boolean waitForCompleteTitle(WebDriver driver, String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean value = wait.until(ExpectedConditions.titleIs(expectedTitle));
		return value;
	}
}

