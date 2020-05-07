package com.whitebox.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.whitebox.qa.base.TestBase;
import com.whitebox.qa.pages.LoginPage;
import com.whitebox.qa.pages.HomePage;


public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage HomePage;
	
	public LoginPageTest() throws IOException {
		super();
		
	}

	
	@BeforeMethod
	public void setUP() throws IOException {
		Initialization();
		LoginPage loginPage = new LoginPage();
			
	}
	
		
	@Test(priority=3)
	public void loginTest() {
		LoginPage.login(prop.getProperty("username"));
		LoginPage.login(prop.getProperty("password"));
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}




}