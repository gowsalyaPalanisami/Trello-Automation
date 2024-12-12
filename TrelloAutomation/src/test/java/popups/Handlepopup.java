package popups;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Handlepopup {
	WebDriver driver;

	@Test
	// if popup closed source code will not be there in hidden division popup
	public void hiddenDivisionpopup() throws Throwable {
		// location access
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		WebElement closebutton = driver.findElement(By.id("closeBtn"));
		Thread.sleep(3000);
		closebutton.click();
		driver.quit();
	}

	@Test
	public void flipkartHdpopup() throws Throwable, TimeoutException, NoSuchElementException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		WebElement popupCloseButton;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		for (;;) {
			try {
				popupCloseButton = wait
						.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[role='button']")));
				popupCloseButton.click();
				System.out.println("popup closed");
				break;

			} catch (Exception e) {
				System.out.println("Popup not found, refreshing the page...");
				Thread.sleep(3000); // wait for a bit before refresh
				driver.navigate().refresh();
			}
		}
	}

	@Test
	public void notificationPopup() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://pib.gov.in/");

		// Check the alert message
		try {
			// Check if alert is present and retrieve the alert message
			String alertMessage = driver.switchTo().alert().getText();
			System.out.println(alertMessage);
			// Click on the OK button of the alert popup
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert present on the page.");
		}
	}
}
