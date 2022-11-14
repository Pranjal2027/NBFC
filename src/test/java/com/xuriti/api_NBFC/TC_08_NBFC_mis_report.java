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

public class TC_08_NBFC_mis_report extends Base_Class
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
//		 request.addParameter("from", "2022/10/1");
//		 request.addParameter("to", "2022/11/30");
		request.put("from","2022/10/1");
		   request.put("to","2022/11/30");
 		 given().
		   contentType("application/json").
		   body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "nbfcs/nbfc_onboarding?from=2022/10/1&to=2022/11/30").
		   then().
		   log().all().
		    statusCode(200);
	 	}

}
