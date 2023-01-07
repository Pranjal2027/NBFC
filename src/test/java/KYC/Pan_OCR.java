package KYC;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_2;
import Collection_Service.TokenProvider;

public class Pan_OCR extends Base_Class_2
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void Pan_OCR()
	{
		JSONObject request=new JSONObject();
		//String token =TokenProvider.getInstance().getToken();
		File Pancard = new File ("/home/pranjal/Pictures/Screenshots/PAN.png");
		request.put("company_id","63b01da78bcfecd283d1e7fe");
	
		//request.put("pan",Pancard);
//		request.put("","");
		 
 		 given().
		  multiPart("pan",Pancard,"multipart/form-data").		   
		      body(request.toJSONString()).
		    //  header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "kyc/document-verify/pan-ocr").
		   then().
		   log().all().
		    statusCode(200);
	 	}

}
