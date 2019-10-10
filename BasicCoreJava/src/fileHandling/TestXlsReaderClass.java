package fileHandling;

import java.io.IOException;

public class TestXlsReaderClass  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Xls_Reader xl = new Xls_Reader("F:\\SeleniumAutomation\\BasicCoreJava\\src\\fileHandling\\TestData.xls");
		
		//get row count
		System.out.println(xl.getRowCount("Sheet1"));
		
		//get column count
		System.out.println(xl.getColumnCount("Sheet1"));
		
		//get cell data
		System.out.println(xl.getCellData("Sheet1", 1, 1));

	}

}
