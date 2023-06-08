package trello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.formula.WorkbookDependentFormula;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class will be used for file handling/data management
 * @author RAHUL
 *
 */

public class FileUtility {
	/**
	 * this method will be use to read the comman data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public  String  redDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/trello.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
		
	}
	/**
	 * 
	 * @param sheetName
	 * @param rownum
	 * @param cellnum
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readdataFromExcelFile(String sheetName,int rownum,int cellnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/datafile.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		String data=workbook.getSheet(sheetName).getRow(rownum).getCell(cellnum).getStringCellValue();
		return data;
	}
	
}
