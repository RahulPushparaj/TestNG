package Groups;

import org.testng.annotations.Test;

public class Define_GroupOfGroup_1
{
	@Test(groups = "1" )
	public void aTest() 
	{
		System.out.println("A");
	}

	@Test(groups = "1")
	public void btest()
	{
		System.out.println("B");
	}

	@Test(groups = "2")
	public void cTest()
	{
		System.out.println("C");
	}

	@Test(groups = "2")
	public void dTest() 
	{
		System.out.println("D");
	}

	@Test(groups = "3")
	public void etest()
	{
		System.out.println("E");
	}

	@Test(groups = "3")
	public void fTest()
	{
		System.out.println("F");
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
