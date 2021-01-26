package org.projectName.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchNaukri {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Sel_Projects_v8\\Dec_30_Project\\browserDrivers\\chromedriver.exe");
		
		// 1. Open browser
		driver = new ChromeDriver();
		
		//2. Maximize it
		driver.manage().window().maximize();
		
		//3. Enter URL - naukri.com
		driver.get("http://www.naukri.com");		
	}
	
	@Test
	public void testSearchNaukri() {
		//TC Logic
		//Click on search job text box
		driver.findElement(By.id("qsbClick")).click();
		System.out.println("Click on search job text box.");
		
		//Enter skills
		driver.findElement(By.name("qp")).sendKeys("Java");
		System.out.println("Skills is entered.");
		
		
	}
	
	@AfterMethod
	public void quitBrowser() {
		//driver.quit();
	}
}
