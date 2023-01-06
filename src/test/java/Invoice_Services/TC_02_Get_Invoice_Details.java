package Invoice_Services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class;
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

public class TC_02_Get_Invoice_Details extends Base_Class
{

	@BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void Get_Invoice_Deatils()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("invoiceID", "63b3d3de6cd25311c90d325d"); //invoice id 
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/get-invoice").  
		   then().log().all().
		    statusCode(200);  
		  
	}
}
