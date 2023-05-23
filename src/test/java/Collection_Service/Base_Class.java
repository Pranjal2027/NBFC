package Collection_Service;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;



import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Base_Class {

	//public static final String CONTEXTPATH="https://dev.xuriti.app/api/";
//	public static final String CONTEXTPATH="http://192.168.0.141/";
	public static final String CONTEXTPATH="http://192.168.0.128/";
	public static final String USERID="64083a043810423000115818";
	public static final String ENTITYID="63b53862666bd921b3b3c449";
	public static final String INVOICEID="63aaa0509799b5596724957f";
	public static final String NBFCID="63b3d0b420c269635ad21900";
	public static final String BUYERID="6425365e11f6443ab8b137b2";
	public static final String SELLERID="642535f3ca1e33a4665694e0";
	public static final String BUYERGST="63bfc5ba321eee483f41db3b";
//	public static final String SELLERGST="63bfc5ba321eee483f41db3b";
//	public static final String ADMINID="63bfc5ba321eee483f41db3b";
	
	@BeforeClass
		public void setup()
		{
//		  RestAssured.basePath="CONTEXTPATH";
//			RestAssured.baseURI="http://localhost:4000/";
//			RestAssured.port=4000;
//			
		}
	 
	   public void performLogin() {
		   if(!TokenProvider.getInstance().hasToken())
		   {
			   JSONObject request=new JSONObject();
//			   
			   request.put("email","kashif.iqbal@xuriti.com");
	           request.put("password", "Xuriti#10");
			   
//		     System.out.println(request.toJSONString());
	 
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
