package com.xuriti.api_manage_staff;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_03_Last_Name_Staff_User_Post extends Base_Class
{
   @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
   @Test
	public void  test_1_staff_last_name_blank()
	{

		 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "");
		    request.put("email", "ff@xuriti.com");
		    request.put("mobileNumber", "3333333333");
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
   public void test_2_staff_last_name_number()
   {
		 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "0124");
		    request.put("email", "pg@xuriti.com");
		    request.put("mobileNumber", "5555555555");
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
   public void test_3_staff_last_name_special_char()
   {
	   		 
	      JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "#$%@");
		    request.put("email", "hh@xuriti.com");
		    request.put("mobileNumber", "6666666666");
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
   public void test_4_staff_last_name_SCLN()
   {

		 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "$#fr23L");
		    request.put("email", "ii@xuriti.com");
		    request.put("mobileNumber", "7777777777");
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
