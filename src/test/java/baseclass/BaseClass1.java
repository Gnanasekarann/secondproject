package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass1 {
	public static WebDriver driver;
	
	public WebDriver browser() {
		System.setProperty("webdriver.gecko.driver", "D:\\Users\\gnanas\\eclipse-workspace\\maven1\\driver\\geckodriver.exe");
		setDriver(new FirefoxDriver());
		return getDriver();
	}
	public void url(String url) {
		getDriver().get(url);
	}
	public void type(WebElement e, String val) {
		e.sendKeys(val);
	}
	
	public void btnClick(WebElement e) {
		e.click();
	}
	public void dropDown(WebElement e, String val) {
		Select s = new Select(e);
		s.selectByValue(val);
	}
	
	public String excelRead(int rowNo, int colNo) throws IOException {
		File f = new File("D:\\Users\\gnanas\\eclipse-workspace\\maven1\\Excel\\Input1.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("hotelapp");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(colNo);
		int type = c.getCellType();
		String val;
		if (type==1) {
			
			val = c.getStringCellValue();
		}else if (DateUtil.isCellDateFormatted(c)) {
			SimpleDateFormat sim = new SimpleDateFormat();
			Date d = c.getDateCellValue();
			val = sim.format(d);
					
		}else {
			double d = c.getNumericCellValue();
			long l = (long)d;
			val = String.valueOf(l);
		}
		return val;
		
		

	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		BaseClass1.driver = driver;
	}
	
	

}
