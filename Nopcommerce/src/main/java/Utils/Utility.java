package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	private static WebDriver driver;
	public static void captureScreenshot(WebDriver driver, String TestID) throws IOException
	
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss");
		String str = sdf.format(new Date());
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File desti = new File ("F:\\screenshotselenium");
		FileHandler.copy(src, desti);
	}
	
	public static String getDataFromExcel(String sheet , int row , int cell ) throws EncryptedDocumentException, IOException
   {
	
	String path = "C:\\Users\\DELL\\Desktop\\nopcom.xlsx";
	
	InputStream File = new FileInputStream(path);
	
	String data = WorkbookFactory.create(File).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	System.out.println(data);
	return data;
	
	

}
}