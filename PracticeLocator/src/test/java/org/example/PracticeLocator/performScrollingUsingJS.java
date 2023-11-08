package org.example.PracticeLocator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.testng.annotations.Test;

public class performScrollingUsingJS extends DriverSetup{
	@Test
	public void testJSexecute() throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		top to bottom scrolling usign js
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(5000);
//		bottom to top scrolling 
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
		Thread.sleep(5000);
	}
}
