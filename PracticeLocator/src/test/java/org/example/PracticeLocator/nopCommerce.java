package org.example.PracticeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class nopCommerce extends DriverSetup{
	@Test
	public void testNopCommerce() throws InterruptedException {
		driver.get("https://demo.nopcommerce.com/");
		WebElement searchboxElement = driver.findElement(By.xpath("//form/input"));
		searchboxElement.sendKeys("Apple MacBook Pro");
		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("form > input")).clear();
//		Thread.sleep(5000);
		String search_btn_text = driver.findElement(By.cssSelector("button[type='submit'][class='button-1 search-box-button']")).getText();
		System.out.println(search_btn_text);
		String cart_btn_textString = driver.findElement(By.xpath("//button[@type='button'and@class='button-2 product-box-add-to-cart-button']")).getText();
		System.out.println(cart_btn_textString);
		driver.findElement(By.xpath("//button[@type='submit'and@class='button-1 search-box-button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h2/a[starts-with(@href,  '/apple-macbook-pro')]")).click();
		driver.findElement(By.xpath("//*[contains (@id, 'cart-button-4')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("shopping cart")).click();
		Thread.sleep(3000);
		
	}
}
