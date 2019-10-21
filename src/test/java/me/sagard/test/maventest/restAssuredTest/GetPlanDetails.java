package me.sagard.test.maventest.restAssuredTest;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import me.sagard.test.maventest.BaseClass;

public class GetPlanDetails extends BaseClass{
	
	@Test(groups= {"api"})
	public static void simple_get_test() {
		Response response = get("https://subscriptions-latest.practo.com/status");
		System.out.println(response.asString());
		Assert.assertEquals(200, response.getStatusCode());

	}
	
}
