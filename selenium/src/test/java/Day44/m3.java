package Day44;

import org.testng.annotations.Test;

public class m3 {
	
	@Test(priority=1,groups= {"sanity"})
	void signupfb()
	{
		System.out.println("sign up to facebook");
	}

	
	@Test(priority=2,groups= {"sanity"})
	void signupflipcart()
	{
		System.out.println("sign up to flipcart");
	}
	
	@Test(priority=3,groups= {"sanity","regression","functional"})
	void signupmesho()
	{
		System.out.println("sign up to mesho");
	}
}
