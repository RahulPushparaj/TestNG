package TestNG;

import org.testng.annotations.Test;

public class ToIgnoreTheParticularTest 
{
	@Test
	public void aTest() {
		System.out.println("A");
	}
	@Test(enabled = false)
	public void btest() {
		System.out.println("B");
	}
	@Test
	public void cTest() {
		System.out.println("C");
	}
}
