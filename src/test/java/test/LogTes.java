package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;
import pages.LoginPage;

public class LogTes extends ProjectSpecificationMethod{
@Test
	public  void logT() throws InterruptedException {
		// TODO Auto-generated method stub
		HomePage obj = new HomePage(driver);
		LoginPage ob = new LoginPage(driver);
		
		obj.clickLoginn();
		ob.enterusername1("priyavenk");
		ob.enterpassword1("Priya@12345");
		ob.login();
		Thread.sleep(2000);
		obj.validateLogin();
		obj.browserClose();
		
		
		

	}

}
