package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadio {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://demo.guru99.com/test/ajax.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("yes")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("buttoncheck")).click();
		Thread.sleep(2000);
		
		/*driver.findElement(By.cssSelector("input[value=Reset]")).click();
		Thread.sleep(2000);*/
		
		driver.close();
	}
	
	
}
