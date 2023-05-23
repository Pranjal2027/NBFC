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
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;

public class Reconcilation_Summary extends Base_Class
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
		      get(CONTEXTPATH + "nbfcs/mis_payment?days=1").
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
    		      get(CONTEXTPATH + "nbfcs/mis_payment?days=10").
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
        		      get(CONTEXTPATH + "nbfcs/mis_payment?from=2023-03-03&to=2023-03-31").
        		   then().
        		   log().all().
        		    statusCode(200);
        	 	}


}
