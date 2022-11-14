package com.xuriti.api_manage_staff;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.xuriti.api_admin_login.*;

public class TC_08_Staff_User_Add_Blanks extends Base_Class
{
	@BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
	@Test
	public void test_1_staff_add_all_blank()
	{
		JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "");
		    request.put("lastName", "");
		    request.put("email", "");
		    request.put("mobileNumber", "");
		    request.put("userRole", "");
		    request.put("registeredBy", "");
		    
		    given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
			   then().log().all().
			    statusCode(200);
	}
}
