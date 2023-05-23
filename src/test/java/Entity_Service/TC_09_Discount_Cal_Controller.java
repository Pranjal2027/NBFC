//package Entity_Service;
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
//import static io.restassured.RestAssured.given;
//
//import org.json.simple.JSONObject;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import Auth_Services.Base_Class_3;
//import Collection_Service.Base_Class;
//import Collection_Service.TokenProvider;
//
//public class TC_09_Discount_Cal_Controller extends Base_Class
//{
//	   @BeforeClass
//		public void setup()
//		{
//			super.performLogin();
//		}
		
//	   @Test
//		public void Discount_Mapping_Controller()
//		{
//		   
//		  JSONObject request=new JSONObject();
//		  String token = TokenProvider.getInstance().getToken();
//			
//			   given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      get(CONTEXTPATH + "entity/63b01da78bcfecd283d1e7fe/invoices/63b6b984d77136d0bee8733f/discounts").   
//			   then().log().all().
//			    statusCode(200); 
//		}
//	   @Test
//		public void Discount_Mapping_Controller_Wrong_id_1()
//		{
//		   
//		  JSONObject request=new JSONObject();
//		  String token = TokenProvider.getInstance().getToken();
//			
//			   given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      get(CONTEXTPATH + "entity/63b01da78bcfecd283d1e7fe/invoices/63b6b984d77136d0bee8733f/discounts").   
//			   then().log().all().
//			    statusCode(200); 
//		}
//	   @Test
//		public void Discount_Mapping_Controller_wrong_id2()
//		{
//		   
//		  JSONObject request=new JSONObject();
//		  String token = TokenProvider.getInstance().getToken();
//			
//			   given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      get(CONTEXTPATH + "entity/63b01da78bcfecd283d1e7fe/invoices/63b6b984d77136d0bee8733f/discounts").   
//			   then().log().all().
//			    statusCode(200); 
//		}
//	   @Test
//		public void Discount_Mapping_Controller_wrong_url()
//		{
//		   
//		  JSONObject request=new JSONObject();
//		  String token = TokenProvider.getInstance().getToken();
//			
//			   given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      get(CONTEXTPATH + "entity/63b01da78bcfecd283d1e7fe/63b6b984d77136d0bee8733f/discounts").   
//			   then().log().all().
//			    statusCode(404); 
//		}
//}
