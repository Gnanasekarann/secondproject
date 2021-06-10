package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseclass.BaseClass;

public class Login {
	public static void main(String[] args) {
		
		String url = "http://demo.guru99.com/test/drag_drop.html";
		BaseClass b = new BaseClass();
		WebDriver d = b.browserLaunch();
		b.launchURL(url);
		
//		WebElement email = d.findElement(By.id("email"));
//		b.type(email, "sekargnanas@gmail.com");
//		
//		WebElement password = d.findElement(By.id("pass"));
//		b.type(password, "12345");
		
		Actions a = new Actions(d);
		WebElement src = d.findElement(By.id("Credit2"));
		WebElement des = d.findElement(By.id("bank"));
		a.dragAndDrop(src, des).perform();
		
		
	}

}
