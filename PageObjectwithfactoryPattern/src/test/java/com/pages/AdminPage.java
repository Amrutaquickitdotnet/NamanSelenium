package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {

	WebDriver driver;
	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@FindBy(linkText = "Admin")
	WebElement adminLink;
	
	
	
	
	public void adminModuleClick() {
		adminLink.click();
		
		
	}
}
