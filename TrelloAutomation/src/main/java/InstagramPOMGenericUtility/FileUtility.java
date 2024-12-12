package InstagramPOMGenericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class FileUtility {
	
	public String getValueForkey(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./src/test/config/datas.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
	}


}
