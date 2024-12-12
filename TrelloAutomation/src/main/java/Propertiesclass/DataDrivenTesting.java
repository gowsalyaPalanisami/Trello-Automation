package Propertiesclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDrivenTesting {
	public static void main(String[] args) throws Throwable {
		// global variable
		WebDriver driver;
		//creating object for File input stream
		//File input stream will read the contents(datas in the file)
		//./src/test/resources/data.properties - path to the property file
		//property file contains configuration datas like browsername url etc..
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		//create object for property class
		//properties in java is used to handle configuration data( key and value pair)
		// we use this object (prop) to load properties file and retrive values from it.
		Properties prop = new Properties();
		//this loads the properties from the file and make available in prop object
		prop.load(fis);
		//with help of prop object using getproperty method we can returns value of the specified key as a string
		String browserName = prop.getProperty("browser");
		if(browserName.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new ChromeDriver();
		}
		
	}

}
