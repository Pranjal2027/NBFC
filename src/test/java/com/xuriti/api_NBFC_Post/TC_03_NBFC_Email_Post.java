package com.xuriti.api_NBFC_Post;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_03_NBFC_Email_Post extends Base_Class
{
	@BeforeClass
   public void setup()
   {
	   super.performLogin();
   }
   
	@Test   
	public void test_1_nbfc_email_blank()
   {
	   JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "");
		 request.put("nbfc_mobile", "8427843536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54779634102");
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
	public  void test_2_nbfc_email_exting()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "grievanceredressalteam@bajajfinserv.in");
		 request.put("nbfc_mobile", "8451943536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "57789634102");
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
	public void test_3_nbfc_email_missing_symbol()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "grievanceredressalteambajajfinserv.in");
		 request.put("nbfc_mobile", "8421944436");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "422045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54789652102");
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
	public void test_4_nbfc_email_special_char()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "#@$*&!%@bajajfinserv.in");
		 request.put("nbfc_mobile", "7821943536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "57789634102");
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
	public void test_5_nbfc_email_number()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "8797654@bajajfinserv.in");
		 request.put("nbfc_mobile", "8421773536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "444045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54789634442");
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
	public void test_6_nbfc_email_double_symbol()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "grievancered@ressalteam@bajajfinserv.in");
		 request.put("nbfc_mobile", "8427743536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54788634102");
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
	public void test_7_nbfc_email_double_dot()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "grievanceredressalteam@bajajfinserv..com");
		 request.put("nbfc_mobile", "8427743536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54559634102");
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
	public void test_8_nbfc_email_without_dot_com()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "grievanceredressalteam@bajajfinserv");
		 request.put("nbfc_mobile", "8421943886");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54789774102");
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
