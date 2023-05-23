package Payment_Service;

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

import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;

public class TC_10_Vouch_Payment extends Base_Class
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void Vouch_payment()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
		  request.put("order_currency", "INR");
		  request.put("buyerid","6425365e11f6443ab8b137b2");
		  request.put( "order_amount","1522.6999999999998");
		  request.put( "sellerid","642535f3ca1e33a4665694e0");
		  request.put( "waverid", "63da0a7a1ccbb6fb3654c599");
		  request.put( "email", "apeksha.upale@tech-trail.com");
		  request.put( "mobile_number", "9145282676");
		  request.put( "amount_deduct", "117.79000000000002");
		  request.put( "settle_amount","0");
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			     post(CONTEXTPATH + "payment/vouch_payment").   
			   then().log().all().
			    statusCode(200); 
		}

}
