package me.sagard.test.maventest.basicLogTests;

import org.testng.Assert;

import org.testng.annotations.Test;

public class BasicLogTest {
	
	@Test(groups = {"logTest"})
	public static void testLetsPrintHello() {
		System.out.println("HELLo");
	}
	
	@Test(groups = {"logTest", "failTest"})
	public static void failATest() {
		Assert.assertTrue(false);
	}
	
	@Test(groups = {"logTest", "passTest"})
	public static void passATest() {
		Assert.assertTrue(true);
	}
	
}
