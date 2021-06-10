package framework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	public static void main(String[] args) throws IOException {
		File f = new File("D:\\Users\\gnanas\\eclipse-workspace\\maven1\\Excel\\Input.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Sheet1");
		Row r = s.createRow(4);
		Cell c = r.createCell(6);
		c.setCellValue("New Value");
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		System.out.println("Done");

	}

}
