package com.xuriti.api_admin_login;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Base_Class 
{
	//public static final String CONTEXTPATH="https://dev.xuriti.app/api/";
//	public static final String CONTEXTPATH="http://192.168.0.141/";
	public static final String CONTEXTPATH="https://dev.xuriti.app/adminpanel/api/";
	
	@BeforeClass
		public void setup()
		{
//		  RestAssured.basePath="CONTEXTPATH";
//			RestAssured.baseURI="http://localhost:4000/";
//			RestAssured.port=4000;
//			
		}
	 	
	   public void performLogin() {
		   if(!TokenProvider.getInstance().hasToken()) {
			   JSONObject request=new JSONObject();
//			   
		   request.put("email","krishna.kshirsagar@xuriti.com");
		   request.put("password", "Xuriti#10");
			   
    	     ValidatableResponse response = given().
				   contentType("application/json").
			      body(request.toJSONString()).
			   when().
			      post(CONTEXTPATH + "auth/user-login").
			   //then().log().all().`
			      then();
		     	response.statusCode(200);
		     	 
			   String token = accessToken(response.extract().response());
			   TokenProvider.getInstance().setToken(token);
			   
		   }
	   }

	public String accessToken (Response response) {
		// TODO Auto-generated method stub
		return response.jsonPath().getString("token");
	}

}
