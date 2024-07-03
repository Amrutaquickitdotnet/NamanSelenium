package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_003_HandleCheckbox {

	static WebDriver driver;

	public static void main(String[] args) {

		checkCheckbox();
		//unCheckbox();
	}

	public static void checkCheckbox() {

		driver = new ChromeDriver();

		driver.get("C:/Users/Admin/OneDrive/Desktop/Checkbox.html");

		WebElement checkboxCarElement = driver.findElement(By.id("vehicle2"));// locate web element to whom should i check
		
		boolean isSelected = checkboxCarElement.isSelected();// deciding initial property of checkbox
		
		System.out.println(isSelected);

		if (isSelected == false) {
			checkboxCarElement.click();
		}
		boolean isSelected2 = checkboxCarElement.isSelected();
		System.out.println("After checking checkbox"+ isSelected2);
	}

	public static void unCheckbox() {
		// isSelected(): checks wheather checkbox is selected or not
		// isDisplayed(): checks whether checkbox display on the web page
		// isEnabled(): checks whether a checkbox is enabled or not

		driver.findElement(By.id("vehicle2")).click();

	}
}
