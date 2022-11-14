package com.xuriti.api_manage_staff;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.xuriti.api_admin_login.*;

public class TC_05_Mobile_Staff_User_Post extends Base_Class
{
	
     @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
     @Test
     public void test_1_staff_mobile_blank()
     {
    	 
		 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "mm@xuriti.com");
		    request.put("mobileNumber", "");
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
     public void test_2_staff_mobile_letters()
     {
    	 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "nn@xuriti.com");
		    request.put("mobileNumber", "kjiuytredo");
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
     public void test_3_staff_mobile_less_10()
     {
    	 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "oo@xuriti.com");
		    request.put("mobileNumber", "04056012");
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
     public void test_4_staff_mobile_more_10()
     {
    	 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "pp@xuriti.com");
		    request.put("mobileNumber", "05050505050505");
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
     public void test_5_staff_mobile_existing()
     {
    	 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "qq@xuriti.com");
		    request.put("mobileNumber", "4058961201");
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
     public void test_6_staff_mobile_special_char()
     {
    	 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "rr@xuriti.com");
		    request.put("mobileNumber", "^%$#@!");
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
     public void test_7_staff_mobile_SCLN()
     {
    	 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "ss@xuriti.com");
		    request.put("mobileNumber", "huyH768%$");
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
