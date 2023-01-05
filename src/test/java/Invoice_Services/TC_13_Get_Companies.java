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
public class TC_13_Get_Companies extends Base_Class_3
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void Get_All_Invoice()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("phoneNumber", "7972512892");  
		   request.put("company", "6360c525b3eb796c37a0ee53");  
		   request.put("type", "invoice");  
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/wa?type=invoice&phoneNumber=7972512892&company=6360c525b3eb796c37a0ee53").  
		   then().log().all().
		    statusCode(200);  
		  
	}

}
