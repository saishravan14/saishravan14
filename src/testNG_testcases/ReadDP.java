package testNG_testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadDP {
	@DataProvider
	public static String[][] read() throws EncryptedDocumentException, InvalidFormatException, IOException{
		String[][]st; 
		FileInputStream fis = new FileInputStream("E:/acti.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");

		int rCount = sh.getPhysicalNumberOfRows();//3
		int cCount = sh.getRow(1).getLastCellNum();//2
		st = new String[rCount][cCount]; //3 2
		for (int i = 0; i < rCount; i++) {  //0<3
			for (int j = 0; j < cCount; j++) {//0<2
				Cell cl = sh.getRow(i).getCell(j);
				st[i][j]=cl.toString();
			}
		}
		return st;
		
	}

}
