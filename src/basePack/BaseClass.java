package basePack;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	
	@Parameters({"browserName"})
	@BeforeMethod
	public void openBrowser(String browserName) {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		//String browserName = "Firefox";
		
		if(browserName.equalsIgnoreCase("chrome")) {
			//CHROME
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			//FIREFOX
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("ie")) {
			//IE
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			//EDGE
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		
		else {
			//HeadlessBrowser - HtmlUnitDriver
			driver = new HtmlUnitDriver();
		}

		//2. Maximize it
		driver.manage().window().maximize();
		
	}
	
	
	@AfterMethod
	public void quitBrowser(ITestResult result) throws Exception{
		//Check status of executed test
		long testExecutionTime = result.getEndMillis();
		//System.out.println("testExecutionTime = " + testExecutionTime);   //ms
		
		//System.out.println("getHost = " + result.getHost());
		
		System.out.println("result.isSuccess() = " + result.isSuccess());
		
		System.out.println("result.getStatus() = " + result.getStatus());
		
		System.out.println("result.getMethod().getMethodName() = " + result.getMethod().getMethodName());
		
		//============================================
		if(!result.isSuccess()) {
			//Capture Screenshot
			File scrScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//String fileName = "abc.jpeg";
			String fileName = result.getMethod().getMethodName() + "_" + new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss").format(new Date());
			String filePath = System.getProperty("user.dir") + "\\screenshots\\" + fileName + ".jpeg";
			File destScreenshot = new File(filePath);
			
			FileUtils.moveFile(scrScreenshot, destScreenshot);
		}
		
		driver.quit();
	}
}
