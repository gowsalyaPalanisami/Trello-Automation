package Genericutility2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

/**
 * It will be the simplified class for the file handling process.
 * 
 * @author Chandan N R
 */
public class FileUtility {
	/**
	 * This method will be used to read the data from the properties file.
	 * 
	 * @author Jerry
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String getValueForkey(String key) throws IOException {
		Properties pobj = new Properties();
		pobj.load(new FileInputStream("./src/test/resources/data.properties"));
		return pobj.getProperty(key);
	}

	/**
	 * This method will be used to read the Numeric Data from the excel Workbook
	 * 
	 * @author Chandan N R
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
//	public double getNumData(String sheetName, int rowIndex, int cellIndex)
//			throws EncryptedDocumentException, IOException {
//		Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/test/resources/workbookdata.xlsx"));
//		Cell cell = workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
//		double numValue = 0;
//		if (String.valueOf(cell.getCellType()).equals("NUMERIC")) {
//			numValue = cell.getNumericCellValue();
//		}
//		return numValue;
//	}

	/**
	 * It will be used to read the String Data from the excel Sheet
	 * 
	 * @author Priya
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return String Value
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
//	public String getStringData(String sheetName, int rowIndex, int cellIndex)
//			throws EncryptedDocumentException, FileNotFoundException, IOException {
//		Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/test/resources/workbookdata.xlsx"));
//		Cell cell = workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex);
//		String StringValue = "";
//		if (String.valueOf(cell.getCellType()).equals("STRING")) {
//			StringValue = cell.getStringCellValue();
//		}
//		return StringValue;
//	}
}

