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

public class TC_04_Bussiness_Proof extends Base_Class_2
{
	 @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
  
    @Test
	public void Bussiness_Proof_Letter_of_signatory_authorization()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
//		request.put("companyId", "63bfc59a321eee483f41dae2");
//		request.put("userId", "63b3cb905804f9c99c756cc6");
//		request.put("businessDocType", "LoS");
//		request.put("businessDocNumber","12345687412");
//		request.put("companyId", "63aa7f748a6964f3f6ef5ee5");
//		request.put("userID", "63aa7e8fcd025999c1fdf16b");
		//File testUploadFile = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
		//File testUploadFile1 = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
		//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
		Response response = given()
				.contentType("multipart/form-data")
				.multiPart("companyId","63bfc59a321eee483f41dae2")
				.multiPart("userID", "63b3cb905804f9c99c756cc6")
				//.body(request.toJSONString())
//				.multiPart(testUploadFile)
				.  header("authorization"," Bearer " + token)
				.when().
				post(CONTEXTPATH + "entity/onboard");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
	 	}
    @Test
   	public void Bussiness_Proof_GSTN_Certificate()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
//   		request.put("companyId", "63bfc59a321eee483f41dae2");
//   		request.put("userID", "63 b3cb905804f9c99c756cc6");
//   		request.put("businessDocType", "gstnumber");
//   		request.put("businessDocNumber", "12345687412");
   		
   	//	File testUploadFile = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//File testUploadFile1 = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
   		Response response = given()
   				.contentType("multipart/form-data")
   				.multiPart("companyId","63bfc59a321eee483f41dae2")
				.multiPart("userID", "63b3cb905804f9c99c756cc6")
   				//.multiPart(testUploadFile)
   				//.body(request.toformdata())
   				.  header("authorization"," Bearer " + token)
   				.when().
   				post(CONTEXTPATH+"entity/onboard");
   		System.out.println(response.getStatusCode());
   		System.out.println(response.asString());
   		//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
   	 	}
    @Test
   	public void Bussiness_Proof_Shop_Act()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
//   		request.put("companyId", "63bfc59a321eee483f41dae2");
//   		request.put("userID", "63b3cb905804f9c99c756cc6");
//   		request.put("businessDocType", "shopact");
//   		request.put("businessDocNumber", "12345687412");
//   		
//   		File testUploadFile = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//File testUploadFile1 = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
   		Response response = given()
   		//		.multiPart(testUploadFile)
   				//.body(request.toformdata())
   				.contentType("multipart/form-data")
   				.multiPart("companyId","63bfc59a321eee483f41dae2")
				.multiPart("userID", "63b3cb905804f9c99c756cc6")
   				.  header("authorization"," Bearer " + token)
   				.when().
   				post(CONTEXTPATH+"entity/onboard");
   		System.out.println(response.getStatusCode());
   		System.out.println(response.asString());
   		//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
   	 	}
    @Test
   	public void Bussiness_Proof_Firm_PA()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
//   		request.put("companyId", "63bfc59a321eee483f41dae2");
//   		request.put("userID", "63b3cb905804f9c99c756cc6");
//   		request.put("businessDocType", "firmpan");
//   		request.put("businessDocNumber", "12345687412");
//   		
   		File testUploadFile = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//File testUploadFile1 = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
   		Response response = given()
   			//	.multiPart(testUploadFile)
   				//.body(request.toformdata())
   				.contentType("multipart/form-data")
   				.multiPart("companyId","63bfc59a321eee483f41dae2")
				.multiPart("userID", "63b3cb905804f9c99c756cc6")
   				.  header("authorization"," Bearer " + token)
   				.when().
   				post(CONTEXTPATH+"entity/onboard");
   		System.out.println(response.getStatusCode());
   		System.out.println(response.asString());
   		//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
   	 	}
    @Test
   	public void Bussiness_Proof_Udyog_Aadhar()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
//   		request.put("companyId", "63bfc59a321eee483f41dae2");
//   		request.put("userID", "63b3cb905804f9c99c756cc6");
//   		request.put("businessDocType", "udyog");
//   		request.put("businessDocNumber", "12345687412");
   		
   		//File testUploadFile = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//File testUploadFile1 = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
   		Response response = given()
   		//		.multiPart(testUploadFile)
   				//.body(request.toformdata())
   				.contentType("multipart/form-data")
   				.multiPart("companyId","63bfc59a321eee483f41dae2")
				.multiPart("userID", "63b3cb905804f9c99c756cc6")
   				.  header("authorization"," Bearer " + token)
   				.when().
   				post(CONTEXTPATH+"entity/onboard");
   		System.out.println(response.getStatusCode());
   		System.out.println(response.asString());
   		//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
   	 	}
    @Test
   	public void Bussiness_Proof_Board_Resolution()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
//   		request.put("companyId", "63bfc59a321eee483f41dae2");
//   		request.put("userID", "63b3cb905804f9c99c756cc6");
//   		request.put("businessDocType", "board_resolution");
//   		request.put("businessDocNumber", "12345687412");
//   		
//   		File testUploadFile = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//File testUploadFile1 = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
   		Response response = given()
   				//.multiPart(testUploadFile)
   				//.body(request.toformdata())
   				.contentType("multipart/form-data")
   				.multiPart("companyId","63bfc59a321eee483f41dae2")
				.multiPart("userID", "63b3cb905804f9c99c756cc6")
   				.  header("authorization"," Bearer " + token)
   				.when().
   				post(CONTEXTPATH+"entity/onboard");
   		System.out.println(response.getStatusCode());
   		System.out.println(response.asString());
   		//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
   	 	}
    @Test
   	public void Bussiness_Proof_Utility_bill()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
//   		request.put("companyId", "63bfc59a321eee483f41dae2");
//   		request.put("userID", "63b3cb905804f9c99c756cc6");
//   		request.put("businessDocType", "utilitybill");
//   		request.put("businessDocNumber", "12345687412");
   		
   		//File testUploadFile = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//File testUploadFile1 = new File ("Excel/Screenshot from 2022-12-31 11-37-56.png");
   		//RestAssured.baseURI = "https://dev.xuriti.app/adminpanel/api/nbfcs/";
   		Response response = given()
   			//	.multiPart(testUploadFile)
   				//.body(request.toformdata())
   				.contentType("multipart/form-data")
   				.multiPart("companyId","63bfc59a321eee483f41dae2")
				.multiPart("userID", "63b3cb905804f9c99c756cc6")
   				.  header("authorization"," Bearer " + token)
   				.when().
   				post(CONTEXTPATH+"entity/onboard");
   		System.out.println(response.getStatusCode());
   		System.out.println(response.asString());
   		//AssertJUnit.assertTrue(response.asString().toString().contains("successfully uploaded"));
   	 	}
}



