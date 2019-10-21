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
	
	@BeforeMethod
	public static void testSetup() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public static void testTeardown() {
		System.out.println("After Method");
	}
	
}
