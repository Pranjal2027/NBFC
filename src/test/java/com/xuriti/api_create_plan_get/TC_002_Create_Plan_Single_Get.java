package com.xuriti.api_create_plan_get;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_002_Create_Plan_Single_Get extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void test1_get_single_plan_create()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "entity/62a8548c21d5976aea2f1787/credit-plans/62b9990cf2ddc144cdf56802").
		   then().
		   log().all().
		    statusCode(200);
	}
}


