package com.xuriti.api_NBFC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.Base_Class;
import com.xuriti.api_admin_login.TokenProvider;

public class TC_06_NBFC_unmap extends Base_Class
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
		 request.put("buyer_id", "635a43e10f3f22b2a90ebd21");
				 request.put("seller_id", "635a43c00f3f22b2a90ebcd0");
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/unmap-nbfc/636cc309800ebe2456aae265").
		   then().
		   log().all().
		    statusCode(200);
	 	}

}
