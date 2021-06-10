package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FrameWork {
	
	public static void main(String[] args) throws IOException {	
		File f = new File ("D:\\Users\\gnanas\\eclipse-workspace\\maven1\\Excel\\Input.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(2);
		System.out.println(c);

//		File f = new File ("D:\\Users\\gnanas\\eclipse-workspace\\maven1\\Excel\\Input.xlsx");
//		FileInputStream fin = new FileInputStream(f);
//		Workbook w = new XSSFWorkbook(fin);
//		Sheet s = w.getSheet("Sheet1");
//		Row r = s.getRow(1);
//		int noOfRows = s.getPhysicalNumberOfRows();
//		
//		for (int i = 0; i < noOfRows; i++) {
//			Row r = s.getRow(i);
//			int noOfCells = s.getPhysicalNumberOfRows();
//			for (int j = 0; j < noOfCells; j++) {
//				Cell c = s.getCellComment(arg0, arg1)
//				
//			}
		
		}

		
	}


