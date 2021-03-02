package feb13;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC02 extends BaseClass{

	@Test(dataProvider = "testData")
	public void testCase02(String destination, String suggestionText, String departDate) throws Exception{
		driver.get(getDataPropFile("url"));
		
		//Enter Destination
		WebElement from = driver.findElement(By.cssSelector(getDataPropFile("cssFrom")));
		String writtenVal = from.getAttribute("value");
		
		System.out.println("writtenVal = " + writtenVal);
		
		//from.clear();
		if(!(writtenVal == null) && !(writtenVal == "")) {
			driver.findElement(By.cssSelector(getDataPropFile("cssCrossButtonInFrom"))).click();
			
			writtenVal = from.getAttribute("value");
			System.out.println("writtenVal = " + writtenVal);
			
		}
		
		//Type Airport Code / Destination
		from.sendKeys(destination);
		//Thread.sleep(3000);
		
		/*
		//Exp wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='suggestion-box__content air']")));
		*/
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withMessage("I am waiting for suggestionBox.")
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(getDataPropFile("cssSuggestionBox"))));
				
		
		//Check if suggestion box is present
		WebElement suggestionBox = driver.findElement(By.cssSelector(getDataPropFile("cssSuggestionBox")));
		String classVal = suggestionBox.getAttribute("class");
		System.out.println("class Val is = " + classVal);
		
		Assert.assertTrue(classVal.contains("visible"), "Suggestion bos is not present.");
		
		//How many suggestions?
		/*
		 * WebElement el =
		 * driver.findElement(By.cssSelector("ul[class='suggestion-box__list']"));
		 * List<WebElement> myL = el.findElements(By.tagName("li"));
		 */
		
		
		
		
		List<WebElement> suggestionListCount = driver.findElement(By.cssSelector("ul[class='suggestion-box__list']")).findElements(By.tagName("li"));
		System.out.println("Total Li tags = " + suggestionListCount.size());
		
		//Assert.assertNotEquals(suggestionListCount.size(), 0, "");
		Assert.assertFalse(suggestionListCount.size()== 0, "Suggestion list not present.");
		
		for(int i = 0; i<suggestionListCount.size(); i++) {
			String suggestionName = suggestionListCount.get(i).getText();
			System.out.println(suggestionName);
			
			if(suggestionName.contains(suggestionText) && suggestionName.contains(destination)) {
				suggestionListCount.get(i).click();
				break;
			}
		}
		
		//Assignment - To
		//Click on Depart Date = Current Date + 20 Days
		
		WebElement departCal = driver.findElement(By.cssSelector("input[id='cal0']"));
		departCal.click();
		
		String currentMonthInCal = driver.findElement(By.cssSelector("div[class='calendar__single-month active'] > div")).getText();
		System.out.println("Month name is = " + currentMonthInCal);
		
		for(int i = 1; i <=42; i++) {
			String dateSelector = "div[class='calendar__single-month active'] > div:nth-child(3) > div:nth-child(" + i + ") > a";
			
			try {
				String dateInCal = driver.findElement(By.cssSelector(dateSelector)).getText();
				System.out.println(dateInCal);
				
				if(dateInCal.contains(departDate)) {
					driver.findElement(By.cssSelector(dateSelector)).click();
					System.out.println("Date selected.");
					break;
				}
			}
			catch(Exception e) {
				System.out.println("No date found for selector = " + dateSelector);
			}
		}
	}

	@DataProvider(name="testData")
	public Object[][] getTestData() {
		
		return new Object[][] {
			{"NYC", "New York", "28"},
			//{"LAS", "Las Vegas", "27"},
		};
		
	}
}
