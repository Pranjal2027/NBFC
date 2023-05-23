package KYC;

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

public class TC_02_Pan_verify extends Base_Class_2
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void Pan()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("company_id", "63bfc59a321eee483f41dae2");
		File testUploadFile = new File ("Excel/Vishwajeet Kolapkar.Pancard.pdf");
		//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
		Response response = given()
				.multiPart(testUploadFile)
				//.body(request.toformdata())
				.  header("authorization"," Bearer " + token)
				.when().
				post(CONTEXTPATH+"kyc/document-verify/pan-ocr");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
	 	}
// 		 given().
//		   contentType("application/json").
//		      body(request.toJSONString()).
//		      header("authorization"," Bearer " + token).
//		   when().
//		      get(CONTEXTPATH + "kyc/ekyc-getcaptcha").
//		   then().
//		   log().all().
//		    statusCode(200);


}