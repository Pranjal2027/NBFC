package com.xuriti.api_NBFC_Post;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_14_NBFC_IFSC_Post extends Base_Class
{
   @BeforeClass
     public void setup()
 {
	 super.performLogin();
 }
   @Test
   public void test_1_IFSC_blank()
   {
	   JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "BNH@bajajfinserv.in");
		 request.put("nbfc_mobile", "8421943886");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "544489634102");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "");
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
   public void test_2_IFSC_all_number()
   {
	   JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "gt@bajajfinserv.in");
		 request.put("nbfc_mobile", "8421943836");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54789600234102");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "09870013280");
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
   public void test_3_IFSC_only_first_letter_small()
   {
   JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
	
	 request.put("nbfc_name", "Bajaj Finance Limited");
	 request.put("nbfc_email", "llllooo@bajajfinserv.in");
	 request.put("nbfc_mobile", "8771943536");
	 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
	 request.put("nbfc_district", "Pune");
	 request.put("nbfc_state", "MAHARASHTRA,MH");
	 request.put("nbfc_pincode", "411045");
	 request.put("nbfc_interest", "12");
	 request.put("nbfc_bankname", "SBI");
	 request.put("nbfc_branchname", "Bavdhan");
	 request.put("nbfc_accountnumber", "547814589634102");
	 request.put("nbfc_accountholder", "Varsha");
	 request.put("nbfc_ifsc_code", "sbin0013280");
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
   public void test_4_IFSC_less_11()
   {
	   JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "jjjj@bajajfinserv.in");
		 request.put("nbfc_mobile", "8421947536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54789634147602");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN00180");
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
   public void test_5_IFSC_more_11()
   {
	   JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "mnj@bajajfinserv.in");
		 request.put("nbfc_mobile", "8425743536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54781019634102");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN00132800");
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
