package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.UtilityClass;

public class ProjectSpecificationMethod extends UtilityClass

{	@BeforeMethod
	public void launchingBrowser()
	{
		browserLaunch();
	}

	public void closingBrowser()
	
	{
		browserClose();
	}
	
}

