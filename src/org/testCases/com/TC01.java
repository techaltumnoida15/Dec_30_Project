package org.testCases.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC01 extends BaseClass{

	@Test
	public void ttestCase01() {
		//3. Enter URL - naukri.com
		driver.get("http://www.snapdeal.com");	
		
		//SignIn Element
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		
		//Check if an element is displayed on page or not
		boolean IsSignInDisplayed = signIn.isDisplayed();
		
		if(IsSignInDisplayed) {
			//Mouse over - Sign In
			Actions act = new Actions(driver);
			act.moveToElement(signIn);
			act.build().perform();      //Pls remember - 
		}
		else {
			System.out.println("SignIn is not displayed on page. Test is fail.");
		}
		
		
		//Click on Login
		WebElement logIn = driver.findElement(By.xpath("//a[text()='login']"));
		
		if(logIn.isEnabled()) {
			//Click 
			logIn.click();
		}
		else {
			System.out.println("Login is not enable. Test is fail.");
		}
		
	}
}
