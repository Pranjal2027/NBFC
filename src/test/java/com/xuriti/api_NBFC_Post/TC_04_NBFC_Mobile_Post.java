package com.xuriti.api_NBFC_Post;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_04_NBFC_Mobile_Post extends Base_Class
{
	@BeforeClass
   public void setup()
   {
	   super.performLogin();
   }
	
	@Test
	public void test_1_nbfc_mobile_blank()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "uuu@bajajfinserv.in");
		 request.put("nbfc_mobile", "");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "477045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54119634102");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN0013280");
		 request.put("nbfc_status", "Pending");
		 
		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/").
		   then().
		   log().all().
		    statusCode(200);
	}
	
	@Test
	public void test_2_nbfc_mobile_letter()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "kkk@bajajfinserv.in");
		 request.put("nbfc_mobile", "fgtresyhfh");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54789634102");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN0013280");
		 request.put("nbfc_status", "Pending");
		 
		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/").
		   then().
		   log().all().
		    statusCode(200);
	}
	
	@Test
	public void test_3_nbfc_mobile_less_10()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "hhh@bajajfinserv.in");
		 request.put("nbfc_mobile", "8421536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "58889634102");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN0013280");
		 request.put("nbfc_status", "Pending");
		 
		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/").
		   then().
		   log().all().
		    statusCode(200);
	}
	
	@Test
	public void test_4_nbfc_mobile_more_10()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "llll@bajajfinserv.in");
		 request.put("nbfc_mobile", "8421943536111");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "400045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54449634102");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN0013280");
		 request.put("nbfc_status", "Pending");
		 		 
		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/").
		   then().
		   log().all().
		    statusCode(200);
	}
	
	@Test
	public void test_5_nbfc_mobile_special_char()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "kk@bajajfinserv.in");
		 request.put("nbfc_mobile", "%$#&*");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411022");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54789777102");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN0013280");
		 request.put("nbfc_status", "Pending");
		 
		 
		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/").
		   then().
		   log().all().
		    statusCode(200);
	}
	
	@Test
	public void test_6_nbfc_mobile_SCLN()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "lnnn@bajajfinserv.in");
		 request.put("nbfc_mobile", "Ytbg543$#");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "422045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54787734102");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN0013280");
		 request.put("nbfc_status", "Pending");
		 
		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/").
		   then().
		   log().all().
		    statusCode(200);
	}
}
