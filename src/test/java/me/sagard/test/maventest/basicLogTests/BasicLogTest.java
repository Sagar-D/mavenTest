package me.sagard.test.maventest.basicLogTests;

import org.testng.Assert;

import org.testng.annotations.Test;
import me.sagard.test.maventest.BaseClass;

public class BasicLogTest extends BaseClass{
	
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
