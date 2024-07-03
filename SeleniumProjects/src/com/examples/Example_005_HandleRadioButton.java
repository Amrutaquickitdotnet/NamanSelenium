package com.examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_005_HandleRadioButton {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {

//		launchbrowser();
//		radioSelection();

		validationRuleSelected();
	}

	public static void launchbrowser() {
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

	}

	public static void radioSelection() throws Exception {

		WebElement createNewAccount = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		createNewAccount.click();

		// Explicit wait => Thread.sleep(5000);

		// implicit Wait =>

		Thread.sleep(2000);

		WebElement radioSelection = driver.findElement(By.xpath("//input[@value='-1']"));

		radioSelection.click();

	}

	public static void validationRuleSelected() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);

		
//		boolean selectState = regularButton.isSelected();
//		System.out.println(selectState);
		
		            
		              driver.manage().window().maximize();
		              
		              WebElement regularButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		              
//		              WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[@id='top-banner']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]/input[1]"))).click();
//		      		
		              
                      JavascriptExecutor executor =      (JavascriptExecutor)driver;  
                      
                      executor.executeScript("arguments[0].click()", regularButton);
                 	  
                      boolean isDisplayed =		regularButton.isDisplayed();
                             System.out.println(isDisplayed);



	}
}
