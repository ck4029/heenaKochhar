package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {
	public static WebDriver driver;
	public static String subFolderName;
	
	public static String getexcelSheet(String sheet,int rows,int cells) throws EncryptedDocumentException, IOException 
	{
		String data;
		
		String path="C:\\Users\\chand\\Downloads\\HeenaKochhar.xlsx";
		FileInputStream file=new FileInputStream(path);
		Workbook book=WorkbookFactory.create(file);
		try {
	     data=book.getSheet(sheet).getRow(rows).getCell(cells).getStringCellValue();
		}
		catch(IllegalStateException ise)
		{
			double value=book.getSheet(sheet).getRow(rows).getCell(cells).getNumericCellValue();
			long num=(long) value;
			data=Long.toString(num);
		}
		return data;
	}
	public static void captureScreenShot(String testID) throws IOException
	{
		TakesScreenshot ss=(TakesScreenshot)driver;
		if (subFolderName==null)
		{
			LocalDateTime myDateObj = LocalDateTime.now();
		   
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		    subFolderName = myDateObj.format(myFormatObj);
		}
		
		
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Images"+"subFolderName"+testID+".jpg");
		try
		{
		FileUtils.copyFile(src,dest);
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		
		System.out.println("Screenshot saved successfully");
	}
	
	
	
	
}
