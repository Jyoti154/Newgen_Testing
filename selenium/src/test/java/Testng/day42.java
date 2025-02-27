package Testng;

import org.testng.annotations.*;

public class day42 {

	@BeforeTest
	void testlogin()
	{
		System.out.println("test login");

	}

	@Test(priority=1)
	void openapp()
	{
		System.out.println("openapp");

	}
	@Test(priority=2)
	void searh()
	{
		System.out.println("search");
	}
	@Test(priority=3)
	void advsearch()
	{
		System.out.println("advsearch");
	}
	@AfterTest
	void logout()
	{

		System.out.println("logout");

	}
}
