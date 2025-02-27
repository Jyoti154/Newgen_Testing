package Day42;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardvsSoftAssertion {
	

	//@Test
	void test_hardassertion()
	{
		System.out.println("testing");
		System.out.println("testing");
		
		Assert.assertEquals(1, 2);
		
		System.out.println("testing");
		System.out.println("testing");
		
		
		
	}
	SoftAssert sa;
	@Test
	void test_softassert()
	{
		System.out.println("test");
		System.out.println("jyoti");
		
		
		
		sa.assertEquals(1, 1);
	
		System.out.println("arati");
	
		System.out.println("newgen");
		sa.assertAll();
	
	}
	@Test
	void test_soft()
	{
		System.out.println(456);
		System.out.println(453);
		sa.assertEquals(2, 2);
		System.out.println(963);
		System.out.println(196);
		sa.assertAll();
	}

}
