package RexecuteFailedTestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Automation_IDoKnowWhichTestcaseFailure_Program
{
	@Test
	public void atest()
	{
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("A");
	}
	@Test
	public void btest()
	{
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		System.out.println("B");
	}
	@Test
	public void ctest()
	{
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		System.out.println("C");
	}

}
