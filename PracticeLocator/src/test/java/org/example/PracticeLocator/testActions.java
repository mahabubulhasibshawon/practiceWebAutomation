package org.example.PracticeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testActions extends DriverSetup{
	@Test
	 public void testHover() throws InterruptedException{
		driver.get("https://demoqa.com/menu");
		WebElement mainItem = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		Actions actions = new Actions(driver);
		
		actions.click(mainItem).build().perform();
		Thread.sleep(5000);
		actions.click(driver.findElement(By.xpath("//a[normalize-space()='SUB SUB LIST »']"))).build().perform();
		Thread.sleep(5000);
		
	}
	@Test
	public void testMulti() throws InterruptedException{
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Actions actions = new Actions(driver);
		

		driver.switchTo().frame("iframeResult");
		Select select = new Select(driver.findElement(By.xpath("//select[@id='cars']")));
		actions.keyDown(Keys.CONTROL).click(select.getOptions().get(1)).click(select.getOptions().get(2)).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
	}
}

