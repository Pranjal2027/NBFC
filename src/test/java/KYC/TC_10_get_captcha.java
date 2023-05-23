package KYC;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
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

import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;

public class TC_10_get_captcha extends Base_Class
{
  
    @Test
	public void get_captcha()
	{
		JSONObject request=new JSONObject();
	//	String token =TokenProvider.getInstance().getToken();
		//request.put("company_id", "63bfc59a321eee483f41dae2");
		
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      //header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "kyc/ekyc-getcaptcha").
		      
		   then().
		   log().all().
		    statusCode(200);

}


}
