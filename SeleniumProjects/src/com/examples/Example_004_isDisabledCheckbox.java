package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_004_isDisabledCheckbox {

	static WebDriver driver;

	public static void main(String[] args) {
		
		launchbrowser();
		isEnabledCheckbox();
	}
	
	public static void launchbrowser() {
		driver = new ChromeDriver();

		driver.get("C:/Users/Admin/OneDrive/Desktop/Checkbox.html");

	}

	public static void checkCheckbox() {

	
		WebElement checkboxElement2 = driver.findElement(By.id("vehicle2"));// locate web element to whom should i check
		
		boolean isDisplayed = checkboxElement2.isDisplayed();// deciding initial property of checkbox
		
		System.out.println(isDisplayed);

//		if (isDisplayed == true) {
//			checkboxElement2.click();
//		}
		
	}

	public static void isEnabledCheckbox() {
       WebElement checkboxElement2 = driver.findElement(By.id("vehicle2"));// locate web element to whom should i check
		
		boolean isEnabled = checkboxElement2.isEnabled();// deciding initial property of checkbox
		
		System.out.println(isEnabled);
		
		if (isEnabled == true) {
		checkboxElement2.click();
	}
		
	}
}