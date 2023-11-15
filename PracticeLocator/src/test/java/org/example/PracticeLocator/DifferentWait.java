package org.example.PracticeLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DifferentWait extends DriverSetup{
	@Test
	public void testWait() throws InterruptedException{
		driver.get("https://qavbox.github.io/demo/alerts/");
		driver.findElement(By.xpath("//input[@id='delayalert']")).click();
//		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
	}

}
