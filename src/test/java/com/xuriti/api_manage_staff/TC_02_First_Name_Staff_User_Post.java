package com.xuriti.api_manage_staff;

import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_02_First_Name_Staff_User_Post extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void test_1_staff_first_name_blank()
	{

		 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "");
		    request.put("lastName", "Patil");
		    request.put("email", "dd@xuriti.com");
		    request.put("mobileNumber", "4444444444");
		    request.put("userRole", "xuritiAdmin");
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
    public void test_2_staff_first_name_number()
    {
		 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "45756");
		    request.put("lastName", "Patil");
		    request.put("email", "cc@xuriti.com");
		    request.put("mobileNumber", "1111111111");
		    request.put("userRole", "xuritiAdmin");
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
    public void test_3_staff_first_name_special_char()
    {
		 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "#@%&");
		    request.put("lastName", "Patil");
		    request.put("email", "bb@xuriti.com");
		    request.put("mobileNumber", "2222222722");
		    request.put("userRole", "xuritiAdmin");
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
    public void test_4_staff_first_name_SCLN()
    {

		 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Nhjs#4$");
		    request.put("lastName", "Patil");
		    request.put("email", "aa@xuriti.com");
		    request.put("mobileNumber", "4444444455");
		    request.put("userRole", "xuritiAdmin");
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
