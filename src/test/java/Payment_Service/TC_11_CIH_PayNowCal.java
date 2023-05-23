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

public class TC_11_CIH_PayNowCal extends Base_Class
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void Cih()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
		   request.put( "orderAmount","1000");
		   request.put( "invoiceId","64479dd1603a1d1fd8ce5bce");
		   request.put(  "paymentDate","2023-04-25");
		   request.put( "orderID","1234");

			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH + "payment/cih_payment").   
			   then().log().all().
			    statusCode(200); 
		}

}
