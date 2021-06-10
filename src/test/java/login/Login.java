package login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import baseclass.BaseClass1;
import firstproject.LoginPojo;

public class Login {
	public static void main(String[] args) throws IOException {
		String url = "http://adactinhotelapp.com/";
		BaseClass1 b = new BaseClass1();
		WebDriver d = b.browser();
		b.url(url);
		LoginPojo login = new LoginPojo();
		b.type(login.getUserName(), b.excelRead(0, 0));
		b.type(login.getPassWord(), b.excelRead(1, 0));
		b.btnClick(login.getLogin());
	}

}
