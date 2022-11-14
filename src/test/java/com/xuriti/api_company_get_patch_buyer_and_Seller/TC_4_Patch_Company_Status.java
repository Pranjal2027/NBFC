package com.xuriti.api_company_get_patch_buyer_and_Seller;

import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TC_4_Patch_Company_Status extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void company_status_update()
	{
		JSONObject request=new JSONObject();
		String token= TokenProvider.getInstance().getToken();
		
		request.put("status", "Approved");
		request.put("msg", "Your Company is Approved");
				
		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		   patch(CONTEXTPATH + "entity/status-entity/62a8548c21d5976aea2f1787").  //company id
		   then().
		   log().all().
		    statusCode(200);
		   System.out.println("Company updated succesfully");
		 
	}
}
