package TestNG;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IntegrateWithSelenium
{
WebDriver driver;
@BeforeClass
public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
	Assert.assertTrue(driver.getTitle().contains("book"));
}
@AfterClass
public void closeBrowser() {
	driver.quit();
	}
@BeforeMethod
public void startTime() {
	Date d = new Date();
	System.out.println(d);
}
@AfterMethod
public void endTime() {
	Date d=new Date();
	System.out.println(d);
}
@Test
public void Test1() {
	WebElement e=driver.findElement(By.id("email"));
	e.sendKeys("Rahul");
	Assert.assertEquals("Rahul",e.getAttribute("value"));
	WebElement p=driver.findElement(By.id("pass"));
	p.sendKeys("Priya");
	Assert.assertEquals("Priya",p.getAttribute("value"));
}
@Test
public void Test2() {
	driver.findElement(By.id("loginbutton")).click();
}
}
