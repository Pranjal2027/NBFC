package com.xuriti.api_NBFC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static io.restassured.RestAssured.given;

import java.io.File;

import static org.testng.Assert.assertTrue;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.Base_Class;
import com.xuriti.api_admin_login.TokenProvider;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_10_NBFC_reconcellation extends Base_Class
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
		// request.put("buyer_id", "635a43c00f3f22b2a90ebcd0");
		//		 request.put("seller_id", "62e1317df8f62c083a8bf287");
		 
// 		 given().
//		   contentType("application/json").
//		      body(request.toJSONString()).
//		      header("authorization"," Bearer " + token).
//		   when().
//		      post(CONTEXTPATH + "nbfcs/nbfc-reconcellation/635f5ac397c1dfb63839e66b").
//		   then().
//		   log().all().
//		    statusCode(200);
 		File testUploadFile = new File ("/home/admin/PAN_Card.jpg");
		RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
		Response response = given()
				.multiPart(testUploadFile)
				.when().
				get("nbfc-reconcellation/635f5ac397c1dfb63839e66b");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
	 	}

}
