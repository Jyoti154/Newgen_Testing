package Day42pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class c3 {
	@Test
	void test()
	{
		System.out.println("this is test form c3");
	}

	@BeforeSuite
	void prt()
	{
		System.out.println("this is beforesuite");
	}
	
	@AfterSuite
	void rhl()
	{
		System.out.println("this is aftersuite");
	}
}

