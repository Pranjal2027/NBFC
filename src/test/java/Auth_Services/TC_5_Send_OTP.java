package Auth_Services;

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

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_5_Send_OTP extends Base_Class_3
{
	@DataProvider(name="OTP_Verify")
	public Object [][] Otp_verify()
	{
		Object [][] data= new Object[1][1];
		
		data[0][0]="9975080948";
		
		return data;
		
	}
	
     @Test(dataProvider = "OTP_Verify") 
	public void Send_otp(String mobileno)
	{
		
		  JSONObject request=new JSONObject();
		   
		   request.put("recipient",mobileno);
	
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
