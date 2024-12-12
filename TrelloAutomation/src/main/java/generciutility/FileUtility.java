package generciutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * It will be the simplified class for the file handling process.
 * @author Chandan N R
 */
public class FileUtility {
/**
 * This method will be used to read the data from the properties file.
 * @author Jerry
 * @param key
 * @return value
 * @throws IOException
 */
	public String getValueForkey(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		return pobj.getProperty(key);
	}
}
