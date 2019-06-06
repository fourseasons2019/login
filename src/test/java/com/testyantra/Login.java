package com.testyantra;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class Login {

@Test
public void open() throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
   
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	driver.navigate().to("http://gmail.com");
	Navigation nav=driver.navigate();
	
	nav.forward();
	
	
	//driver.navigate().forward();
	
    driver.navigate().back();
	
	Thread.sleep(3000);
	
	nav.refresh();
	Thread.sleep(3000);
	
	
	driver.close();
	

	
}





}
