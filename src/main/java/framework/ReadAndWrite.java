package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWrite {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Users\\gnanas\\eclipse-workspace\\maven1\\Excel\\Input.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell c = r.getCell(1);
		String val = c.getStringCellValue();
		if (val.equals("Gnanas")) {
			c.setCellValue("Gnanasekaran");
			FileOutputStream fout = new FileOutputStream(f);
			w.write(fout);
			
		}
	}

}
