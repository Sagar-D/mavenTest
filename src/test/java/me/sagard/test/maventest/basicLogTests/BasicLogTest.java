package me.sagard.test.maventest.basicLogTests;

import me.sagard.test.maventest.BaseClass;
import org.testng.annotations.*;

public class BasicLogTest extends BaseClass {
	
	@Test(groups = {"logTest"})
	public static void testLetsPrintHello() {
		System.out.println("HELLo");
	}
	
}
