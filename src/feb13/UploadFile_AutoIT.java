package feb13;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class UploadFile_AutoIT extends BaseClass{

	@Test
	public void uploadFiles() throws Exception{
		
		driver.get("https://pdf2doc.com/");
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withMessage("I am waiting for suggestionBox.")
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='pick-files']")));
		
		WebElement uploadFiles = driver.findElement(By.cssSelector("div[id='pick-files']"));
		uploadFiles.click();
		
		Thread.sleep(2000);
		
		Process proc = Runtime.getRuntime().exec("E:\\UploadFile.exe");
		
	}
}
