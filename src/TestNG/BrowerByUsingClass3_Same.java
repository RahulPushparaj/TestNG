package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowerByUsingClass3_Same
{

	@Test
	public void aTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("AnusuyaAnusuyaAnusuyaAnusuya");
		driver.quit();
	}

}
//One by one
/*
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite" thread-count="6">
  <test name="Test">
    <classes>
     
      <class name="TestNG.BrowerByUsingClass1_Same"/>
      <class name="TestNG.BrowerByUsingClass2_Same"/>
      <class name="TestNG.BrowerByUsingClass3_Same"/>
      
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
*/

//Parallel
/*
 <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="classes" thread-count="6">
  <test name="Test">
    <classes>
     
      <class name="TestNG.BrowerByUsingClass1_Same"/>
      <class name="TestNG.BrowerByUsingClass2_Same"/>
      <class name="TestNG.BrowerByUsingClass3_Same"/>
      
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

*/