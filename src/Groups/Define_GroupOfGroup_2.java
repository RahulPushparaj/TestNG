package Groups;

import org.testng.annotations.Test;

public class Define_GroupOfGroup_2 
{
	@Test(groups = "1")
	public void a1Test() 
	{
		System.out.println("A1");
	}

	@Test(groups = "1")
	public void b1test()
	{
		System.out.println("B1");
	}

	@Test(groups = "2")
	public void c1Test()
	{
		System.out.println("C1");
	}

	@Test(groups = "2")
	public void d1Test() 
	{
		System.out.println("D1");
	}

	@Test(groups = "3")
	public void e1test()
	{
		System.out.println("E1");
	}

	@Test(groups = "3")
	public void f1Test()
	{
		System.out.println("F1");
	}
}

/*
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
	<test name="Test">
	<groups>
		<define name ="1and1">
			<include name="1"></include>
			<include name="2"></include>
		</define>
		
		<define name ="All">
			<include name="1"></include>
			<include name="2"></include>
			<include name="3"></include>
		</define>
		
		<define name ="1">
			<include name="1"></include>
		</define>
		
		<run>
			<include name ="1"/>
		</run>
	</groups>
	
		<classes>
			<class name="Groups.Define_GroupOfGroup_1" />
			<class name="Groups.Define_GroupOfGroup_2" />
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite -->
 */
