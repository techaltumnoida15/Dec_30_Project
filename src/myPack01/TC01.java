package myPack01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {
	
	//Declare Selenium
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		String projectPath = System.getProperty("user.dir");
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Enter URL
		//driver.get("http://www.naukri.com");
		driver.navigate().to("http://www.naukri.com");
	}
	
	@Test
	public void testCase01() {
		driver.findElement(By.id("qsbClick")).click();
		System.out.println("Click on search job tetx box.");
	}
	
	@AfterMethod
	public void quitBrowser() {
		//driver.quit();
	}
}