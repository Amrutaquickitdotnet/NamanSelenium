package com.examples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example_002_TakeScreenshot {

	public static void main(String[] args) {

		launchbrowser();
		TakeScreenshotevidence();
	}

	static WebDriver driver;

	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();

	}

	public static void TakeScreenshotevidence() {

		// manaual Test Cases

		// 1. ctrl+printscreen
		// 2. Save dedicated scrreenshot to the folder , creation of folder abc.jpg
		// TakeScreenshot

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//to get screenshot 
			
		File destFile = new File("E:\\Naman\\captureimage\\abc.jpg");
		
		try {
			FileHandler.copy(srcFile, destFile);  //move  image file to new destination
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
		
		
		

	}

}
