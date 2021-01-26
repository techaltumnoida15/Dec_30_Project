package basePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		String browserName = "CHROME";
		
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
	public void quitBrowser() {
		driver.quit();
	}
}
