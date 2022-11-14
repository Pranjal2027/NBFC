package com.xuriti.api_manage_staff;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.xuriti.api_admin_login.*;

public class TC_06_User_Role_Staff_User_Post extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void test_1_staff_role_blank()
	{
		 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "tt@xuriti.com");
		    request.put("mobileNumber", "6060606060");
		    request.put("userRole", "");
		    request.put("registeredBy", "62a1ad3af497ef97fecf8e74");
		    
		    given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
			   then().log().all().
			    statusCode(200);
	}
    
    @Test
    public void test_2_staff_role_special_char()
    {
    	 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "uu@xuriti.com");
		    request.put("mobileNumber", "7070707070");
		    request.put("userRole", "&#@%*");
		    request.put("registeredBy", "62a1ad3af497ef97fecf8e74");
		    
		    given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
			   then().log().all().
			    statusCode(200);
    }
    
    @Test
    public void test_3_staff_role_numbers()
    {
    	 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "vv@xuriti.com");
		    request.put("mobileNumber", "8080808080");
		    request.put("userRole", "687643");
		    request.put("registeredBy", "62a1ad3af497ef97fecf8e74");
		    
		    given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
			   then().log().all().
			    statusCode(200);
    }
    
    @Test
    public void test_4_staff_role_SCLN()
    {
    	 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "ww@xuriti.com");
		    request.put("mobileNumber", "9090909090");
		    request.put("userRole", "%$#67yt");
		    request.put("registeredBy", "62a1ad3af497ef97fecf8e74");
		    
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
