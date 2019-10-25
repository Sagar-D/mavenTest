package me.sagard.test.maventest.restAssuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SubscriptionTokenTest {
	

	@Test(groups= {"api"})
	public static void post_generate_subscription_token() {
		
		Response response = RestAssured.given().header("X-PROFILE-TOKEN", "bf768d6c-3327-4ae1-ad2f-617166d8dd57").post("/api/v1/tokens");
		Assert.assertEquals(200, response.statusCode());
		
		JsonPath res_body = response.body().jsonPath();
		
		Assert.assertEquals("subscription.practo+testchat@gmail.com", res_body.get("email"));
		Assert.assertNotNull(res_body.get("token_id"));
		Assert.assertNotNull(res_body.get("email"));
		Assert.assertNotNull(res_body.get("auth_token"));
		Assert.assertNotNull(res_body.get("account_id"));

	}
	
	
	
}
