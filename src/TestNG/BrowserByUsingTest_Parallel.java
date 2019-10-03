package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BrowserByUsingTest_Parallel
{
	@Parameters({"browser","username"})
	@Test
	public void atest(String b,String email)
	{
		WebDriver driver;
		if(b.equals("cc"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (b.equals("ff"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.quit();
	}

}


/*
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests" thread-count="6">
	<test name ="chrome">
	<parameter name="browser" value="cc"/>
	<parameter name="username" value="Rahul"/>
	<classes>
		<class name="TestNG.BrowerByUsingTest_Same"/>
	</classes>
	</test>
	
	<test name ="firefox">
	<parameter name="browser" value="ff"/>
	<parameter name="username" value="Anitha"/>
	<classes>
		<class name="TestNG.BrowerByUsingTest_Same"/>
	</classes>
	</test>
	
	<test name ="IE">
	<parameter name="browser" value="ie"/>
	<parameter name="username" value="Kalai"/>
	<classes>
		<class name="TestNG.BrowerByUsingTest_Same"/>
	</classes>
	
	
 </test> <!-- Test -->
</suite> <!-- Suite -->
*/