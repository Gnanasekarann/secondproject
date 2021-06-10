package framework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class InputFromExcel {
	public static void main(String[] args) throws IOException {
		String url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
		
		BaseClass b = new BaseClass();
		WebDriver d = b.browserLaunch();
		b.launchURL(url);
		WebElement txtEmail = d.findElement(By.id("email"));
		b.type(txtEmail, b.excelRead(0, 0));
		WebElement txtpwd = d.findElement(By.id("passwd"));
		b.type(txtpwd, b.excelRead(1, 0));
		WebElement submit = d.findElement(By.id("SubmitLogin"));
		b.btnClick(submit);

		
				
	}

}
