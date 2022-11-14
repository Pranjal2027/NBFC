package com.xuriti.api_NBFC_Post;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;


public class TC_07_NBFC_State_Post extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
     @Test
    public void test_1_nbfc_state_blank()
    {
    	JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "ss@bajajfinserv.in");
		 request.put("nbfc_mobile", "8455943536");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "");
		 request.put("nbfc_pincode", "477045");
		 request.put("nbfc_interest", "12");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "54009634102");
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
     public void test_2_nbfc_state_number()
     {
    	 JSONObject request=new JSONObject();
 		String token =TokenProvider.getInstance().getToken();
 		
 		 request.put("nbfc_name", "Bajaj Finance Limited");
 		 request.put("nbfc_email", "pp@bajajfinserv.in");
 		 request.put("nbfc_mobile", "8421948936");
 		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
 		 request.put("nbfc_district", "Pune");
 		 request.put("nbfc_state", "788455");
 		 request.put("nbfc_pincode", "411045");
 		 request.put("nbfc_interest", "12");
 		 request.put("nbfc_bankname", "SBI");
 		 request.put("nbfc_branchname", "Bavdhan");
 		 request.put("nbfc_accountnumber", "54702634102");
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
     public void test_3_nbfc_state_special_char()
     {
    	 JSONObject request=new JSONObject();
 		String token =TokenProvider.getInstance().getToken();
 		
 		 request.put("nbfc_name", "Bajaj Finance Limited");
 		 request.put("nbfc_email", "cc@bajajfinserv.in");
 		 request.put("nbfc_mobile", "8499943536");
 		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
 		 request.put("nbfc_district", "Pune");
 		 request.put("nbfc_state", "#@$%&");
 		 request.put("nbfc_pincode", "466045");
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
     public void test_4_SCLN()
     {
    	 JSONObject request=new JSONObject();
 		String token =TokenProvider.getInstance().getToken();
 		
 		 request.put("nbfc_name", "Bajaj Finance Limited");
 		 request.put("nbfc_email", "aa@bajajfinserv.in");
 		 request.put("nbfc_mobile", "8427743536");
 		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
 		 request.put("nbfc_district", "Pune");
 		 request.put("nbfc_state", "%$#ergb77");
 		 request.put("nbfc_pincode", "422045");
 		 request.put("nbfc_interest", "12");
 		 request.put("nbfc_bankname", "SBI");
 		 request.put("nbfc_branchname", "Bavdhan");
 		 request.put("nbfc_accountnumber", "547898884102");
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
