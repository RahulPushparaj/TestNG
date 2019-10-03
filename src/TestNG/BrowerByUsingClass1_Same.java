package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowerByUsingClass1_Same 
{
	@Test
	public void aTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\RAHUL\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("RahulRahulRahulRahul");
		driver.quit();
	}

}
