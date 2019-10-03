package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ByUsingStringConcept
{
	@DataProvider(name = "datas")
	public Object[][] data()
	{
		return new Object[][] {{"kalai","kv","kalaivani"},{"sruthi","greens","tech"}};
	}
	@Test(dataProvider = "datas")
	public void test(String s[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("https://www.facebook.com");
		d.findElement(By.id("email")).sendKeys(s[0]);
		d.findElement(By.id("pass")).sendKeys(s[1]);
		d.findElement(By.name("firstname")).sendKeys(s[2]);
		Thread.sleep(6000);
		d.quit();
	}
}
