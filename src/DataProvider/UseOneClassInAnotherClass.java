package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UseOneClassInAnotherClass 
{
	@Test(dataProvider = "datas", dataProviderClass = UseInOneClass.class)
	public void test(String e,String p,String fn) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\PUSHPARAJ123\\TestNGG\\Driver\\chromedriver.exe");
		WebDriver d =new ChromeDriver();
		d.get("https://www.facebook.com");
		d.findElement(By.id("email")).sendKeys(e);
		d.findElement(By.id("pass")).sendKeys(p);
		d.findElement(By.name("firstname")).sendKeys(fn);
		Thread.sleep(6000);
		d.quit();
	}
}
