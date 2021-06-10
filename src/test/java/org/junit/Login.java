package org.junit;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import baseclass.BaseClass1;
import firstproject.LoginPojo;

public class Login {
	
	static BaseClass1 b = new BaseClass1();
	static String url = "http://adactinhotelapp.com/";

	@BeforeClass
	public static void browserLauch() {
		WebDriver d = b.browser();	
		b.url(url);
	}
	@Test
	public void testCase1() throws IOException {
		LoginPojo login = new LoginPojo();
		b.type(login.getUserName(), b.excelRead(0, 0));
		b.type(login.getPassWord(), b.excelRead(1, 0));
		b.btnClick(login.getLogin());
		b.btnClick(login.getLogout());
	}
	
	
	
	

}
