package Auth_Services;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Collection_Service.Base_Class;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TC_1_SignUp_Valid extends Base_Class
{
	@DataProvider(name="signup")
	public Object [][] Register_user()
	{
		Object [][] data= new Object[12][5];
		
		data[0][0]="Pranjal";
		data[0][1]="Gawade";
		data[0][2]="9763926686";
		data[0][3]="varsha.patil@tech-trail.com";
		data[0][4]="Xuriti#10";
		
		return data;
		
	}
  @Test	
	public void Signup()
	{

	  JSONObject request=new JSONObject();
	   
	   request.put("firstName","Pranjal");
	   request.put("lastName","Gawade");
	   request.put("mobileNumber","9763926686");
	   request.put("email","varsha.patil@tech-trail.com");
	   request.put("password","Varsha12#");
//	   request.put("user_role", "Admin");
	  
	   
	   
	   System.out.println(request.toJSONString());
	   
//	   RestAssured.baseURI = "http://localhost:4000/";
//	   RestAssured.port=4000;
//	   //baseURI="";
	   
	   given().
	   contentType("application/json").
	      body(request.toJSONString()).
	   when().
	      post(CONTEXTPATH +"auth/register-user").
	   then().log().all().
	    statusCode(200);
	   System.out.println("Register Successfully");
	}
}
