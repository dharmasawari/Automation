package com.whitebox.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.whitebox.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	

public TestBase() throws IOException {
	try {
		prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\dharm\\eclipse-workspace\\Automation\\src\\main\\java\\com\\whitebox\\qa\\config\\config.properties");
		
		prop.load(ip);
		}
	
  catch(FileNotFoundException e){
	e.printStackTrace();  
  		}
  catch(IOException e) {
	  e.printStackTrace();
  		}
	
}

public void Initialization() {
	String browsername = prop.getProperty("browser");
	
	if (browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}else {
		return;
		
	}
}
      {
    	  
     // driver.manage().deleteAllCookies();
      //driver.manage().window().maximize();
      //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
      //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      //driver.get(prop.getProperty("url"));
    	  
      }
	
}

	


	
	
	

