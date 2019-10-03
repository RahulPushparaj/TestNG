package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HowToSetPriority 
{
	@BeforeClass
	public	void launchBrowser() 
	{
		System.out.println("launch");
	}
	@AfterClass
	public void closebrowser() 
	{
		System.out.println("close");
	}
	@BeforeMethod
	public void starttime()
	{
		System.out.println("start");
	}
	@AfterMethod
	private void endtime() 
	{
		System.out.println("end");
	}
	@Test(priority=-1)
	public void Test2() 
	{
	System.out.println("Test2");
	}
	@Test(priority=5)
	public void Test1() 
	{
		System.out.println("Test1");
	}
	@Test(priority=-2)
	public void Test4() 
	{
		System.out.println("Test4");
	}
	@Test(priority=6)
	public void Test3() 
	{
		System.out.println("Test3");
	}

}
