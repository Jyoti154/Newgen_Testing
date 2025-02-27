package Day44;

import org.testng.annotations.Test;

public class gr3 {

	
	@Test(priority=1,groups= {"regression" ,"smoke","functional"})
	void logoutfb()
	{
		System.out.println("logout to facebbok");
	}
	
	@Test(priority=2,groups= {"regression"})
	void logoutamazon()
	{
		System.out.println("logout to amazon");
	}
	
	@Test(priority=1,groups= {"regression","sanity"})
	void logoutmesho()
	{
		System.out.println("logout to mesho");
	}
}
