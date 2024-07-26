package test;

import org.testng.annotations.Test;

import base.ProjectSpecificationMethod;
import pages.HomePage;
import pages.LoginPage;

public class SigTes extends ProjectSpecificationMethod {
@Test
	public void SignupT()
	{
		
		HomePage obj = new HomePage(driver);
		LoginPage ob = new LoginPage(driver);
		
		
		obj.clickSignup();
		ob.enterEmail("Priyavenk");
		ob.enterPassword("Priya@22");
		ob.loginClick();
		
		
		}

}
