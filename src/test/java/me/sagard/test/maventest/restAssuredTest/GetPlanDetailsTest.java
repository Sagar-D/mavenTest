package me.sagard.test.maventest.restAssuredTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import me.sagard.test.maventest.BaseClass;

public class GetPlanDetailsTest extends BaseClass{
	
	
	@Test(groups= {"api"})
	public static void simple_get_test() {
		
		Response response = RestAssured.get("/status");
		System.out.println(response.asString());
		Assert.assertEquals(200, response.getStatusCode());
	}
	
	@Test(groups= {"api"})
	public static void get_all_plan_details() {
		
		Response response = RestAssured.get("/plans");
		Assert.assertEquals(200, response.statusCode());
		System.out.println(response.asString());
		
	}

	
}
