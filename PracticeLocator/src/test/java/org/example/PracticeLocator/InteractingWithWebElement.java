package org.example.PracticeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElement extends DriverSetup{
	@Test
	public void TestWebElement() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement textBoxElement = driver.findElement(By.cssSelector("#autocomplete"));
		String tagName = textBoxElement.getTagName();
		System.out.println(tagName);
		System.out.println(textBoxElement.getAttribute("placeholder"));
		WebElement checkbox = driver.findElement(By.cssSelector("#checkBoxOption1"));
		System.out.println("check box = "+ checkbox.isSelected());
		checkbox.click();
		Thread.sleep(3000);
		System.out.println("check box = "+ checkbox.isSelected());
		//Thread.sleep(3000);
	}
	@Test
	public void nameCheck() throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#name")).sendKeys("Boss is coming");
		Thread.sleep(3000);
		
	}
	@Test
	public void navigateTesting() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
}
