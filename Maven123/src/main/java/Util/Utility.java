package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	String data;
	WebDriver driver;
	
	public String datafromexcel(String sheet, int row, int cell) throws EncryptedDocumentException, IOException{
		FileInputStream file= new FileInputStream("A:\\Velocity\\Selenium\\9.Parameterization\\excel\\Book1.xlsx");
		try {
			data = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
			}
		catch(IllegalStateException e) {
			double value = WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
			String data=Double.toString(value);
			}
		return data;
	}
	
	public void takescreenshot (WebDriver driver) throws IOException {

		LocalDateTime date = LocalDateTime.now();

		 DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy & hh-mm-ss");
		 String df = date.format(d);
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File ("A:\\Velocity\\Selenium\\8.ScreenShot\\"+df+".jpg");
		 
		 FileHandler.copy(src, dest);
		
		
		
	}

		
	}

