package com.xuriti.api_NBFC_Post;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.xuriti.api_admin_login.*;

public class TC_16_NBFC_Post_Blank extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void test_1_nbfc_post_blank()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("nbfc_name", "");
		 request.put("nbfc_email", "");
		 request.put("nbfc_mobile", "");
		 request.put("nbfc_address", "");
		 request.put("nbfc_district", "");
		 request.put("nbfc_state", "");
		 request.put("nbfc_pincode", "");
		 request.put("nbfc_interest", "");
		 request.put("nbfc_bankname", "");
		 request.put("nbfc_branchname", "");
		 request.put("nbfc_accountnumber", "");
		 request.put("nbfc_accountholder", "");
		 request.put("nbfc_ifsc_code", "");
		 request.put("nbfc_status", "");
		
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
