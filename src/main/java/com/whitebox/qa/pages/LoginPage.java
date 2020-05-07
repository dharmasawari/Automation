package com.whitebox.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.whitebox.qa.base.TestBase;

public class LoginPage extends TestBase{

//	public LoginPage() throws IOException {
//		super();
		
//	}

	//PageFActory -OR:
	
	@FindBy(name="uname")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"login\"]")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"register\"]")
	WebElement signUpBtn;
	
	
	
	
	
	public LoginPage() throws IOException{
		
		PageFactory.initElements(driver, this);
		
		
	}
public static String validateLoginPageTitle() {
	return driver.getTitle();
}
	
	
	
	public HomePage Login(String uname, String pwd) throws IOException {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
		
	}
	public static void login(String property) {
		// TODO Auto-generated method stub
		
	}
}
