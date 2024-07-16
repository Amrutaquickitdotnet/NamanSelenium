package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}


	@FindBy(xpath = "//input[@name ='username']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	// locator for loginButton

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;

	public void enterUsername(String user,String pwd) {

		username.sendKeys(user);
		password.sendKeys(pwd);
		loginButton.click();
	}

	public void tearDown() {
		driver.close();
	}
	

	

}
