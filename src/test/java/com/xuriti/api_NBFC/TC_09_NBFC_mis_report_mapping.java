package com.xuriti.api_NBFC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.Base_Class;
import com.xuriti.api_admin_login.TokenProvider;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_09_NBFC_mis_report_mapping extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void nbfc_post()
	{
    	
		JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
		 request.put("days","10");
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "nbfcs/nbfc_mis_mapping?days=10").
		   then().
		   log().all().
		    statusCode(200);
    	
        }
    	
    	}
	 	


