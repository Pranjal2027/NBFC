package com.xuriti.api_admin_login;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TC_1_Normal_Sign_In extends Base_Class
{
	public void setup() {
		super.performLogin();
		
	}
	
      @Test
	  public void TC_1_Sign_In()
	  {
		  JSONObject request=new JSONObject();
		   
		   request.put("email","krishna.kshirsagar@xuriti.com");
		   request.put("password","Xuriti#10");
		   
		   given().
		   contentType("application/json").
		      body(request.toJSONString()).
		   when().
		      post(CONTEXTPATH + "auth/user-login").
		   then().
		   log().all().
		    statusCode(200);
		   System.out.println("Login Successfully");
		}
	  }

