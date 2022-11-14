package com.xuriti.api_create_plan_get;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_001_Get_Credit_Plan extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
	@Test
	public void test1_get_credit_paln_get()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "entity/62a8548c21d5976aea2f1787/credit-plans").
		   then().
		   log().all().
		    statusCode(200);
	}
}
