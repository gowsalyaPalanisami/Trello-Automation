package Screenshots;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebpageScreenshot {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		String srcFileAddress = srcFile.getAbsolutePath();
		File destFile = new File("./errorshots/fblogin.png");
		FileUtils.copyFile(srcFile, destFile);
//		System.out.println("srcFileAddress :" +srcFileAddress);
		driver.quit();
//		Thread.sleep(2000);	
	}
}



