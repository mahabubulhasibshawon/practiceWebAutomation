package org.example.PracticeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectOptionTest extends DriverSetup{
	@Test
	public void selectTestOne() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropDown.click();
		Select select = new Select(dropDown);
		select.selectByVisibleText("Option2");//selecting using text from ooptions
		Thread.sleep(5000);
		
		select.selectByIndex(3);
		Thread.sleep(5000);
		select.deselectAll();
		Thread.sleep(5000);
	}
}
