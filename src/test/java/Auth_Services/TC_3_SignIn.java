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
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TC_3_SignIn extends Base_Class_3
{
	public void setup() {
		super.performLogin();
		
	}
	
      @Test
	  public void Sign_In()
	  {
		  JSONObject request=new JSONObject();
		   
		   request.put("email","varsha.patil@tech-trail.com");
		   request.put("password","Xuriti#10");
		   
		   given().
		   contentType("application/json").
		      body(request.toJSONString()).
		   when().
		      post(CONTEXTPATH + "auth/user-login").
		   then().
		   log().all().
		    statusCode(200);
		   System.out.println("Login Successfully");
		}
	  }

