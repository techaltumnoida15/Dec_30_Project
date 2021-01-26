package org.practiceSession.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseOverExample {

	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		// 1. Open browser
		driver = new ChromeDriver();
		
		//2. Maximize it
		driver.manage().window().maximize();
		
		//3. Enter URL - naukri.com
		driver.get("http://www.snapdeal.com");		
	}
	
	@Test
	public void mouseOver() {
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		//Mouse over - Sign In
		Actions act = new Actions(driver);
		act.moveToElement(signIn);
		act.build().perform();      //Pls remember - 
		
		//Click on Login
		WebElement logIn = driver.findElement(By.xpath("//a[text()='login']"));
		logIn.click();
	}
	
	@AfterMethod
	public void quitBrowser() {
		//driver.quit();
	}
	
}
