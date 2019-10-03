package Groups;

import org.testng.annotations.Test;

public class RunTwoGroup_2 
{
	@Test(groups = {"1","2"})
	public void a1Test() 
	{
		System.out.println("A1");
	}

	@Test(groups = {"1","2"})
	public void b1test()
	{
		System.out.println("B1");
	}

	@Test(groups = {"3","4"})
	public void c1Test()
	{
		System.out.println("C1");
	}

	@Test(groups = {"3","4"})
	public void d1Test() 
	{
		System.out.println("D1");
	}

	@Test(groups = {"5","6"})
	public void e1test()
	{
		System.out.println("E1");
	}

	@Test(groups = {"5","6"})
	public void f1Test()
	{
		System.out.println("F1");
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
