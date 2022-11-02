package com.crm.Sdet.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Facebook {
	@Test
	public void FaceBookTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("surywanshi.surbhi@yahoo.in");
		driver.findElement(By.id("pass")).sendKeys("tashi2209");
		driver.findElement(By.name("login")).click();
		
		
		driver.findElement(By.xpath("//a[@class='_97w4']")).click();
		driver.findElement(By.xpath("(//div[@class='marginLeft12px'])[3]")).click();
		driver.findElement(By.name("reset_action")).click();
		driver.findElement(By.id("identify_email")).sendKeys("8669079485");
	    driver.findElement(By.id("did_submit")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.id("recovery_code_entry")).sendKeys("838196");
		
	}
	
	
	
    
	
			

}
