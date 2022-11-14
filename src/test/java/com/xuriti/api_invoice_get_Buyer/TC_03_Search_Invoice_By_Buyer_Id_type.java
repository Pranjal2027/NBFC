package com.xuriti.api_invoice_get_Buyer;

import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_03_Search_Invoice_By_Buyer_Id_type extends Base_Class
{
   @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
   @Test
	public void get_invoice_by_buyer_id()
	{
	   
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();
		
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/search-invoice/62a8548c21d5976aea2f1787/buyer").  //company id  
		   then().log().all().
		    statusCode(200); 
	}
}
