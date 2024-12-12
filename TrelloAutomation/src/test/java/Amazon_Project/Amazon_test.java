package Amazon_Project;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_test {
	public static void main(String[] args) throws Throwable {	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
	searchbar.sendKeys("Oneplus 9 pro");
	searchbar.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	WebElement price = driver.findElement(By.xpath("//span[text() = '31,899']"));
	System.out.println(price.getText());
	WebElement ratings = driver.findElement(By.xpath("//span[@aria-label='16 ratings']"));
	System.out.println(ratings.getText());
	System.out.println(ratings.getAttribute("aria-label"));
	driver.findElement(By.xpath("//span[text() = '(Refurbished) OnePlus 9 Pro 5G (Morning Mist, 8GB RAM, 128GB Storage)']")).click();
	// Get the window handles
	Set<String> windowHandles = driver.getWindowHandles();

     // Switch to the new tab
     String originalWindow = driver.getWindowHandle(); // Store the original window
     for (String windowHandle : windowHandles) {
         if (!windowHandle.equals(originalWindow)) {
             driver.switchTo().window(windowHandle); // Switch to the new tab
             break;
         }
     }
	WebElement mobilepicture = driver.findElement(By.xpath("(//img[@alt = '(Refurbished) OnePlus 9 Pro 5G (Morning Mist, 8GB RAM, 128GB Storage)'])[1]"));
	Actions actions = new Actions(driver);
	actions.scrollToElement(mobilepicture);
	TakesScreenshot tcs = (TakesScreenshot)driver;
	File srcFile = tcs.getScreenshotAs(OutputType.FILE);
	File destfile = new File("./errorshots/Oneplus.png");
	FileUtils.copyFile(srcFile, destfile);
	Thread.sleep(3000);
	driver.findElement(By.id("add-to-cart-button")).click();
	Thread.sleep(3000);
	WebElement addeditems = driver.findElement(By.id("attach-accessory-cart-total-string"));
	String subtotalitems1 = addeditems.getText();
	System.out.println("subtotalitems1 : " +subtotalitems1);
	String subtotalitems2  = "Cart subtotal (1 item):";
	if(subtotalitems1.equals(subtotalitems2))
	{
		System.out.println("cart have only one item");
	}
	driver.close();
	
	


}
}
