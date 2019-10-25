package me.sagard.test.maventest.restAssuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import me.sagard.test.maventest.BaseClass;

public class SubscriptionMembersTest extends BaseClass{
	
	@Test(groups= {"api"})
	public static void post_add_member() {
		
		String p = "{\n" + 
				"  \"subscription_id\": \"5d188082-e4e1-4de5-bdb6-75f5137058b3\",\n" + 
				"  \"name\": \"Test\",\n" + 
				"  \"relation\": \"son\",\n" + 
				"  \"age\": 24,\n" + 
				"  \"gender\" : \"male\",\n" + 
				"  \"email\": \"subscription.practo+testapi@gmail.com\",\n" + 
				"  \"adult\": false\n" + 
				"}";
				 
		RequestSpecification request = RestAssured.given().log().all();
		
		request.header("X-SUBSCRIPTION-AUTH-TOKEN","3ee68fb6dac46e0b632ee42f173fb7179e2d8ab60d978ccd2b8a7d8775a5e7be");
		request.header("Content-Type","application/json");
		request.body(p);
		
		Response res = request.post("/api/v1/members");
		System.out.print(res.body().asString());

		Assert.assertEquals(res.statusCode(),200);
		
		JsonPath resBody = res.body().jsonPath();
		Assert.assertNotNull(resBody.get("id"));
		Assert.assertNotNull(resBody.get("subscription_id"));
		Assert.assertNotNull(resBody.get("uhid"));
		Assert.assertNotNull(resBody.get("primary"));
		Assert.assertNotNull(resBody.get("name"));
		Assert.assertNotNull(resBody.get("relation"));
		Assert.assertNotNull(resBody.get("adult"));
		Assert.assertNotNull(resBody.get("created_at"));
		Assert.assertNotNull(resBody.get("modified_at"));
		Assert.assertNotNull(resBody.get("created_by"));
		
	}
	
}
