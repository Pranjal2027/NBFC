package User_service;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_01_Staff_User_Post extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void add_staff_user()
	{

		 JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		   
		    request.put("firstName", "Varsha");
		    request.put("lastName", "Patil");
		    request.put("email", "varsha@xuriti.com");
		    request.put("mobileNumber", "8080630840");
		    request.put("userRole", "xuritiAdmin");
		    request.put("registeredBy", "63aa7ecccd025999c1fdf19a");
		    
		    given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH +  "user/user?userRole=xuritiAdmin").  
			   then().log().all().
			    statusCode(200);
	}
}
