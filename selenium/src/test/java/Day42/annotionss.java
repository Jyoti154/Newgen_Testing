package Day42;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotionss {
	
	
	@BeforeMethod
	void login()
	{
		System.out.println("this is login");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("this is search");
	}
	
	
	@Test(priority=2)
	void advancesearch()
	{
		System.out.println("this is advancesearch");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("this is logout");
	}
	

}



