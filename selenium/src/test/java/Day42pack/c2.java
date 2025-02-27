package Day42pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c2 {
	
	@Test
	void test()
	{
		System.out.println("this is test from c2");
	}
@AfterTest
	void at()
	{
		System.out.println("this is after test");
	}

}
