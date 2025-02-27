package Day42;


import org.testng.annotations.*;

public class allanotions {

	@BeforeSuite
	void bs()
	{
		System.out.println("this is before suite");
	}
	@AfterSuite
	void as()
	{
		System.out.println("this is after suite");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("this is before test");
	}
	@AfterTest
	void at()
	{
		System.out.println("this is after test");
	}
	@BeforeClass
	void bl()
	{
		System.out.println("thiss is before class");
	}
	@AfterClass
	void al()
	{
		System.out.println("this is after clas");
	}
	@BeforeMethod
	void bf()
	{
		System.out.println("this is before method");
	}
	@AfterMethod
	void af()
	{
		System.out.println("this is after method");
	}
	@Test(priority=1)
	void t1()
	{
		System.out.println("this is test1");
	}
	@Test(priority=2)
	void t2()
	{
		System.out.println("this is test2");
	}
}
