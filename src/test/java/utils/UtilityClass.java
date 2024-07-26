package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UtilityClass {

public static WebDriver driver;
	
	
	public void browserLaunch()
	{
		
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	public void browserClose()
	{
		driver.close();
	}
	
	
	public void clicking(WebElement ele)
	{
		ele.click();
	}
	
	public void sendkeys(WebElement ele, String value)
	{
		ele.sendKeys(value);

	}
	
	
	public void assert_check(String actualTest, String expectedTest)
	{
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		Assert.assertEquals(actualTest, expectedTest);
	}
}
