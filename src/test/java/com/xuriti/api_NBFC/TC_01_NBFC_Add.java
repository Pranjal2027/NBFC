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

public class TC_01_NBFC_Add extends Base_Class
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
		 request.put("nbfc_email", "pgavde20@gmail.com");
		 request.put("nbfc_mobile", "8080630830");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		// request.put("nbfc_pincode", "411045");
		// request.put("nbfc_interest", "12");
		 request.put("payout_discount", "5");
		 //request.put("nbfc_bankname", "SBI");
		// request.put("nbfc_branchname", "Bavdhan");
		// request.put("nbfc_accountnumber", "54789634102");
		// request.put("nbfc_accountholder", "Varsha");
		// request.put("nbfc_ifsc_code", "SBIN0013280");
		 request.put("first_name", "Varsha");
		 request.put("last_name", "Patil");
		 request.put("email", "varsha01123456@gmail.com");
		 request.put("mobile_number", "8080630830");
		// request.put("nbfc_status", "Pending");
		 request.put("user_role", "nbfcUser");
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/add-nbfc").
		   then().
		   log().all().
		    statusCode(200);
	 	}
// @Test
//    
//    public void nbfc_post_all_fields()
//	{
//		JSONObject request=new JSONObject();
//		String token =TokenProvider.getInstance().getToken();
//		
//		 request.put("nbfc_name", "Tata Motors");
//		 request.put("nbfc_email", "Pranjal.gawad@tech-trail.com");
//		 request.put("nbfc_mobile", "8888888123");
//		 request.put("nbfc_address", "KSB chowk ,pimpri");
//		 request.put("nbfc_district", "Pune");
//		 request.put("nbfc_state", "MAHARASHTRA,MH");
//		 request.put("nbfc_pincode", "411045");
//		 request.put("nbfc_interest", "12");
//		 request.put("payout_discount", "5");
//		 request.put("nbfc_bankname", "SBI");
//		 request.put("nbfc_branchname", "Bavdhan");
//		 request.put("nbfc_accountnumber", "54789634102");
//		 request.put("nbfc_accountholder", "Varsha");
//		 request.put("nbfc_ifsc_code", "SBIN0013280");
//		 request.put("first_name", "Varsha");
//		 request.put("last_name", "Patil");
//		 request.put("email", "pgawade@@gmail.com");
//		 request.put("mobile_number", "9999994567");
//		 request.put("nbfc_status", "Active");
//		 request.put("user_role", "nbfcUser");
// 		 given().
//		   contentType("application/json").
//		      body(request.toJSONString()).
//		      header("authorization"," Bearer " + token).
//		   when().
//		      post(CONTEXTPATH + "nbfcs/add-nbfc").
//		   then().
//		   log().all().
//		    statusCode(200);
//}

}

