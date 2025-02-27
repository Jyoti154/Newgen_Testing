package Day42;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class baclass {
	@Test
	void login()
	{
		System.out.println("this is login");
	}
	
	
	@AfterClass
	void logout()
	{
		System.out.println("this is logout..");
	}

}
