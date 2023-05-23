package User_Service2;

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

import Collection_Service.Base_Class;
import Collection_Service.Base_Class_2;
import Collection_Service.TokenProvider;

public class TC_16_Edit_user extends Base_Class_2
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void edit_user()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		 request.put("firstName", "Apeksha");
		    request.put("lastName", "Upale");
		    request.put("email", "apeksha.upal@xuriti.com");
		    request.put("mobileNumber", "8080633879");
		    request.put("userRole", "xuritiAdmin");
		    request.put("status", "Active");//Xuritiadmin
		  request.put("name", "Varsha Patil");
		   request.put("updatedAt", "2023-01-29");
		    
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      put(CONTEXTPATH + "user/user/64083a043810423000115818/company/6425365e11f6443ab8b137b2").
		   then().
		   log().all().
		    statusCode(200);
	 	}

}
