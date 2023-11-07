package org.example.PracticeLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverSetup {
	public WebDriver driver;
	@BeforeTest
	public WebDriver setDriver() {
		driver = new ChromeDriver();
		return driver;
	}
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
}
