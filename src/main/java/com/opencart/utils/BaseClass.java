package com.opencart.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver;
	public BaseClass() {
		prop= new Properties();
		FileInputStream file;
		try {
			file= new FileInputStream("C:\\Users\\jayanth\\eclipse-workspace\\Hackaton_Team-G\\Hackaton_Team-G\\Config\\Configuration.Properties");
			prop.load(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
		 System.out.println("Page title is : " + driver.getTitle());
	}
	
	public static void scrollDown(WebElement d) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", d);
	}

	public static void scrollUp(WebElement u) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", u);
	}

	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\jayanth\\eclipse-workspace\\Hackaton_Team-G\\Hackaton_Team-G\\ScreenShot");

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }


}
