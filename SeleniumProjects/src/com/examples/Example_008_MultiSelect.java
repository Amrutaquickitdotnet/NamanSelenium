package com.examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_008_MultiSelect {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		launchbrowser();

		multiSelect();
	}

	public static void launchbrowser() {
		driver = new ChromeDriver();

		driver.get("C://Users//Admin//OneDrive/Desktop//dropdown.html");
		driver.manage().window().maximize();

	}

	public static void multiSelect() {

		WebElement carList = driver.findElement(By.id("cars"));

		Select s = new Select(carList);
		s.selectByValue("opel");
		s.selectByVisibleText("Audi");
		s.selectByIndex(0);

		s.deselectByValue("opel");

		// Print all the list of items which are selected

		List<WebElement> selectedItems = s.getAllSelectedOptions();
		System.out.println("Selected item count" + selectedItems.size());
		for (WebElement itemsSelected : selectedItems) {
			System.out.println(itemsSelected.getText());
		}

	}

}
