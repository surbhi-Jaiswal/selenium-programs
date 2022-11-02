package com.crm.Sdet.demo;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	@Test
	public void demo1Test() throws Throwable {
		WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      
		FileInputStream fis=new FileInputStream("C:\\Users\\surbh\\git\\vtigerRepository\\SDET39_SeleniumFramework\\src\\test\\resources\\data.properties");
    	Properties p=new Properties();
    	p.load(fis);
    	
    	String value = p.getProperty("key");
		String Browser = p.getProperty("browser");
		System.out.println(Browser);
		
		String Url = p.getProperty("url");
		String Username = p.getProperty("un");
		String password = p.getProperty("pwd");
		
		driver.get(Url);	
      
	  String URL = System.getProperty("url");
	   System.out.println("URL");
	  // driver.get(URL);
		System.out.println("hello");
	
		
		
  }

 }





