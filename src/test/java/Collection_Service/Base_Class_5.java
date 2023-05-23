package Collection_Service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Base_Class_5 {
	public static final String CONTEXTPATH="http://192.168.0.128/";
	//public static final String CONTEXTPATH="https://dev.xuriti.app/api/";
	@BeforeClass
	public void setup()
	{
//	  RestAssured.basePath="CONTEXTPATH";
//		RestAssured.baseURI="http://localhost:4000/";
//		RestAssured.port=4000;
//		
	}
 
   public void performLogin() {
	   if(!TokenProvider.getInstance().hasToken())
	   {
		   JSONObject request=new JSONObject();
//		   
		   request.put("email","vaibhav.sawale@xuriti.com");
           request.put("password", "Vaibhav@123");
		   
//	     System.out.println(request.toJSONString());
 
		     ValidatableResponse response = given().
			   contentType("application/json").
		      body(request.toJSONString()).
		   when().
		      post(CONTEXTPATH + "auth/login").
		  // then().log().all().
		      then();
	     	response.statusCode(200);
	     	 
		   String token = accessToken(response.extract().response());
		   TokenProvider.getInstance().setToken(token);
		   
		   
		   
	   }
   }

public String accessToken (Response response) 
{
	
	return response.jsonPath().getString("token");
}
}
