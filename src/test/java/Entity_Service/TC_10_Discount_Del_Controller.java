package Entity_Service;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Auth_Services.Base_Class_3;
import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;


public class TC_10_Discount_Del_Controller extends Base_Class
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void Default_Flag_Controller()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      delete(CONTEXTPATH + "entity/6425365e11f6443ab8b137b2/credit-plans/63b6b634666bd921b3b40d03").   
			   then().log().all().
			    statusCode(200); 
		}
	   @Test
	 		public void Default_Flag_Controller_wrong_id1()
	 		{
	 		   
	 		  JSONObject request=new JSONObject();
	 		  String token = TokenProvider.getInstance().getToken();
	 			
	 			   given().
	 			   contentType("application/json").
	 			   body(request.toJSONString()).
	 			   header("authorization","Bearer " + token).
	 			  when().
	 			      delete(CONTEXTPATH + "entity/63b6b5e6646bd921b3b40cdf/credit-plans/63b6b634666bd921b3b40d03").   
	 			   then().log().all().
	 			    statusCode(200); 
	 		}
	   @Test
	 		public void Default_Flag_Controller_wrong_id2()
	 		{
	 		   
	 		  JSONObject request=new JSONObject();
	 		  String token = TokenProvider.getInstance().getToken();
	 			
	 			   given().
	 			   contentType("application/json").
	 			   body(request.toJSONString()).
	 			   header("authorization","Bearer " + token).
	 			  when().
	 			      delete(CONTEXTPATH + "entity/63b6b5e6666bd921b3b40cdf/credit-plans/63b8b634666bd921b3b40d03").   
	 			   then().log().all().
	 			    statusCode(200); 
	 		}
	   @Test
	 		public void Default_Flag_Controller_wrong_url()
	 		{
	 		   
	 		  JSONObject request=new JSONObject();
	 		  String token = TokenProvider.getInstance().getToken();
	 			
	 			   given().
	 			   contentType("application/json").
	 			   body(request.toJSONString()).
	 			   header("authorization","Bearer " + token).
	 			  when().
	 			      delete(CONTEXTPATH + "entity/63b6b5e6666bd921b3b40cdf/63b6b634666bd921b3b40d03").   
	 			   then().log().all().
	 			    statusCode(404); 
	 		}
}
