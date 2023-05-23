package KYC;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_2;
import Collection_Service.TokenProvider;

public class TC_17_request_otp extends Base_Class_2
{
  
    @Test
	public void request_otp()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put( "mobile_number","9145282676");
		
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      //header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "kyc/phone-verification/request-otp").
		      
		   then().
		   log().all().
		    statusCode(200);

}

}
