package org.example.PracticeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class copyPaste extends DriverSetup{
	@Test
	public void testCopyPaste() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Hello");
		//pressing ctrl+a to select 
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a").keyUp(Keys.CONTROL);
		actions.build().perform();
		Thread.sleep(2000);
		
		//pressing ctrl+c to select 
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("c").keyUp(Keys.CONTROL);
		actions.build().perform();
		Thread.sleep(2000);
		
		WebElement pastElement = driver.findElement(By.xpath("//input[@id='name']"));
		pastElement.sendKeys(Keys.CONTROL, "v");
		Thread.sleep(2000);
		
//		actions.scrollByAmount(100, 800).build().perform();
		actions.scrollToElement(driver.findElement(By.id("mousehover"))).build().perform();//scroling to a web element 
		Thread.sleep(5000);
	}
}
