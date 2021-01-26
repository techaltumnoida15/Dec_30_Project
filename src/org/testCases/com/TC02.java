package org.testCases.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC02 extends BaseClass{

	@Test
	public void testCase02() throws Exception{
		//Enter URL
		driver.get("http://www.facebook.com");
		Thread.sleep(4000);
		
		WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@class='_8esa']"));
		
		if(femaleRadioButton.isSelected()) {
			System.out.println("Female radio button is selected");
		}
		else {
			System.out.println("Female radio button is not selected");
		}
		
		//Click on Female Radio button
		femaleRadioButton.click();
		System.out.println("Click on female radio button");
		
		if(femaleRadioButton.isSelected()) {
			System.out.println("Female radio button is selected");
		}
		else {
			System.out.println("Female radio button is not selected");
		}
		
		//Refresh page
		driver.navigate().refresh();
		
		//Go to Back
		driver.navigate().back();
		
		//Forward
		driver.navigate().forward();
		
		//Cookies
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed(arg0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
