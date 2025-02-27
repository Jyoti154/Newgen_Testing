package Day44;

import org.testng.annotations.Test;

public class gr2 {

	
	@Test(priority=1,groups= {"smoke"})
	void signupfb()
	{
		System.out.println("sign up facebook");
	}
	
	@Test(priority=2,groups= {"smoke"})
	void signupamazon()
	{
		System.out.println("sign up to amazon");
	}
	
	@Test(priority=3,groups= {"smoke"})
	void signupmesho()
	{
		System.out.println("sign up to mesho");
	}
}
