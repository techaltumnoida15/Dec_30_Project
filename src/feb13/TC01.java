package feb13;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC01 extends BaseClass{

	@Test
	public void testCase01() throws Exception{
		/*
		//Use Keyboard
		WebElement element1 = driver.findElement(By.id(""));
		element1.sendKeys(Keys.TAB);
		
		//Handle page cookies
		driver.manage().deleteAllCookies();
		
		
		driver.navigate().refresh();
		driver.navigate().forward();
		*/
		
		driver.get("https://www.amazon.in/");
		
		//Mouse Over
		WebElement prime = driver.findElement(By.cssSelector("a[id='nav-link-prime']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(prime);
		act.build().perform();
		System.out.println("Mouse Over - Done");
		Thread.sleep(5000);
		
		//Click on image afetr mouse over
		driver.findElement(By.cssSelector("img[id='multiasins-img-link']")).click();
		Thread.sleep(5000);
		
	}
}
