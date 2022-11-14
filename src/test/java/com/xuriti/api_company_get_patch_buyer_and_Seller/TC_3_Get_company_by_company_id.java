package com.xuriti.api_company_get_patch_buyer_and_Seller;

import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TC_3_Get_company_by_company_id extends Base_Class 
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}

    @Test
   public void buyer_get_company_by_gst_number()
   {
	   
	   JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "entity/entity/62a8548c21d5976aea2f1787").    //Company id
		   then().log().all().
		    statusCode(200);
		  
   }
}
