package com.xuriti.api_invoice_get_Buyer;

import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_02_Invoice_Status_Update extends Base_Class
{
     @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
     @Test
	public void invoice_status_update()
	{
		JSONObject request=new JSONObject();
		String token= TokenProvider.getInstance().getToken();
		
		request.put("status", "Confirmed");
		request.put("reason", "Yes");
		request.put("invoiceID", "62a6d79014c969d48907449f");
				
		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		   patch(CONTEXTPATH + "invoice/status").
		   then().
		   log().all().
		    statusCode(200);
		   System.out.println("Invoice updated succesfully");
	}
}
