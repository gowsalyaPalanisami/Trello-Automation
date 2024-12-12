package snapdeal_project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SnapDeal_Testcase {
	
	WebDriver driver;
	@Test
	public void SnapDealTestcase() throws Throwable
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");
	driver.findElement(By.xpath("(//span[@class = 'catText'])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//span[text() = 'Sports Shoes'])[1]")).click();
	Thread.sleep(3000);
	WebElement countofshoes = driver.findElement(By.xpath("//span[@class = 'category-name category-count']"));
	Thread.sleep(3000);
	String count = countofshoes.getText();
	System.out.println("count : " +count);
	driver.findElement(By.xpath("(//div[@class = 'child-cat-name '])[2]")).click();
	WebElement dropdown = driver.findElement(By.xpath("//i[@class = 'sd-icon sd-icon-expand-arrow sort-arrow']"));
	dropdown.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
	Thread.sleep(3000);
	WebElement Sortingverification = driver.findElement(By.xpath("//div[@class = 'sort-selected']"));
	String sortedorder = Sortingverification.getText();
	System.out.println("sortedorder : " +sortedorder);
	Actions action = new Actions(driver);
	WebElement dragger = driver.findElement(By.xpath("(//a[@href = '#bcrumbLabelId:175'])[1]"));
	WebElement Fromval = driver.findElement(By.name("fromVal"));
	Thread.sleep(3000);
	Fromval.clear();
	Fromval.sendKeys("900");
	WebElement tovalue = driver.findElement(By.name("toVal"));
	Thread.sleep(3000);
	tovalue.clear();
	tovalue.sendKeys("1200");
	driver.findElement(By.xpath("//div[@class = 'price-go-arrow btn btn-line btn-theme-secondary']")).click();
	Thread.sleep(3000);
	WebElement checkbox = driver.findElement(By.xpath("//span[@class = 'filter-color-tile White&Blue ']"));
	Thread.sleep(3000);
	WebElement verifyfilter = driver.findElement(By.cssSelector("input[value = 'White%20%26%20Blue']"));
	String verifyfiltername = verifyfilter.getAttribute("value");
	System.out.println("verifyfiltername : " +verifyfiltername);
	checkbox.click();
	Thread.sleep(3000);
	WebElement gotoimage = driver.findElement(By.xpath("(//img[@class = 'product-image wooble'])[1]"));
	Thread.sleep(3000);
	action.moveToElement(gotoimage).perform();
	WebElement Quickview = driver.findElement(By.xpath("//div[@pogid = '626118755466']"));
	Thread.sleep(3000);
	Quickview.click();
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//WebElement viewDetails = driver.findElement(By.xpath("//a[@href = '/product/impakto-blue-training-shoes/626118755466#bcrumbLabelId:46102813']"));
	WebElement price = driver.findElement(By.cssSelector("span[class = 'payBlkBig']"));
	String price1 = price.getText();
	System.out.println("price1 : " +price1);
	WebElement discount = driver.findElement(By.cssSelector("span[class = 'percent-desc ']"));
	String discountpercentage = discount.getText();
	System.out.println("discountpercentage : " +discountpercentage);
	TakesScreenshot ts = (TakesScreenshot) driver;
	File srcFile = ts.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./errorshots/snapdeal.png");
	FileUtils.copyFile(srcFile, destFile);
	driver.close();
	driver.quit();
	}
}
