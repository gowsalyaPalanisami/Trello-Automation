package Screenshots;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsScreenshot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginbutton = driver.findElement(By.name("login"));
		File srcFile = loginbutton.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/buttonscreenshots.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.quit();
		
	}

}
