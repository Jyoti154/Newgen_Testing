package Day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreportmanager implements ITestListener
{
public ExtentSparkReporter sparkReporter ;
public ExtentReports extent;
public ExtentTest test;

public void onStart(ITestContext context) 
{
	sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
	
	sparkReporter.config().setDocumentTitle("Automation Report");
	sparkReporter.config().setReportName("Functional Testing");
	sparkReporter.config().setTheme(Theme.STANDARD);
	
	extent=new ExtentReports();
	extent.attachReporter(sparkReporter);
	
	extent.setSystemInfo("Computer Name", "localhost");
	extent.setSystemInfo("Envornment","QA");
	extent.setSystemInfo("Tester Name","Jyoti");
	extent.setSystemInfo("Os","Windo10");
	extent.setSystemInfo("Browser Name","Chrome");
	
	
}

public void onTestSuccess(ITestResult result)
{
	test=extent.createTest(result.getName());
	test.log(Status.PASS,"Test case Passed is:"+result.getName());
}

public  void onTestFailure(ITestResult result) 
{
	test=extent.createTest(result.getName());
	test.log(Status.FAIL,"Test case fail is:"+result.getName());
	test.log(Status.FAIL,"Test case fail cause is:"+result.getThrowable());
	}

public  void onTestSkipped(ITestResult result) 
{
	test=extent.createTest(result.getName());
	test.log(Status.SKIP,"Test case skip is:"+result.getName());
}

public void onFinish(ITestContext context)
{

	extent.flush();












}
}
