package Day44;

import org.testng.annotations.Test;

public class gr1 {

	
	@Test(priority=1,groups= {"sanity"})
	void loginfacebook()
	{
		System.out.println("login to facebook");
	}
	
	@Test(priority=2,groups= {"sanity"})
	void loginamazon()
	{
		System.out.println("login to amazon");
	}
	
	@Test(priority=3,groups= {"sanity"})
	void loginmesho()
	{
		System.out.println("login to mesho");
	}
}
