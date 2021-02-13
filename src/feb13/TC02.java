package feb13;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC02 extends BaseClass{

	@Test
	public void testCase02() throws Exception{
		driver.get("https://www.cheapoair.com/");
		
		//Enter Destination
		WebElement from = driver.findElement(By.cssSelector("input[id='from0']"));
		String writtenVal = from.getAttribute("value");
		
		System.out.println("writtenVal = " + writtenVal);
		
		//from.clear();
		if(!(writtenVal == null) && !(writtenVal == "")) {
			driver.findElement(By.cssSelector("a[class='suggestion-box__clear icon']")).click();
			
			writtenVal = from.getAttribute("value");
			System.out.println("writtenVal = " + writtenVal);
			
		}
		
		String destination = "NYC";
		from.sendKeys(destination);
		Thread.sleep(3000);
		
		//Check if suggestion box is present
		WebElement suggestionBox = driver.findElement(By.cssSelector("div[class*='suggestion-box__content air']"));
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
			
			if(suggestionName.contains("New York") && suggestionName.contains(destination)) {
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
				
				if(dateInCal.contains("18")) {
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
}
