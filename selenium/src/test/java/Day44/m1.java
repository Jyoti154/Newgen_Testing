package Day44;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class m1 {

	
	@Test(priority=1)
	void openapp()
	{
		
	}
	
	@Test(priority=2,groups= {"sanity"})
	void login()
	{
		Assertion as=new Assertion();
		as.assertTrue(true);
		System.out.println("this is login");
	}
	
	@Test(priority=3,groups= {"smoke"})
	void search()
	{
		
	}
	
	@Test(priority=4,groups= {"regression"})
	void advsearch()
	{
		
	}
	
	@Test(priority=5,groups= {"sanity"})
	void logout()
	{
		
		
	}
}
