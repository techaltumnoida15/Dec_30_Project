package org.practiceSession.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01 {

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
		driver.get("http://www.cheapoair.com");		
	}
	
	@Test
	public void testCase01() {
		//Select values from drop down
		//Selecting values from Adult drop down
		WebElement adults = driver.findElement(By.name("Adults"));
		Select adultDropDown = new Select(adults);
		adultDropDown.selectByIndex(4);  //Should select 4 from Adult drop down
		
		//Seniors   :Seniors
		WebElement seniors = driver.findElement(By.name("Seniors"));
		Select seniorsDropDown = new Select(seniors);
		seniorsDropDown.selectByValue("3");  //Should select 3
		
		//Youth
		WebElement youth = driver.findElement(By.name("Youths"));
		Select youthDropDown = new Select(youth);
		youthDropDown.selectByVisibleText("6");    //should select 6
	}
	
	@AfterMethod
	public void quitBrowser() {
		//driver.quit();
	}
	
}
