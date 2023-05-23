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

public class TC_9_Unblock_user extends Base_Class_3
{


	@DataProvider(name="unblock_user")
	public Object [][] unblock_user()
	{
      Object [][] data= new Object[4][2];
		
		data[0][0]="varsha.patil@tech-trail.com";
		data[0][1]="";
		
		data[1][0]="";
		data[1][1]="Allowed";
		
		data[2][0]="";
		data[2][1]="";
		
		data[3][0]="";
		data[3][1]="Active";
		
		
		
		return data;
		
	}
	
	@Test(dataProvider = "unblock_user")
	public void User_Unblock(String email, String status)
	{
		JSONObject request=new JSONObject();
		   
		   request.put("mobileNumber",email); 
		   request.put("otp", status);
		  
		 
		   System.out.println(request.toJSONString());
		
		   given().
		   contentType("application/json").
		      body(request.toJSONString()).
		   when().
		      put(CONTEXTPATH + "auth/user-status-update").
		   then().log().all().
		    statusCode(200);
}
}
