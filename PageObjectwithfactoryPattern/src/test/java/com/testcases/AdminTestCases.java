package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.pages.AdminPage;
import com.pages.LoginPage;

public class AdminTestCases {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
//		ChromeOptions opt = new ChromeOptions());
//		opt.setCapability("Chrome", "126.0.6478.127");

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(3000);

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUsername("Admin", "admin123");
		Thread.sleep(3000);

		AdminPage ap = PageFactory.initElements(driver, AdminPage.class);
		ap.adminModuleClick();
		
		Thread.sleep(2000);
		login.tearDown();
		
	}

}
