package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetCellData {

	public static void main(String[] args) throws IOException 
	{
		
		
		FileInputStream file = new FileInputStream("F:\\SeleniumAutomation\\BasicCoreJava\\src\\fileHandling\\TestData.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook(file);
		HSSFSheet sheet = wb.getSheet("Sheet1");
		HSSFRow row = sheet.getRow(1);
		HSSFCell cell = row.getCell(0);
		
		cell.setCellValue("Bhushan");

		FileOutputStream fileOut = new FileOutputStream("F:\\SeleniumAutomation\\BasicCoreJava\\src\\fileHandling\\TestData.xls");
		wb.write(fileOut);
		
	}

}
