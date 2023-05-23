package Auth_Services;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Collection_Service.TokenProvider;

public class TC_10_Logout extends Base_Class_3{
	public void setup()
	{
		super.performLogin();
	}
 @Test
public void Send_otp()
{
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();  
	   request.put("userID", "63aa7e8fcd025999c1fdf16b");

	   given().
	   contentType("application/json").
	      body(request.toJSONString()).
	   when().
	      post(CONTEXTPATH + "auth/logout").
	   then().log().all().
	    statusCode(200);
	 
	}
 

}


