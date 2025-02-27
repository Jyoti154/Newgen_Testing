package Day42;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	
	@Test
	void testtitle()
	{
		
		String exp_title="opencart";
		String act_title="opencart";
		
		if(exp_title.equals(act_title))
		{
			System.out.println("test pass");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test fail");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(exp_title,act_title );
		
		
	}

}
