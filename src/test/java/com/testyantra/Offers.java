package com.testyantra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Offers {

	
	
	@Test
	public void open() throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	   
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='menuparent offers-menuparent pull-right active']//div//ul//span[text()='Flat 5% Off']")).click();
		
        driver.close();		

		
}
}
