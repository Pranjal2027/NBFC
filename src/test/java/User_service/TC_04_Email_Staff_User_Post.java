//package User_service;
//
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import Collection_Service.Base_Class;
//import Collection_Service.TokenProvider;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import static io.restassured.RestAssured.given;
//
//import org.json.simple.JSONObject;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class TC_04_Email_Staff_User_Post extends Base_Class
//{
//    @BeforeClass
//	public void setup()
//	{
//		super.performLogin();
//	}
//	
//    @Test
//	public void staff_email_blank()
//	{
//
//		 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "Patil");
//		    request.put("email", "");
//		    request.put("mobileNumber", "8888888888");
//		    request.put("userRole", "xuritiAdmin");
//		    request.put("registeredBy", "63aa7ecccd025999c1fdf19a");
//		    
//		    given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
//			   then().log().all().
//			    statusCode(200);
//	}
//    @Test
//    public void staff_email_special_char()
//    {
//
//		 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "Patil");
//		    request.put("email", "&^%$@xuriti.com");
//		    request.put("mobileNumber", "9999999999");
//		    request.put("userRole", "xuritiAdmin");
//		    request.put("registeredBy", "63aa7ecccd025999c1fdf19a");
//		    
//		    given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
//			   then().log().all().
//			    statusCode(200);
//    }
//    
//    @Test
//    public void staff_email_missing_dot()
//    {
//
//		 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "Patil");
//		    request.put("email", "jj@xuriticom");
//		    request.put("mobileNumber", "1010101010");
//		    request.put("userRole", "xuritiAdmin");
//		    request.put("registeredBy", "63aa7ecccd025999c1fdf19a");
//		    
//		    given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
//			   then().log().all().
//			    statusCode(200);
//    }
//    
//    @Test
//    public void staff_email_first_numbers()
//    {
//
//		 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "Patil");
//		    request.put("email", "1234@xuriti.com");
//		    request.put("mobileNumber", "0101010101");
//		    request.put("userRole", "xuritiAdmin");
//		    request.put("registeredBy", "63aa7ecccd025999c1fdf19a");
//		    
//		    given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
//			   then().log().all().
//			    statusCode(200);
//    }
//    @Test
//    public void staff_email_missing_at_the_rate()
//    {
//
//		 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "Patil");
//		    request.put("email", "kkxuriti.com");
//		    request.put("mobileNumber", "2020202020");
//		    request.put("userRole", "xuritiAdmin");
//		    request.put("registeredBy", "63aa7ecccd025999c1fdf19a");
//		    
//		    given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
//			   then().log().all().
//			    statusCode(200);
//    }
//    @Test
//    public void staff_email_gmail_format()
//    {
//
//		 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "Patil");
//		    request.put("email", "llo@gmail.com");
//		    request.put("mobileNumber", "3030303030");
//		    request.put("userRole", "xuritiAdmin");
//		    request.put("registeredBy", "63aa7ecccd025999c1fdf19a");
//		    
//		    given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
//			   then().log().all().
//			    statusCode(200);
//    }
//    
//    @Test
//    public void staff_email_existing()
//    {
//
//		 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "Patil");
//		    request.put("email", "varsha.patil@xuriti.com");
//		    request.put("mobileNumber", "4040404040");
//		    request.put("userRole", "xuritiAdmin");
//		    request.put("registeredBy", "63aa7ecccd025999c1fdf19a");
//		    
//		    given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
//			   then().log().all().
//			    statusCode(200);
//    }
//}
