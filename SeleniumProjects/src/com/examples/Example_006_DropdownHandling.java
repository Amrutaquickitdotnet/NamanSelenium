package com.examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_006_DropdownHandling {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		launchbrowser();
		
		dropDownSelection();
	}

	public static void launchbrowser() {
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

	}
//  Get the count of the webElement binded inside dropdown 
	// Print name of All WebElement 
	// Print Specific Country
	public static void dropDownSelection() throws Exception {

		WebElement createNewAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		createNewAccount.click();

		Thread.sleep(2000);

		List<WebElement> dayList = driver.findElements(By.xpath("//select[@id='day']"));
		for (WebElement days : dayList) {
			System.out.println(days.getText());
		}

		WebElement monthselection = driver.findElement(By.xpath("//select[@id='month']"));
		Select s = new Select(monthselection);
		
		List<WebElement> listofmonths = 	s.getOptions();
		
		for(WebElement totalMonths:listofmonths) {
			
			System.out.println(totalMonths.getText());
		}
		
	WebElement selectedOptionforMonth =	s.getFirstSelectedOption();
	System.out.println("Seleced option "+selectedOptionforMonth.getText());
	}

}
