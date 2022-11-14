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

public class TC_04_NBFC_edit_by_id extends Base_Class
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
		request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "pgawade2027@gmail.com");
		 request.put("nbfc_mobile", "9874563210");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("payout_discount", "6");
		 request.put("first_name", "Pranjal");
		 request.put("last_name", "Patil");
		 request.put("email", "varsha123456@gmail.com");
		 request.put("mobile_number", "8521479630");
		// request.put("nbfc_status", "Pending");
		 request.put("user_role", "nbfcUser");
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      put(CONTEXTPATH + "nbfcs/edit-nbfc/635f5ac397c1dfb63839e66b").
		   then().
		   log().all().
		    statusCode(200);
	 	}
}
