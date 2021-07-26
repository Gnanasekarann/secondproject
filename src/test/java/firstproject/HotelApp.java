package firstproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass1;

public class HotelApp {
	public static void main(String[] args) {
		String url = "http://adactinhotelapp.com/";
		BaseClass1 b = new BaseClass1();
		WebDriver d = b.browser();
		b.url(url);

		WebElement userName = d.findElement(By.id("username"));
		b.type(userName, "gnanasekaran");
		WebElement passWord = d.findElement(By.id("password"));
		b.type(passWord, "123456");
		WebElement login = d.findElement(By.id("login"));
		b.btnClick(login);
		
		WebElement location = d.findElement(By.xpath("//select[@name='location']"));
		b.dropDown(location, "Melbourne");
		WebElement hotels = d.findElement(By.xpath("//select[@name='hotels']"));
		b.dropDown(hotels, "Hotel Sunshine");
		WebElement roomtype = d.findElement(By.xpath("//select[@name='room_type']"));
		b.dropDown(roomtype, "Deluxe");
		WebElement roomnos = d.findElement(By.xpath("//select[@name='room_nos']"));
		b.dropDown(roomnos, "2");
		WebElement checkindate = d.findElement(By.id("datepick_in"));
		b.type(checkindate, "22/05/2021");
		WebElement checkoutdate = d.findElement(By.id("datepick_out"));
		b.type(checkoutdate, "23/05/2021");
		WebElement adultroom = d.findElement(By.xpath("//select[@name='adult_room']"));
		b.dropDown(adultroom, "2");
		WebElement childroom = d.findElement(By.xpath("//select[@name='child_room']"));
		b.dropDown(childroom, "0");
		WebElement search = d.findElement(By.id("Submit"));
		b.btnClick(search);
		
		WebElement radiobtn = d.findElement(By.id("radiobutton_0"));
		b.btnClick(radiobtn);
		WebElement fnlsubmit = d.findElement(By.id("continue"));
		b.btnClick(fnlsubmit);


		WebElement fname = d.findElement(By.id("first_name"));
		b.type(fname, "Gnana");
		WebElement lname = d.findElement(By.id("last_name"));
		b.type(lname, "Sekar");
		WebElement address = d.findElement(By.id("address"));
		b.type(address, "chennai");
		WebElement ccnum = d.findElement(By.id("cc_num"));
		b.type(ccnum, "1234567890123456");
		WebElement cctype = d.findElement(By.xpath("//select[@name='cc_type']"));
		b.dropDown(cctype, "VISA");
		WebElement expmonth = d.findElement(By.xpath("//select[@name='cc_exp_month']"));
		b.dropDown(expmonth, "6");
		WebElement expyear = d.findElement(By.xpath("//select[@name='cc_exp_year']"));
		b.dropDown(expyear, "2022");
		WebElement cvv = d.findElement(By.id("cc_cvv"));
		b.type(cvv, "123");
		WebElement booknow = d.findElement(By.id("book_now"));
		b.btnClick(booknow);
		WebElement orderno = d.findElement(By.id("order_no"));
		String order = orderno.getAttribute("value");
		System.out.println(order);
		driver.close();


	}

}
