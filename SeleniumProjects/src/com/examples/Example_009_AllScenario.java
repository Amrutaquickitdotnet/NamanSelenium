package com.examples;

import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_009_AllScenario {

	static WebDriver driver;

	public static void main(String[] args) {
		launchbrowser();
		// displayingElement();
		// usingisEnabledMethod();
		//verifyFontSize();
		//verifyAttribute();
		getHeaderTitleText();
	}

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/inputs.html");
	}
	//Actions class
	// drag and drop method
	//dragdrop(dragelement , dropElement);

	public static void displayingElement() {
		// isDisplayed
		// Get boolean value for is element display

		boolean isEmailVisible = driver.findElement(By.name("email_input")).isDisplayed();
		Assume.assumeTrue(isEmailVisible);

	}

	// Asserting is for verification

	// if you want to skip test case or throws your own exception then you can go
	// for Assume.AssumeTrue

	public static void usingisEnabledMethod() {

		boolean isButtonEnabled = driver.findElement(By.name("button_input")).isEnabled();

		Assert.assertEquals(isButtonEnabled, true);

	}

	public static void verifyFontSize() {
		// Retrieves the computed style property 'font-size' of field
		String cssValue = driver.findElement(By.name("color_input")).getCssValue("font-size");
		Assert.assertEquals(cssValue, "11.3333px");

	}
	
	public static void verifyAttribute() {
		
		WebElement inputemail = driver.findElement(By.name("email_input"));
        String verifyemailField =	inputemail.getAttribute("value");// Actual Result
        String expectedEmailField ="admin@localhost";
        Assert.assertEquals(verifyemailField, expectedEmailField);

	}
	
	public static void getHeaderTitleText() {
	     
        //GetText
       // Retrieves the text of the element
        String text = driver.findElement(By.tagName("h1")).getText();
       Assert.assertEquals(text, "Testing InputsTask");
	}
}
