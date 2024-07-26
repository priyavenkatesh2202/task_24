package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;

public class LoginPage extends ProjectSpecificationMethod {
	
	
	@FindBy(id="sign-username")  
	WebElement username;
	
	

	@FindBy(id="sign-password")
     WebElement password;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
	WebElement SignUp;
	
	
	@FindBy(id="loginusername")
	WebElement user;
	
	@FindBy(id="loginpassword")
	WebElement password1;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement log;
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	 public LoginPage enterEmail(String email)
	 {
	        
	      username.sendKeys(email);
	        return this;
	    }
	 
	 public LoginPage enterPassword (String pass)
	 {
		 password.sendKeys(pass);
		return this;
	 }
	 
	 public HomePage loginClick() {
	     
	        SignUp.click();
	        return new HomePage(driver);
	    }
	 
	
	 
	 public LoginPage enterusername1(String mail)
	 {
		 user.sendKeys(mail);
		 return this;
	 }
	 
	 
	 public LoginPage enterpassword1(String Pas)
	 {
		 password1.sendKeys(Pas);
		 return this;
		 
		 
	 }
	 
	 public LoginPage login()
	 {
		 log.click();
		return this;
	 }
}


