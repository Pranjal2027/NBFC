package Entity_Service;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_2;
import Collection_Service.TokenProvider;
import io.restassured.response.Response;

public class TC_32_onboard extends Base_Class_2
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void onboard()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("userId", "63b3cb905804f9c99c756cc6");
			request.put("companyId", "63bfc59a321eee483f41dae2");
			//request.put("StoreImages", "");
			  File testUploadFile = new File ("Excel/credit.xlsx");
			
			   given().
			   multiPart(testUploadFile).
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH + "entity/onboard").   
			   then().log().all().
			    statusCode(200); 
		}

}
