package com.xuriti.api_NBFC_Post;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_10_NBFC_Bank_Name extends Base_Class 
{
	@BeforeClass
    public void setup()
    {
    	super.performLogin();
    }
    
	@Test
    public void test_1_nbfc_bank_name_blank()
    {
    	JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "LOP@bajajfinserv.in");
		 request.put("nbfc_mobile", "8021943536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "34789634102");
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
	 public void test_2_nbfc_bank_name_numbers()
	 {
		 JSONObject request=new JSONObject();
			String token =TokenProvider.getInstance().getToken();
			
			 request.put("nbfc_name", "Bajaj Finance Limited");
			 request.put("nbfc_email", "OP@bajajfinserv.in");
			 request.put("nbfc_mobile", "8421944436");
			 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
			 request.put("nbfc_district", "Pune");
			 request.put("nbfc_state", "MAHARASHTRA,MH");
			 request.put("nbfc_pincode", "411047");
			 request.put("nbfc_interest", "12");
			 request.put("nbfc_bankname", "45789");
			 request.put("nbfc_branchname", "Bavdhan");
			 request.put("nbfc_accountnumber", "54789644102");
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
	public void test_3_nbfc_bank_name_special_char()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "AS@bajajfinserv.in");
		 request.put("nbfc_mobile", "8521943536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "&%$");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54788534102");
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
	public void test_4_nbfc_bank_name_SCNL()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "opps@bajajfinserv.in");
		 request.put("nbfc_mobile", "8421943836");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "411045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "JHuy75&%");
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
}

