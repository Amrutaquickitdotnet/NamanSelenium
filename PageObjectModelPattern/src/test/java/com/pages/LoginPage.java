package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//Locator for username field
	
	//Page factory 
	// without page factory 
	//locator for username
       By uname =  By.xpath("//input[@name ='username']");
       
       //locator for password 
       
       By password =  By.xpath("//input[@name='password']");
       
     //locator for loginButton 
       
       By loginButton =  By.xpath("//button[@type='submit']");
	
       
       public void enterUsername(String user) 
       {
    	   
    	   driver.findElement(uname).sendKeys(user);
       }
       
       
       public void enterPassword(String pwd) 
       {
    	   
    	   driver.findElement(password).sendKeys(pwd);
       }
       
       public void clickLogin() 
       {
    	   
    	   driver.findElement(loginButton).click();
       }
       
	
}
