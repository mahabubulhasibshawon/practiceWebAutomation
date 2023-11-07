package org.example.PracticeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckingLocator extends DriverSetup{
	@Test
	public void loadPage() throws InterruptedException {
//		locating evaly logo
		driver.get("https://www.daraz.com.bd/");
		WebElement searchElement = driver.findElement(By.id("q"));
//		logo.click();
		searchElement.sendKeys("mechanic watch");
		WebElement search = driver.findElement(By.className("search-box__button--1oH7"));
		search.click();
		WebElement item = driver.findElement(By.linkText("https://www.daraz.com.bd/products/skmei-9222-i312148251-s1401297071.html?spm=a2a0e.searchlist.sku.26.79f62386JhV5Wd&search=1"));
		item.click();
//		WebElement item = driver.findElement(By.xpath("id-a-link"));
//		item.click();
		Thread.sleep(10000);
	}
}
