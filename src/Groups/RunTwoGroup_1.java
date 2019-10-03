package Groups;

import org.testng.annotations.Test;

public class RunTwoGroup_1 
{
	@Test(groups = {"1","2"} )
	public void aTest() 
	{
		System.out.println("A");
	}

	@Test(groups = {"1","2"})
	public void btest()
	{
		System.out.println("B");
	}

	@Test(groups = {"3","4"})
	public void cTest()
	{
		System.out.println("C");
	}

	@Test(groups = {"3","4"})
	public void dTest() 
	{
		System.out.println("D");
	}

	@Test(groups = {"5","6"})
	public void etest()
	{
		System.out.println("E");
	}

	@Test(groups = {"5","6"})
	public void fTest()
	{
		System.out.println("F");
	}
}
/*
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<groups>
		<run>
			<include name="3"></include>
			<include name="4"></include>
		</run>
	</groups>
	<test name="Test">
		<classes>
			<class name="Groups.RunTwoGroup_1" />
			<class name="Groups.RunTwoGroup_2" />
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite -->
*/
