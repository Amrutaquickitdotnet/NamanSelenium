package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;

public class LoginTestcases {
	
	

	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		
		lp.clickLogin();
	}
}
