package Invoice_Services;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_3;
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
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TC_21_Add_Comment extends Base_Class_3
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void Add_Comment()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("userId","635a40826b206c7eb71a1156");
		request.put("comment","ok");
		request.put("id","635f63680626d4f485cd775b");
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "invoice/add-comments").
		   then().
		   log().all().
		    statusCode(200);
	 	}

}
