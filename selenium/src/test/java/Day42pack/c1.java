package Day42pack;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c1 {
	
	@Test
	void test()
	{
		System.out.println("this is test from c1");
	}
@BeforeTest
	void bt()
	{
		System.out.println("this is before test");
	}
@AfterTest
void bs()
{
	System.out.println("after test");
}
}
