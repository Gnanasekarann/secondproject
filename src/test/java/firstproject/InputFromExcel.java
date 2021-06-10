package firstproject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass1;

public class InputFromExcel {
	public static void main(String[] args) throws IOException {
		String url = "http://adactinhotelapp.com/";
		BaseClass1 b = new BaseClass1();
		WebDriver d = b.browser();
		b.url(url);

		WebElement userName = d.findElement(By.id("username"));
		b.type(userName, b.excelRead(0, 0));
		WebElement passWord = d.findElement(By.id("password"));
		b.type(passWord, b.excelRead(1, 0));
		WebElement login = d.findElement(By.id("login"));
		b.btnClick(login);
		
		WebElement location = d.findElement(By.xpath("//select[@name='location']"));
		b.type(location, b.excelRead(2, 0));
		WebElement hotels = d.findElement(By.xpath("//select[@name='hotels']"));
		b.dropDown(hotels, b.excelRead(3, 0));
		WebElement roomtype = d.findElement(By.xpath("//select[@name='room_type']"));
		b.dropDown(roomtype, b.excelRead(4, 0));
		WebElement roomnos = d.findElement(By.xpath("//select[@name='room_nos']"));
		b.dropDown(roomnos, b.excelRead(5, 0));
		WebElement checkindate = d.findElement(By.id("datepick_in"));
		b.type(checkindate, b.excelRead(6, 0));
		WebElement checkoutdate = d.findElement(By.id("datepick_out"));
		b.type(checkoutdate, b.excelRead(7, 0));
		WebElement adultroom = d.findElement(By.xpath("//select[@name='adult_room']"));
		b.dropDown(adultroom, b.excelRead(8, 0));
		WebElement childroom = d.findElement(By.xpath("//select[@name='child_room']"));
		b.dropDown(childroom, b.excelRead(9, 0));
		WebElement search = d.findElement(By.id("Submit"));
		b.btnClick(search);
		
		WebElement radiobtn = d.findElement(By.id("radiobutton_0"));
		b.btnClick(radiobtn);
		WebElement fnlsubmit = d.findElement(By.id("continue"));
		b.btnClick(fnlsubmit);


		WebElement fname = d.findElement(By.id("first_name"));
		b.type(fname, b.excelRead(10, 0));
		WebElement lname = d.findElement(By.id("last_name"));
		b.type(lname, b.excelRead(11, 0));
		WebElement address = d.findElement(By.id("address"));
		b.type(address, b.excelRead(12, 0));
		WebElement ccnum = d.findElement(By.id("cc_num"));
		b.type(ccnum, b.excelRead(13, 0));
		WebElement cctype = d.findElement(By.xpath("//select[@name='cc_type']"));
		b.dropDown(cctype, b.excelRead(14, 0));
		WebElement expmonth = d.findElement(By.xpath("//select[@name='cc_exp_month']"));
		b.dropDown(expmonth, b.excelRead(15, 0));
		WebElement expyear = d.findElement(By.xpath("//select[@name='cc_exp_year']"));
		b.dropDown(expyear, b.excelRead(16, 0));
		WebElement cvv = d.findElement(By.id("cc_cvv"));
		b.type(cvv, b.excelRead(17, 0));
		WebElement booknow = d.findElement(By.id("book_now"));
		b.btnClick(booknow);
		
		WebElement orderno = d.findElement(By.xpath("//input[@id='order_no']"));
		String order = orderno.getAttribute("value");
		System.out.println(order);
	}

}
