package firstproject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseclass.BaseClass1;

public class LoginPojo extends BaseClass1{
	
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement passWord;
	@FindBy(id="login")
	private WebElement login;
	@FindBy (linkText="Logout")
	private WebElement logout;
	
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
	
	

}
