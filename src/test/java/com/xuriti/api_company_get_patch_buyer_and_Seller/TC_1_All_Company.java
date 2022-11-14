package com.xuriti.api_company_get_patch_buyer_and_Seller;

import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_1_All_Company extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
	@Test
    public void get_all_Company()
    {

		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
    	
    	given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("Authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "entity/entities").
		   then().log().all().
		    statusCode(200);
		  
		 
    }
}
