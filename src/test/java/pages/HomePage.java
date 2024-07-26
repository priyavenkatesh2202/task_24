package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethod;
import utils.UtilityClass;

public class HomePage extends ProjectSpecificationMethod {
	
	
	@FindBy(id="signin2")
	WebElement sign; 
	
	@FindBy(id="login2")
	WebElement login;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public void clickSignup()
	{
		sign.click(); 
	}
	
	public void clickLoginn()
	{
		login.click();
	}
	
	
	public HomePage validateLogin() 
	{	String expectedTest= "Welcome priyavenk";
		String actualText = driver.findElement(By.id("nameofuser")).getText();
		System.out.println(actualText);
		assert_check(actualText,expectedTest);
		
		return this;
	}



	
	
	
	
	
	
        
       
 
	}


//select[@class='form-control form-select ']