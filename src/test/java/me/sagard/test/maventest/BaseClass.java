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
	public static void firstTestOfTheClassSetup() {
		System.out.println("This is the first testcase of this class");
	}
	
	@AfterTest
	public static void lastTestOfTheClassTeardown() {
		System.out.println("Tested done for first testcase of this class");
	}
	
	@BeforeMethod
	public static void testSetup() {
		System.out.println("Starting a new test");
	}
	
	@AfterMethod
	public static void testTeardown() {
		System.out.println("completed a testcase");
	}
	
}
