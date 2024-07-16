package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

	WebDriver driver;
	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By adminlink = By.linkText("Admin");
	
	
	
	
	public void adminModuleClick() {
		driver.findElement(adminlink).click();
		
		
	}
}
