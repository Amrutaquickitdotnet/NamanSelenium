package com.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_007_DropdownHandling2 {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		launchbrowser();
		
//		dropDownSelection();
		specificSelection();
	}

	public static void launchbrowser() {
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/hr-software-sign-up/");

	}
//  Get the count of the webElement binded inside dropdown 
	// Print name of All WebElement 
	// Print Specific Country
	public static void dropDownSelection() throws Exception 
	{

//	List<WebElement>countryElement =	driver.findElements(By.id("Form_getForm_Country"));
//	
//	System.out.println("Count of Countries "+ countryElement.size());
	
	WebElement country =	driver.findElement(By.id("Form_getForm_Country"));
		Select s = new Select(country);
		List<WebElement>countryElement =	s.getOptions();
		 System.out.println(countryElement.size());
	 for(WebElement allCountries :countryElement) {
		
		 System.out.println(allCountries.getAttribute("value"));
	 }
	 
	 
	
	}
	
	public static void specificSelection() {
		WebElement country =	driver.findElement(By.id("Form_getForm_Country"));
		Select s = new Select(country);
		// in select class we do have 3 dedicated methods for selection 
		// 1. SelectByIndex 2. SelectByValue 3. Select by Visible Text
		
	//	s.selectByValue("Thailand");
		
		//s.selectByIndex(99);
		
		s.selectByVisibleText("India");
		
		
		
		
		
		
	}

}
