package Collection_Service;

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

public class TC_08_Genarate_Payment_Link extends Base_Class_4
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void payment_link()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("buyerId","6425365e11f6443ab8b137b2");
			request.put("waver","10");
			request.put("orderAmount","9000");
			request.put("interest","2");
			request.put("full_payment","true");
			request.put("total_outstanding",19500);
			request.put("total_waver",0);
			request.put("total_gst",250);
			request.put("total_payable",19524.22);
			request.put("settled_amount",19500);
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH + "collection/wavers/payment").   
			   then().log().all().
			    statusCode(200); 
		}


}
