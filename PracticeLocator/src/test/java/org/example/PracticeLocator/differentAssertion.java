package org.example.PracticeLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class differentAssertion extends DriverSetup{
	@Test
	public void handleAssertion() throws InterruptedException{
//		Assert.assertTrue(true);
		System.out.println("hello");
		Assert.assertTrue(true);
		System.out.println("world");
	}

}
