package TestNG;

import org.testng.annotations.Test;

public class ByUsingInclude 
{
	@Test
	public void atest() {
		System.out.println("A");
	}
	@Test
	public void btest() {
		System.out.println("B");
	}
	@Test
	public void ctest() {
		System.out.println("C");
	}
	@Test
	public void dtest() {
		System.out.println("D");
	}
	@Test
	public void etest() {
		System.out.println("E");
	}
	@Test
	public void ftest() {
		System.out.println("F");
	}
	@Test
	public void gtest() {
		System.out.println("G");
	}
	@Test
	public void htest() {
		System.out.println("H");
	}
	@Test
	public void itest() {
		System.out.println("I");
	}
}

/*
	<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="suite">
	
	<test name="Test">
		<classes>
			<class name = "TestNG.ByUsingInclude">
			
		<methods>
			<include name = "itest"></include>
			<include name = "atest"></include>
			<include name = "gtest"></include>
			<include name = "ctest"></include>
		</methods>
			</class>
		</classes>
	</test> <!-- Test -->
</suite> <!-- Suite -->
*/