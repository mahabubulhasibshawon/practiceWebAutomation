package org.example.PracticeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.internal.invokers.AbstractParallelWorker.Arguments;

public class handleIframe extends DriverSetup{
	@Test
	public void testiframeElements() throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement mousehoverButton = driver.findElement(By.xpath("//button[@id='mousehover']"));
		js.executeScript("arguments[0].scrollIntoView();" , mousehoverButton);
		
		driver.switchTo().frame(0);
		WebElement courseButton = driver.findElement(By.linkText("Courses"));
		System.out.println(courseButton.getText());
		Thread.sleep(3000);
		
	}
}
