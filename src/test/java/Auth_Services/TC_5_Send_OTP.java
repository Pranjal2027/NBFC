package Auth_Services;

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

import Collection_Service.TokenProvider;


import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;


public class TC_5_Send_OTP extends Base_Class_3
{
//	@DataProvider(name="OTP_Verify")
//	public Object [][] Otp_verify()
//	{ 
//		Object [][] data= new Object[1][1];
//		
//		data[0][0]="8080630830";
//		
//		return data;
//		
//	}
//	
//     @Test(dataProvider = "OTP_Verify") 
	 @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
	 @Test
	public void Send_otp()
	{
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();  
		   request.put("recipient","8080630830");
	
		   given().
		   contentType("application/json").
		      body(request.toJSONString()).
		   when().
		      post(CONTEXTPATH + "auth/send-otp").
		   then().log().all().
		    statusCode(200);
		  // System.out.println("Login Successfully");
		}
	 
	
}
