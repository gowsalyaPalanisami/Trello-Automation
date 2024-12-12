package Screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Instagram_Screenshot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("pgowsalya0905@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Alya@Alya@1122");
		driver.findElement(By.xpath("//div[text() = 'Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("svg[aria-label = 'Search']")).click();
		Thread.sleep(3000);
		WebElement searchbyid = driver.findElement(By.cssSelector("input[aria-label = 'Search input']"));
		searchbyid.sendKeys("girinath_r.p");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
//		action.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//span[text() = 'g.i.r.i.n.a.t.h_r.p']")).click();
		Thread.sleep(8000);
		WebElement scrolldown = driver.findElement(By.xpath("(//div[@class = '_aagw'])[7]"));
		Thread.sleep(8000);
		scrolldown.click();
//		action.scrollToElement(scrolldown).click();
		Thread.sleep(5000);
	
		TakesScreenshot cts = (TakesScreenshot) driver;
		File srcFile = cts.getScreenshotAs(OutputType.FILE);
		String srcaddress = srcFile.getAbsolutePath();
		File destFile = new File("./errorshots/girinath.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.quit();
	}

}
