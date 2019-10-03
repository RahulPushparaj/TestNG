package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowerByUsingMethod_Same
{
	@Test
	public void aTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Rahul");
		driver.quit();
	}
	@Test
	public void bTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Anitha");
		driver.quit();
	}
	@Test
	public void cTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Anu");
		driver.quit();
	}
	@Test
	public void dTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Poori");
		driver.quit();
	}
	@Test
	public void eTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Vickygggggggggggggggggggggggggggggggggggggg");
		driver.quit();
	}
	@Test
	public void fTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("Karthi");
		driver.quit();
	}
}
