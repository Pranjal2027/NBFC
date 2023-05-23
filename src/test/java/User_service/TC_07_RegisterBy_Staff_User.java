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
//public class TC_07_RegisterBy_Staff_User extends Base_Class
//{
//	@BeforeClass
//	public void setup()
//	{
//		super.performLogin();
//	}
//
//	@Test
//     public void staff_regiserby_blank()
//     {
//    	 JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "Patil");
//		    request.put("email", "ab@xuriti.com");
//		    request.put("mobileNumber", "2030405060");
//		    request.put("userRole", "xuritiAdmin");
//		    request.put("registeredBy", "");
//		    
//		    given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
//			   then().log().all().
//			    statusCode(200);
//     }
//	
//	@Test
//	public void staff_registerby_special_char()
//	{
//		JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		   
//		    request.put("firstName", "Varsha");
//		    request.put("lastName", "Patil");
//		    request.put("email", "ac@xuriti.com");
//		    request.put("mobileNumber", "0102040803");
//		    request.put("userRole", "xuritiAdmin");
//		    request.put("registeredBy", "%$^$@$");
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
//}
