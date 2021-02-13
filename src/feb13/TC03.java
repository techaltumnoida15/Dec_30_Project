package feb13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

import basePack.BaseClass;

public class TC03 extends BaseClass{
	
	@Test
	public void testCase04() throws Exception{
		driver.get("http://www.naukri.com");
		
		Thread.sleep(4000);
		
		//Handle multiple browser windows.
		
		Set<String> windowHandle = driver.getWindowHandles();
		System.out.println("Total open wins are = " + windowHandle.size());
		
		System.out.println(windowHandle);
		
		List<String> myL = new ArrayList<String>();
		Iterator<String> itr = windowHandle.iterator();
		
		for(int i = 0; i<windowHandle.size(); i++) {
			myL.add(itr.next());
		}
		
		driver.switchTo().window(myL.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.close();
		
	}

}
