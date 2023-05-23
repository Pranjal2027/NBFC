package Mis_Report_invoices;

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
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;

public class invoice_reject extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void one_day_buyer_id()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "ledger/mis/invoices/invoicesrejected?days=1&buyer_id=63bfc59a321eee483f41dae2&status=Rejected").
		   then().
		   log().all().
		    statusCode(202);
	 	}
   
    	
        @Test
    	public void last_10_days_buyer_id()
    	{
    		JSONObject request=new JSONObject();
    		String token =TokenProvider.getInstance().getToken();
    		
    		 
     		 given().
    		   contentType("application/json").
    		      body(request.toJSONString()).
    		      header("authorization"," Bearer " + token).
    		   when().
    		      get(CONTEXTPATH + "ledger/mis/invoices/invoicesrejected?days=10&buyer_id=63bfc59a321eee483f41dae2&status=Rejected").
    		   then().
    		   log().all().
    		    statusCode(202);
    	 	}
       
            @Test
        	public void date_range_buyer_id()
        	{
        		JSONObject request=new JSONObject();
        		String token =TokenProvider.getInstance().getToken();
        		
        		 
         		 given().
        		   contentType("application/json").
        		      body(request.toJSONString()).
        		      header("authorization"," Bearer " + token).
        		   when().
        		      get(CONTEXTPATH + "ledger/mis/invoices/invoicesrejected?from=2023-01-01&to=2023-01-31&buyer_id=63bfc59a321eee483f41dae2&status=Rejected").
        		   then().
        		   log().all().
        		    statusCode(202);
        	 	}

            @Test
        	public void one_day_seller_id()
        	{
        		JSONObject request=new JSONObject();
        		String token =TokenProvider.getInstance().getToken();
        		
        		 
         		 given().
        		   contentType("application/json").
        		      body(request.toJSONString()).
        		      header("authorization"," Bearer " + token).
        		   when().
        		      get(CONTEXTPATH + "ledger/mis/invoices/invoicesrejected?days=1&seller_id=63bfc59a321eee483f41dae2&status=Rejected").
        		   then().
        		   log().all().
        		    statusCode(202);
        	 	}
           
            	
                @Test
            	public void last_10_days_seller_id()
            	{
            		JSONObject request=new JSONObject();
            		String token =TokenProvider.getInstance().getToken();
            		
            		 
             		 given().
            		   contentType("application/json").
            		      body(request.toJSONString()).
            		      header("authorization"," Bearer " + token).
            		   when().
            		      get(CONTEXTPATH + "ledger/mis/invoices/invoicesrejected?days=10&seller_id=63bfc59a321eee483f41dae2&status=Rejected").
            		   then().
            		   log().all().
            		    statusCode(202);
            	 	}
               
                    @Test
                	public void date_range_seller_id()
                	{
                		JSONObject request=new JSONObject();
                		String token =TokenProvider.getInstance().getToken();
                		
                		 
                 		 given().
                		   contentType("application/json").
                		      body(request.toJSONString()).
                		      header("authorization"," Bearer " + token).
                		   when().
                		      get(CONTEXTPATH + "ledger/mis/invoices/invoicesrejected?from=2023-01-01&to=2023-01-31&seller_id=63bfc59a321eee483f41dae2&status=Rejected").
                		   then().
                		   log().all().
                		    statusCode(202);
                	 	}


}
