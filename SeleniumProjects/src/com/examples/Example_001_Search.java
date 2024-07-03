package com.examples;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_001_Search {

	public static void main(String[] args) {
		launchbrowser();
		search();
	}
	
	static WebDriver driver;
	
	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();
	
	}
	
	
	public static void search() {
		
	WebElement serachElement =	driver.findElement(By.xpath("//input[@placeholder ='Search doctors, clinics, hospitals, etc.']"));
	serachElement.sendKeys("Dentist");
	
	
	
		List<WebElement> searchList =	driver.findElements(By.xpath("//div[@class='c-omni-suggestion-list']"));
		
		for(WebElement listAll:searchList) {
			System.out.println(listAll.getText());
			
		}
			
		}
		
		
	}


