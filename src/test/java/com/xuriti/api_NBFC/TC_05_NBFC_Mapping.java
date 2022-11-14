package com.xuriti.api_NBFC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;

import java.util.Arrays;
import java.util.LinkedHashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.Base_Class;
import com.xuriti.api_admin_login.TokenProvider;

public class TC_05_NBFC_Mapping extends Base_Class
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
		request.put("companies", Arrays.asList(new LinkedHashMap<String, Object>(){
		{
	        put("buyer_id", "635a43c00f3f22b2a90ebcd0");
	        put("seller_id", "62e1317df8f62c083a8bf287");
	    }
			
				}));
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/add-buyer/635b798397c1dfb63839dcb1/635b62926b206c7eb71a1274").
		   then().
		   log().all().
		    statusCode(200);
	 	}
    @Test
    public void nbfc_post_1_()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("companies", Arrays.asList(new LinkedHashMap<String, Object>(){
		{
	        
	        put("seller_id", "62e1317df8f62c083a8bf287");
	    }
			
				}));
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/add-buyer/635b798397c1dfb63839dcb1/635b62926b206c7eb71a1274").
		   then().
		   log().all().
		    statusCode(200);
	 	}
    @Test
    public void nbfc_post_invalid_Buyer_ID()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("companies", Arrays.asList(new LinkedHashMap<String, Object>(){
		{
	        put("buyer_id", "635a43c00f9f22b2a90ebcd0");
	        put("seller_id", "62e1317df8f62c083b8bf287");
	    }
			
				}));
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/add-buyer/635b798397c1dfb63839dcb1/635b62926b206c7eb71a1274").
		   then().
		   log().all().
		    statusCode(200);
	 	}
    @Test
    public void nbfc_post_Blank_url()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("companies", Arrays.asList(new LinkedHashMap<String, Object>(){
		{
	        put("buyer_id", "635a43c00f3f22b2a90ebcd0");
	        put("seller_id", "62e1317df8f62c083a8bf287");
	    }
			
				}));
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/add-buyer/").
		   then().
		   log().all().
		    statusCode(200);
	 	}
	}

