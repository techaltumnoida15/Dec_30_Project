package feb13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC04 {
	//Declare WebDriver
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "H:\\Sel_Projects_v8\\Dec_30_Project\\browserDrivers\\chromedriver.exe");
		//Open Browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.roomsoom.com/");
		//driver.get("https://www.naukri.com/");
		
		
	}
	
	@Test
	public void testCase01() throws Exception {
		
		String pageTitle = driver.getTitle();
		Reporter.log("Page title is = " + pageTitle);
		
		String pageURL = driver.getCurrentUrl();
		Reporter.log(pageURL + "<br>");
		
		Thread.sleep(5000);
		
		//Code
		//Enter Name
		//driver.findElement(By.name("u_name")).sendKeys("Kundan");
		
		//Close Poup
		driver.findElement(By.cssSelector("button[class='close']")).click();
		
		
		String expectedPhNum = "+91-88-1010-7071";
		
		String ActualPhNum = driver.findElement(By.cssSelector("ul[class='header_right header-right-all'] > li:nth-child(3)")).getText();
		Reporter.log(ActualPhNum + "<br>");
		
		Assert.assertEquals(ActualPhNum, expectedPhNum, "Phone number doesnt match.");
		Reporter.log("Phone number is verified." + "<br>");
	}
	
	@AfterTest
	public void quitBrowser() {
		driver.quit();
		//driver.close();
	}

}
