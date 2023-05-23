package Invoice_Services;

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
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TC_2_Patch_Company_Status extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void Company_Status_Update()
	{
		JSONObject request=new JSONObject();
		String token= TokenProvider.getInstance().getToken();
		
		request.put("status", "Approved");
		request.put("msg", "Your Company is Approved");
				
		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		   patch(CONTEXTPATH + "entity/status-entity/64083a043810423000115818").  //company id
		   then().
		   log().all().
		    statusCode(200);
		   System.out.println("Company updated succesfully");
		 
	}
    @Test
	public void Company_Status_Update_Wrong_Id()
	{
		JSONObject request=new JSONObject();
		String token= TokenProvider.getInstance().getToken();
		
		request.put("status", "Approved");
		request.put("msg", "Your Company is Approved");
				
		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		   patch(CONTEXTPATH + "entity/status-entity/64083a043810423000115818").  //company id
		   then().
		   log().all().
		    statusCode(200);
		   System.out.println("Company updated succesfully");
		 
	}

@Test
public void Company_Status_Field_Blank()
{
	JSONObject request=new JSONObject();
	String token= TokenProvider.getInstance().getToken();
	
	request.put("status", "");
	request.put("msg", "Your Company is Approved");
			
	 given().
	   contentType("application/json").
	      body(request.toJSONString()).
	      header("authorization"," Bearer " + token).
	   when().
	   patch(CONTEXTPATH + "entity/status-entity/64083a043810423000115818").  //company id
	   then().
	   log().all().
	    statusCode(200);
	   System.out.println("Company updated succesfully");
	 
}
@Test
public void Company_Status_Msg_Field_Blank()
{
	JSONObject request=new JSONObject();
	String token= TokenProvider.getInstance().getToken();
	
	request.put("status", "Approved");
	request.put("msg", " ");
			
	 given().
	   contentType("application/json").
	      body(request.toJSONString()).
	      header("authorization"," Bearer " + token).
	   when().
	   patch(CONTEXTPATH + "entity/status-entity/64083a043810423000115818").  //company id
	   then().
	   log().all().
	    statusCode(200);
	   System.out.println("Company updated succesfully");
	 
}
}
