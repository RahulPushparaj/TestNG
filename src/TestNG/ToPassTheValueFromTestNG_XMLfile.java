package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ToPassTheValueFromTestNG_XMLfile
{
	WebDriver driver;
	@Parameters({"username","password"})
	@Test
	public void aTest(String user, String pass)
	{
		System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement a = driver.findElement(By.id("email"));
		a.sendKeys(user);
		WebElement b = driver.findElement(By.name("pass"));
		b.sendKeys(pass);
		WebElement c = driver.findElement(By.id("loginbutton"));
		c.click();
		driver.quit();

	}
}
/*
 
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="suite">
	<parameter name="username" value="False Ceeling"></parameter>
	<parameter name="password" value=" eling False Ceeling"></parameter>
	<test thread-count="2" name="Test">
		<classes>
			<class name = "TestNG.ToPassTheValueFromTestNG_XMLfile" />
		</classes>

	</test> <!-- Test -->
</suite> <!-- Suite -->


*/