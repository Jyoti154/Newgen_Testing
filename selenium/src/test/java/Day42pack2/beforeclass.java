package Day42pack2;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class beforeclass {

	

	@BeforeClass
	void login()
	{
		System.out.println("this is login...");
	}
	
	
	

	@Test(priority=1)
	void search()
	{
		System.out.println("this is search...");
		
	}
	
	@Test(priority=2)
	void advancesearch()
	{
		System.out.println("this is advsearch");
}
}