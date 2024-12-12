package abhibus;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus_Project {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//span[text() = 'Buses']")).click();
		Thread.sleep(3000);
		WebElement Fromplace = driver.findElement(By.cssSelector("input[placeholder = 'From Station']"));
		Fromplace.sendKeys("Chennai");
		Fromplace.sendKeys(Keys.DOWN);
		Fromplace.sendKeys(Keys.ENTER);
		WebElement Toplace = driver.findElement(By.cssSelector("input[placeholder = 'To Station']"));
		Toplace.sendKeys("Bangalore");
		Toplace.sendKeys(Keys.DOWN);
		Toplace.sendKeys(Keys.ENTER);
		driver.findElement(By.linkText("Tomorrow")).click();
		
		
		
		
	}

}
