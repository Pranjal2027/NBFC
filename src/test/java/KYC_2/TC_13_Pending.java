//package KYC_2;
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
//import static io.restassured.RestAssured.given;
//
//import org.json.simple.JSONObject;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import Collection_Service.Base_Class_5;
//import Collection_Service.TokenProvider;
//
//public class TC_13_Pending extends Base_Class_5
//{
//	   @BeforeClass
//		public void setup()
//		{
//			super.performLogin();
//		}
//		
//	   @Test
//		public void Get_Pending()
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
//			      get(CONTEXTPATH + "kyc/pending").   
//			   then().log().all().
//			    statusCode(200); 
//		}
//
//}
