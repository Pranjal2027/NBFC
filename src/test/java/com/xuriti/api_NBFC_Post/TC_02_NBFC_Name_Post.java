package com.xuriti.api_NBFC_Post;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_02_NBFC_Name_Post extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void test_1_nbfc_name_blank()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "");
		 request.put("nbfc_email", "mjhy@bajajfinserv.com");
		 request.put("nbfc_mobile", "8421987536");
		 request.put("nbfc_address", "AT/P Bavdhan");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "414045");
		 request.put("nbfc_interest", "11");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "478964230124");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN0047562");
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
    public void test_2_nbfc_name_number()
    {
    
    	JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "4579845");
		 request.put("nbfc_email", "lkio@bajajfinserv.com");
		 request.put("nbfc_mobile", "8441987536");
		 request.put("nbfc_address", "AT/P Bavdhan");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "414015");
		 request.put("nbfc_interest", "10");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "478964230124");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN0047562");
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
    public void test_3_nbfc_name_special_char()
    {
    
    	JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "%$#*&");
		 request.put("nbfc_email", "ffio@bajajfinserv.com");
		 request.put("nbfc_mobile", "8441987446");
		 request.put("nbfc_address", "AT/P Bavdhan");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "413012");
		 request.put("nbfc_interest", "10");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "478964201124");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN0047562");
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
    public void test_4_nbfc_SLN()
    {
        JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "*765kji");
		 request.put("nbfc_email", "nnio@bajajfinserv.com");
		 request.put("nbfc_mobile", "8441857536");
		 request.put("nbfc_address", "AT/P Bavdhan");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("nbfc_pincode", "424015");
		 request.put("nbfc_interest", "10");
		 request.put("nbfc_bankname", "SBI");
		 request.put("nbfc_branchname", "Bavdhan");
		 request.put("nbfc_accountnumber", "485964230124");
		 request.put("nbfc_accountholder", "Varsha");
		 request.put("nbfc_ifsc_code", "SBIN0047562");
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
