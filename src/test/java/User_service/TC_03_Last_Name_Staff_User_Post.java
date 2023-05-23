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
//public class TC_03_Last_Name_Staff_User_Post extends Base_Class
//{
//   @BeforeClass
//	public void setup()
//	{
//		super.performLogin();
//	}
//	
//   @Test
//	public void  staff_last_name_blank()
//	{
//
//		 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "");
//		    request.put("email", "ff@xuriti.com");
//		    request.put("mobileNumber", "3333333333");
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
//   
//   @Test
//   public void staff_last_name_number()
//   {
//		 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "0124");
//		    request.put("email", "pg@xuriti.com");
//		    request.put("mobileNumber", "5555555555");
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
//   }
//   
//   @Test
//   public void staff_last_name_special_char()
//   {
//	   		 
//	      JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "#$%@");
//		    request.put("email", "hh@xuriti.com");
//		    request.put("mobileNumber", "6666666666");
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
//   }
//   
//   @Test
//   public void staff_last_name_SCLN()
//   {
//
//		 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "$#fr23L");
//		    request.put("email", "ii@xuriti.com");
//		    request.put("mobileNumber", "7777777777");
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
//   }
//}
