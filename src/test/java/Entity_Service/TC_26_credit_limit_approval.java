package Entity_Service;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_2;
import Collection_Service.TokenProvider;

public class TC_26_credit_limit_approval extends Base_Class_2
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void credit_limit_approval()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			
		  request.put("companyid", "640ac6fb9c3338ad7f1dc8d0");
		  request.put("userid", "63b3cb905804f9c99c756cc6");
		  request.put("status", "Approved");
		  request.put("comment", "ok");
		 
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      patch(CONTEXTPATH + "entity/credtilimitapproval").   
			   then().log().all().
			    statusCode(200); 
		}

}
