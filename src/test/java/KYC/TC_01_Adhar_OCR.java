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

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;
import io.restassured.response.Response;

public class TC_01_Adhar_OCR extends Base_Class
{
  
	@Test
	public void adhar()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("company_id", "63bfc59a321eee483f41dae2");
		File testUploadFile = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
		File testUploadFile1 = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
		//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
		Response response = given()
				.multiPart(testUploadFile)
				//.body(request.toformdata())
				.  header("authorization"," Bearer " + token)
				.when().
				post(CONTEXTPATH+"kyc/document-verify/aadhaar");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
	 	}
}


