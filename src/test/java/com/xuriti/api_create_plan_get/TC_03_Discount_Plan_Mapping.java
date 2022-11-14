package com.xuriti.api_create_plan_get;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_03_Discount_Plan_Mapping  extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
	@Test
	public void test1_discount_mapping_post()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
//		request.put("buyers", "62a851383acddadb4f20c6fc");
		request.put("credit_planid", "62baee9109c6a1c428e16461");
		request.put("buyers", "62a851383acddadb4f20c6fc");
		           
		           
		given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "entity/62a8548c21d5976aea2f1787/credit-plans-map").
		   then().
		   log().all().
		    statusCode(200);
	}
}
