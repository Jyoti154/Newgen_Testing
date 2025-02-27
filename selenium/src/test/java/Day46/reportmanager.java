package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class reportmanager implements ITestListener{
	
	public ExtentSparkReporter sparkreporter;
	public ExtentReports extents;
	public ExtentTest test;

	public void onStart(ITestContext context) 
	{

		sparkreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/report1.html");
		sparkreporter.config().setDocumentTitle("Automation Testing");
		sparkreporter.config().setReportName("functional test");
		sparkreporter.config().setTheme(Theme.DARK);
		
		extents=new ExtentReports();
		extents.attachReporter(sparkreporter);
		
		
		extents.setSystemInfo("Computer Name", "localhost");
		extents.setSystemInfo("Envornment","QA");
		extents.setSystemInfo("Tester Name","Jyoti");
		extents.setSystemInfo("Os","Windo10");
		extents.setSystemInfo("Browser Name","Chrome");
		
		
	}
	public  void onTestSuccess(ITestResult result) 
	{
      test=extents.createTest(result.getName());
      test.log(Status.PASS, "test case pass" +result.getName());

	}

	public  void onTestFailure(ITestResult result) 
	{
		test=extents.createTest(result.getName());
	      test.log(Status.FAIL, "test case fail" +result.getName());
	      test.log(Status.FAIL, "test case fail cause is" +result.getThrowable());

	}

	public  void onTestSkipped(ITestResult result) 
	{
		test=extents.createTest(result.getName());
	      test.log(Status.SKIP, "test case skip is" +result.getName());

	}
	public  void onFinish(ITestContext context) 
	{

		extents.flush();


	}
}