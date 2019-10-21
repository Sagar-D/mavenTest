package me.sagard.test.maventest;

import org.testng.annotations.*;

public class BaseClass {
	
	@BeforeSuite
	public static void suiteSetup() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public static void suiteTeardown() {
		System.out.println("After Suite");
	}
	
	@BeforeTest
	public static void firstTestOfTheClassSetup() {
		System.out.println("Before Test");
	}
	
	@AfterTest
	public static void lastTestOfTheClassTeardown() {
		System.out.println("After Test");
	}
	
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClassMethod() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public static void testSetup() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public static void testTeardown() {
		System.out.println("After Method");
	}
	
	@BeforeGroups
	public static void beforeGroupMethod() {
		System.out.println("Before Group");
	}
	
	@AfterGroups
	public static void afterGroupMethod() {
		System.out.println("After Group");
	}
	
}
