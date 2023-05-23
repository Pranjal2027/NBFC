package User_service;

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

public class TC_09_get_rewards extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void terms_conditions()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "user/rewards").
		   then().
		   log().all().
		    statusCode(200);
	 	}

}
