package Day42pack2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class afterclass {

	
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
