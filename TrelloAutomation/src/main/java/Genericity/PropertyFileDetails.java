package Genericity;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileDetails {
	
	public String getValueForKey(String key) throws Throwable
	{
	FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
	Properties pobj = new Properties();
	pobj.load(fis);
	return getValueForKey(key);
	
	}

}
