package Entity_Service;

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

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_2;
import Collection_Service.TokenProvider;
import io.restassured.response.Response;

public class TC_31_bulk_credit extends Base_Class_2
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void bulk_credit()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			
		  
		  File testUploadFile = new File ("Excel/credit.xlsx");
			//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
			Response response = given()
					.multiPart(testUploadFile)
					//.body(request.toformdata())
					.  header("authorization"," Bearer " + token)
					.when().
					post(CONTEXTPATH+"entity/bulk-credit");
			System.out.println(response.getStatusCode());
			System.out.println(response.asString());
			//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
		 	}

}
