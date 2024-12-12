package Propertiesclass;
// will store common data of multiple testcases
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class DataDrivenClass2 {
	public static void main(String[] args) throws Throwable {
		//create global variable to launch browser
		WebDriver driver;
		//create object for fileinput stream
		// file input stream is used to read the datas
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		//create object for properties file
		// properties file will configure data in key and value pair
		Properties prop = new Properties();
		//load the datas in fis object to property object to get data in form of key and value
		prop.load(fis);
		//getproperty method retrieve value for the key browser
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		
		
		
	}

}
