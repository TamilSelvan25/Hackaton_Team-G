package com.opencart.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	public BaseClass() {
		prop= new Properties();
		FileInputStream file;
		try {
			file= new FileInputStream("C:\\Users\\SOUMYA\\Downloads\\Hackaton_Team-G (1)\\Hackaton_Team-G\\src\\main\\java\\com\\opencart\\utils\\Propertyfile.properties");
			prop.load(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SOUMYA\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
		 System.out.println("Page title is : " + driver.getTitle());
	}
	
}



