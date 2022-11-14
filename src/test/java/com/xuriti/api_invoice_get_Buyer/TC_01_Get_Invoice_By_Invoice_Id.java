package com.xuriti.api_invoice_get_Buyer;

import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_01_Get_Invoice_By_Invoice_Id extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void get_all_invoice()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("invoiceID", "62a86217eddc7963df7389ac"); //invoice id 
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/get-invoice").  
		   then().log().all().
		    statusCode(200);  
		  
	}
}
