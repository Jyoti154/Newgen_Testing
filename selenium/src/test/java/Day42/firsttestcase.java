package Day42;

import org.testng.annotations.Test;

public class firsttestcase
{
	
	
	@Test(priority=15)
	void openapp()
	{
		System.out.println("opening application......");
	}
	
	@Test(priority=10)
	void login()
	{
		System.out.println("login application.....");
	}
	
  @Test(priority=10)
	void logout()
	{
		System.out.println("logout application......");
	}
	
	
	
	
	
	
	
	
}

