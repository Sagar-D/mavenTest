package me.sagard.test.maventest.basicLogTests;

import org.testng.Assert;

import org.testng.annotations.Test;
import me.sagard.test.maventest.BaseClass;

public class BasicLogTest extends BaseClass{
	
	@Test(groups = {"logTest"})
	public static void testLetsPrintHello() {
		System.out.println("Log Test 1");
	}
	
	@Test(groups = {"logTest", "failTest"})
	public static void failATest() {
		System.out.println("Log Test 2");
		Assert.assertTrue(false);
	}
	
	@Test(groups = {"logTest", "passTest"})
	public static void passATest() {
		System.out.println("Log Test 3");
		Assert.assertTrue(true);
	}
	
}
