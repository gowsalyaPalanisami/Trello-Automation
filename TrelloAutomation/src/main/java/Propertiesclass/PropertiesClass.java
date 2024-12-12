package Propertiesclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesClass {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("./src/test/config/datas.Properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("Firstname"));
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		
		
	}

}
