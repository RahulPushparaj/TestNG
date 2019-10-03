package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EasyToSetVerificationPoint_Assert 
{
	@Test
	public void Test2()  
	{
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("Test2");
	}
	@Test
	public void Test1() 
	{
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		//Assert.assertEquals(true, true);
		System.out.println("Test1");
	}
	@Test
	public void Test3()
	{
		Assert.assertFalse(false);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	//Assert.fail();
		System.out.println("Test3");

	}

}
