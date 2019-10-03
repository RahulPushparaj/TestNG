package RexecuteFailedTestcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Manual
{
	@Test
	public void atest() {
		Assert.assertTrue(true);
		System.out.println("A");
	}
	@Test
	public void btest() {
		Assert.assertTrue(false);
		System.out.println("B");
	}
	@Test
	public void ctest() {
		Assert.assertTrue(true);
		System.out.println("C");
	}
	@Test
	public void dtest() {
		Assert.assertTrue(true);
		System.out.println("D");
	}
}
