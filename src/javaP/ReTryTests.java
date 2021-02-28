package javaP;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTryTests implements IRetryAnalyzer{

	private int retryCount = 0;
<<<<<<< HEAD
	private static final int maxRetryCount = 2;
=======
	private static final int maxRetryCount = 0;
>>>>>>> 9bc4a2d34bdcc44cd0529e4d7cbb0a08382aa932
	 
	  @Override
	  public boolean retry(ITestResult result) {
	    
		  if (retryCount < maxRetryCount) {
	      retryCount++;
	      return true;
	    }
		  
	    return false;
	  }

}
