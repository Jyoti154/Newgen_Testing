package Day44;

import org.testng.annotations.Test;

public class signuptest {

	@Test(priority=1,groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println(" tis is sign up by facebook");
	}
	
	@Test(priority=2,groups= {"regression"})
	void signupbyemail()
	{
		System.out.println(" tis is sign up by email");
	}
	
	@Test(priority=3,groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println(" tis is sign up by twitter");
	}
}
