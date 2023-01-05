package Invoice_Services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_3;
import Collection_Service.TokenProvider;

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
public class TC_07_Delete_Invoice extends Base_Class_3
{

	@BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
   @Test
	public void Delete_Invoice()
	{
	   
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();
		
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      delete(CONTEXTPATH + "invoice/invoices/639711aec8091dab1061aa94/635b62926b206c7eb71a1274").  //invoice id  and user xuriti admin id 
		   then().log().all().
		    statusCode(202); 
	}
}
