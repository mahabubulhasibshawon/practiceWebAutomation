package org.example.PracticeLocator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class AlertHandling extends DriverSetup{
	@Test
	public void testAlert() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), "I am a JS Alert"); 
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		String alertText = driver.findElement(By.id("result")).getText();
		Assert.assertEquals(alertText, "You successfully clicked an alert");
	}
}
