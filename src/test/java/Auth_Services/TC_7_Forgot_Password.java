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

public class TC_7_Forgot_Password extends Base_Class_3
{
	@DataProvider(name="forgot_pass")
	public Object [][] forgot_password()
	{
      Object [][] data= new Object[4][1];
		
		data[0][0]="varsha.patil@tech-trail.com";
		
		data[1][0]="varshap";
		
		data[2][0]="varshapgmail.com";
		
		data[3][0]="&&&&&";
	
		return data;
		
	}
	
	@Test(dataProvider = "forgot_pass")
	public void Forgot_Password(String Email)
	{
		JSONObject request=new JSONObject();
		   
		   request.put("email",Email); 
		  
		 
		   System.out.println(request.toJSONString());
		
		   given().
		   contentType("application/json").
		      body(request.toJSONString()).
		   when().
		      post(CONTEXTPATH + "auth/forgot-password").
		   then().log().all().
		    statusCode(200);
		
	}

}
