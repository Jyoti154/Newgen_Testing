package Day42;

import org.testng.annotations.Test;

public class secoundtest {

	@Test(priority=2)
	void firstname()
	{
		System.out.println("first name is jyoti..");
	}
	
	@Test(priority=3)
	void fathersname()
	{
		System.out.println("fathers name dashrath...");
	}
	
	
	@Test(priority=1)
	void lastname()
	{
		System.out.println("last name is mane/bagal.....");
	}
	
}
