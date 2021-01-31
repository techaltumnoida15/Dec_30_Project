package org.projectName.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class SearchNaukri extends BaseClass{

	
	@Test
	public void testSearchNaukri() {
		driver.get("http://www.naukri.com");
		
		//TC Logic
		//Click on search job text box
		driver.findElement(By.id("qsbClick")).click();
		System.out.println("Click on search job text box.");
		
		//Enter skills
		driver.findElement(By.name("qp")).sendKeys("Java");
		System.out.println("Skills is entered.");
		
		
	}
	
}
