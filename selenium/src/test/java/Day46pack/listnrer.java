package Day46pack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class listnrer implements ITestListener{
	
	 public void onStart(ITestContext context) 
     {
	 System.out.println("test executen start");
	
	  }
	 
	 public void onTestStart(ITestResult result)
	     {
		    
		 System.out.println("test start");
		  }
	 
	public void onTestSuccess(ITestResult result) 
	     {
System.out.println("test success");

		  }
	 public void onTestFailure(ITestResult result)
	     {
		 System.out.println("test failure");
		   
		  }
	  
	  public void onTestSkipped(ITestResult result)
	     {
System.out.println("test skipp");

		  }
	  public void onFinish(ITestContext context) 
	     {
System.out.println("test exuction finish");

		  }
	 
	 
	 

}
