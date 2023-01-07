package KYC;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_2;
import Collection_Service.TokenProvider;

public class Adhar_OCR extends Base_Class_2
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void Adhar_OCR()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		File Jsondata = new File ("/home/pranjal/Pictures/Screenshots/AdharFront.png");
		File Jsondata1 = new File ("/home/pranjal/Pictures/Screenshots/AdharBack.png");
		request.put("company_id","63b01da78bcfecd283d1e7fe");
	//	request.put("pan_number","DYPPK8990B");
		//request.put("","");
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "kyc/document-verify/aadhaar").
		   then().
		   log().all().
		    statusCode(200);
	 	}


}
