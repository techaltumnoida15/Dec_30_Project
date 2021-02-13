package javaP;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryTests implements IRetryAnalyzer{

	private int retryCount = 0;
	private static final int maxRetryCount = 0;
	 
	  @Override
	  public boolean retry(ITestResult result) {
	    
		  if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
		  
	    return false;
	  }

}