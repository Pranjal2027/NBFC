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

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_8_OTP_Verify extends Base_Class_3
{

	@DataProvider(name="OTP_verify")
	public Object [][] verify_OTP()
	{
      Object [][] data= new Object[6][2];
		
		data[0][0]="7788";
		data[0][1]="9763926686";
		
		data[1][0]="";
		data[1][1]="9763926686";
		
		data[2][0]="732788";
		data[2][1]="9763926686";
		
		data[3][0]="AS@1";
		data[3][1]="9763926686";
		
		data[4][0]="7788";
		data[4][1]="";
		
		data[5][0]="";
		data[5][1]="";
		
		return data;
		
	}
	
	@Test(dataProvider = "OTP_verify")
	public void Verify_Otp(String mobileNumber, String OTP)
	{
		JSONObject request=new JSONObject();
		   
		   request.put("mobileNumber",mobileNumber); 
		   request.put("otp", OTP);
		  
		 
		   System.out.println(request.toJSONString());
		
		   given().
		   contentType("application/json").
		      body(request.toJSONString()).
		   when().
		      post(CONTEXTPATH + "auth/verify-otp").
		   then().log().all().
		    statusCode(200);
}
}
