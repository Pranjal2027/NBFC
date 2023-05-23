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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class TC_4_Invalid_Scenario_Sign_In extends Base_Class_3 
{
	@DataProvider(name="login")
	public Object [][] login()
	{
		Object [][] data= new Object[5][2];
		
		data[0][0]="varsha.patiltech-trail.com";
		data[0][1]="Xuriti#10";
		
		data[1][0]="";
		data[1][1]="Xuriti#10";
		
		data[2][0]="varsha.patil@tech-trail.com";
		data[2][1]="";
		
		data[3][0]="";
		data[3][1]="";
		
		data[4][0]="varshatech-trail.com";
		data[4][1]="Xuriti#11";
		
		return data;
		
	}
       @Test(dataProvider = "login") 
	public void Invalid_data(String email,String password)
	{
		
		  JSONObject request=new JSONObject();
		   
		   request.put("email",email);
		   request.put("password",password);
		   
		   given().
		   contentType("application/json").
		      body(request.toJSONString()).
		   when().
		      post(CONTEXTPATH + "auth/user-login").
		   then().log().all().
		    statusCode(200);
		  // System.out.println("Login Successfully");
		}
//       
//       @Test(dataProvider = "login")
//       public void test_2_email_blank(String email, String Pwd)
//   	{
//   		
//   		  JSONObject request=new JSONObject();
//   		   
//   		   request.put("email",email);
//   		   request.put("password",Pwd);
//   		   
//   		   given().
//   		   contentType("application/json").
//   		      body(request.toJSONString()).
//   		   when().
//   		      post(CONTEXTPATH + "auth/user-login").
//   		   then().log().all().
//   		    statusCode(200);
//   		   System.out.println("Login Successfully");
//   		}
//          
//       public void test_3_email_()
//      	{
//      		
//      		  JSONObject request=new JSONObject();
//      		   
//      		   request.put("email","Varsha.patil@tech-trail.com");
//      		   request.put("password","Varsha12@");
//      		   
//      		   given().
//      		   contentType("application/json").
//      		      body(request.toJSONString()).
//      		   when().
//      		      post("api/signin").
//      		   then().log().all().
//      		    statusCode(200);
//      		   System.out.println("Login Successfully");
//      		}
	}

