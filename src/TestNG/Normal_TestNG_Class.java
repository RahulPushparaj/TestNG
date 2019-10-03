package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Normal_TestNG_Class 
{
	@BeforeClass
	public	void launchBrowser() 
	{
		System.out.println(23);
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
	public void endtime() 
	{
		System.out.println("end");
	}
	@Test
	public void Test2() 
	{
	System.out.println("Test2");
	}
	@Test
	public void Test1() 
	{
		System.out.println("Test1");
	}
	@Test
	public void Test4() 
	{
		System.out.println("Test4");
	}
	@Test
	public void Test3() 
	{
		System.out.println("Test3");
	}
}
