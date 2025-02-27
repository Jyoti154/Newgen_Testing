package Day44;

import org.testng.annotations.Test;

public class m2 {

	@Test(priority=1,groups= {"smoke"})
	void loginfb()
	{
		System.out.println("login to facebook");
	}
	
	@Test (priority=2,groups= {"smoke"})
	void loginflipcart()
	{
		System.out.println("login to flipcart");
	}
	
	@Test(priority=3,groups= {"smoke"})
	void loginmesho()
	{
		System.out.println("login to mesho");
	}
}
