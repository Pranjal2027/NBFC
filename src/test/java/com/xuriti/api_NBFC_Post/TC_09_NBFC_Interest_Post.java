package com.xuriti.api_NBFC_Post;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_09_NBFC_Interest_Post extends Base_Class
{
	  @BeforeClass
      public void setup()
      {
    	  super.performLogin();
      }
      
	  @Test
      public void test_1_nbfc_interest_blank()
      {
    	  JSONObject request=new JSONObject();
  		String token =TokenProvider.getInstance().getToken();
  		
  		 request.put("nbfc_name", "Bajaj Finance Limited");
  		 request.put("nbfc_email", "hh@bajajfinserv.in");
  		 request.put("nbfc_mobile", "8421947736");
  		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
  		 request.put("nbfc_district", "Pune");
  		 request.put("nbfc_state", "MAHARASHTRA,MH");
  		 request.put("nbfc_pincode", "411045");
  		 request.put("nbfc_interest", "");
  		 request.put("nbfc_bankname", "SBI");
  		 request.put("nbfc_branchname", "Bavdhan");
  		 request.put("nbfc_accountnumber", "54789677102");
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
	 public void test_2_interest_less_2_digit()
	 {
		 JSONObject request=new JSONObject();
			String token =TokenProvider.getInstance().getToken();
			
			 request.put("nbfc_name", "Bajaj Finance Limited");
			 request.put("nbfc_email", "tt@bajajfinserv.in");
			 request.put("nbfc_mobile", "8421803536");
			 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
			 request.put("nbfc_district", "Pune");
			 request.put("nbfc_state", "MAHARASHTRA,MH");
			 request.put("nbfc_pincode", "411045");
			 request.put("nbfc_interest", "1");
			 request.put("nbfc_bankname", "SBI");
			 request.put("nbfc_branchname", "Bavdhan");
			 request.put("nbfc_accountnumber", "54789114102");
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
	 public void test_3_interest_more_2_digit()
	 {
		 JSONObject request=new JSONObject();
			String token =TokenProvider.getInstance().getToken();
			
			 request.put("nbfc_name", "Bajaj Finance Limited");
			 request.put("nbfc_email", "ii@bajajfinserv.in");
			 request.put("nbfc_mobile", "8421948936");
			 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
			 request.put("nbfc_district", "Pune");
			 request.put("nbfc_state", "MAHARASHTRA,MH");
			 request.put("nbfc_pincode", "411045");
			 request.put("nbfc_interest", "121");
			 request.put("nbfc_bankname", "SBI");
			 request.put("nbfc_branchname", "Bavdhan");
			 request.put("nbfc_accountnumber", "54789604102");
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
	 public void test_4_interest_letter()
	 {
		 JSONObject request=new JSONObject();
			String token =TokenProvider.getInstance().getToken();
			
			 request.put("nbfc_name", "Bajaj Finance Limited");
			 request.put("nbfc_email", "MM@bajajfinserv.in");
			 request.put("nbfc_mobile", "8421773536");
			 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
			 request.put("nbfc_district", "Pune");
			 request.put("nbfc_state", "MAHARASHTRA,MH");
			 request.put("nbfc_pincode", "411045");
			 request.put("nbfc_interest", "OI");
			 request.put("nbfc_bankname", "SBI");
			 request.put("nbfc_branchname", "Bavdhan");
			 request.put("nbfc_accountnumber", "58089634102");
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
	 public void test_5_interest_special_char()
	 {
		 JSONObject request=new JSONObject();
			String token =TokenProvider.getInstance().getToken();
			
			 request.put("nbfc_name", "Bajaj Finance Limited");
			 request.put("nbfc_email", "NN@bajajfinserv.in");
			 request.put("nbfc_mobile", "8421943306");
			 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
			 request.put("nbfc_district", "Pune");
			 request.put("nbfc_state", "MAHARASHTRA,MH");
			 request.put("nbfc_pincode", "411045");
			 request.put("nbfc_interest", "&%");
			 request.put("nbfc_bankname", "SBI");
			 request.put("nbfc_branchname", "Bavdhan");
			 request.put("nbfc_accountnumber", "54789104102");
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
	 public void test_6_interest_LN()
	 {
		 JSONObject request=new JSONObject();
			String token =TokenProvider.getInstance().getToken();
			
			 request.put("nbfc_name", "Bajaj Finance Limited");
			 request.put("nbfc_email", "CC@bajajfinserv.in");
			 request.put("nbfc_mobile", "8444943536");
			 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
			 request.put("nbfc_district", "Pune");
			 request.put("nbfc_state", "MAHARASHTRA,MH");
			 request.put("nbfc_pincode", "411145");
			 request.put("nbfc_interest", "K9");
			 request.put("nbfc_bankname", "SBI");
			 request.put("nbfc_branchname", "Bavdhan");
			 request.put("nbfc_accountnumber", "54789631102");
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
	 public void test_7_interest_SCN()
	 {
		 JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "oo@bajajfinserv.in");
		 request.put("nbfc_mobile", "8421948836");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "0*");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54789678102");
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
