package MIS_report_nbfc;

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
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;

public class list_of_onboarded extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void one_day()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "nbfcs/nbfc_onboarding?days=1").
		   then().
		   log().all().
		    statusCode(200);
	 	}
   
    	
        @Test
    	public void last_10_days()
    	{
    		JSONObject request=new JSONObject();
    		String token =TokenProvider.getInstance().getToken();
    		
    		 
     		 given().
    		   contentType("application/json").
    		      body(request.toJSONString()).
    		      header("authorization"," Bearer " + token).
    		   when().
    		      get(CONTEXTPATH + "nbfcs/nbfc_onboarding?days=10").
    		   then().
    		   log().all().
    		    statusCode(200);
    	 	}
       
            @Test
        	public void date_range()
        	{
        		JSONObject request=new JSONObject();
        		String token =TokenProvider.getInstance().getToken();
        		
        		 
         		 given().
        		   contentType("application/json").
        		      body(request.toJSONString()).
        		      header("authorization"," Bearer " + token).
        		   when().
        		      get(CONTEXTPATH + "nbfcs/nbfc_onboarding?from=2022-10-01&to=2022-10-31").
        		   then().
        		   log().all().
        		    statusCode(200);
        	 	}


}
