package Day44;

import org.testng.annotations.Test;

public class logintest {

	@Test(priority=1,groups= {"sanity"})
	void loginbyfasebook()
	{
		System.out.println("this is loginbyfasebook.....");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void email()
	{
		System.out.println("this is loginbyemail.....");
	}
	
	
	@Test(priority=3,groups= {"sanity"})
	void loginbytwitter()
	{
		System.out.println("this is loginbytwitter.....");
	}
}
