package me.sagard.test.maventest;

import org.testng.annotations.*;

public class BaseClass {
	
	@BeforeSuite
	public static void suiteSetup() {
		System.out.println("Setting up the suite");
	}
	
	@AfterSuite
	public static void suiteTeardown() {
		System.out.println("Test Suite completetd");
	}
	
	@BeforeTest
	public static void testSetup() {
		System.out.println("Started a new Testcase.....");
	}
	
	@AfterTest
	public static void testTeardown() {
		System.out.println("Tested done for a testcase");
	}
	
}
