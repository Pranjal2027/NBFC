package Invoice_Services;

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

public class TC_27_change_invoice_status extends Base_Class
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void change_invoice_status()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("status", "Confirmed");
			request.put("user_comment", "Invoice status pending");
			request.put("invoiceID", "63abe950df08b3a9a7c0fc27");
			request.put("userConsentGiven", true);
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			     patch(CONTEXTPATH + "invoice/status"). 
			   then().log().all().
			    statusCode(200); 
		}


}
