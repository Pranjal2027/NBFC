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
import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_2;
import Collection_Service.TokenProvider;
import io.restassured.response.Response;

public class TC_03_Banking_Details extends Base_Class_2
{
	@BeforeClass
	public void setup()
	{
		super.performLogin();
	}
    @Test
	public void Banking_Details()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
//		request.put("companyId", "63aa7f748a6964f3f6ef5ee5");
//		request.put("userID", "63aa7e8fcd025999c1fdf16b");
		//request.put("businessDocType", "LoS");
	//request.put("businessDocNumber", "12345687412");
		
		File testUploadFile = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
		//File testUploadFile1 = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
		//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
		Response response = given()
				//.multiPart(testUploadFile)
				//.multiPart("companyId", "63bfc59a321eee483f41dae2")
				//.body(request.toJSONString())
				.contentType("multipart/form-data")
				.multiPart("companyId","63bfc59a321eee483f41dae2")
				.multiPart("userID", "63b3cb905804f9c99c756cc6")
				.  header("authorization"," Bearer " + token)
				.when().
				post(CONTEXTPATH + "entity/onboard");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
	 	}

}
