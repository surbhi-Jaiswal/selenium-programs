package com.meta.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class projectMeta {
	@Test
	public void projectMetaTest(WebElement WebElement) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().Duration.ofsecond(10);
    driver.get("https://metapercept.com/contact");
	//JavascriptExecutor js= (JavascriptExecutor)driver;
	//js.executeScript(500, 600);
	
	driver.findElement(By.name("First Name")).sendKeys("surbhi");
	driver.findElement(By.name("Last Name")).sendKeys("Jaiswal");
	
	Select s= new Select(driver.findElement(By.xpath("//select[@name='CONTACTCF2']")));
	s.selectByValue("India (+91)");
	
	driver.findElement(By.name("Phone")).sendKeys("8669079485");
	driver.findElement(By.name("Email")).sendKeys("surywanshi.surbhi09@gmail.com");
	driver.findElement(By.name("Title")).sendKeys("software testing");
	//driver.findElement(null)
	
	
	
	}


}
