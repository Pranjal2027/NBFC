package NBFC2;

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
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_24_NBFC_reconcellation_one_field_blank extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void add_reconcellation_status_field_blank()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("status", "");
		 request.put("transaction_id", "u76hhhhs77888");
		 request.put("invoice", "1009");
		 request.put("batch_id", "rree332eee32224");
		 request.put("invoice_amount", "10000");
		 request.put("transaction_response_time", "2022/11/09");
		 request.put("paid", "true");
		 request.put("gst_amount","123");
		 request.put("payable_amount","1200");
		 request.put("utr_id","f11677888");
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/635b674d97c1dfb63839dc6d/nbfc-reconcellation").
		   then().
		   log().all().
		    statusCode(200);
	 	}
    @Test
   	public void add_reconcellation_transaction_id_field_blank()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		 request.put("status", "Paid");
   				 request.put("transaction_id", "");
   				 request.put("invoice", "1009");
   				 request.put("batch_id", "rree332eee32224");
   				 request.put("invoice_amount", "10000");
   				 request.put("transaction_response_time", "2022/11/09");
   				 request.put("paid", "true");
   				 request.put("gst_amount","123");
   				 request.put("payable_amount","1200");
   				 request.put("utr_id","f11677888");
   		 
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      post(CONTEXTPATH + "nbfcs/635b674d97c1dfb63839dc6d/nbfc-reconcellation").
   		   then().
   		   log().all().
   		    statusCode(200);
   	 	}
   
    @Test
   	public void add_reconcellation_batch_id_field_blank()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		 request.put("status", "Paid");
   				 request.put("transaction_id", "u76hhhhs77888");
   				 request.put("invoice", "1009");
   				 request.put("batch_id", "");
   				 request.put("invoice_amount", "10000");
   				 request.put("transaction_response_time", "2022/11/09");
   				 request.put("paid", "true");
   				 request.put("gst_amount","123");
   				 request.put("payable_amount","1200");
   				 request.put("utr_id","f11677888");
   		 
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      post(CONTEXTPATH + "nbfcs/635b674d97c1dfb63839dc6d/nbfc-reconcellation").
   		   then().
   		   log().all().
   		    statusCode(200);
   	 	}
    @Test
   	public void add_reconcellation_invoice_amount_field_blank()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		 request.put("status", "Paid");
   				 request.put("transaction_id", "u76hhhhs77888");
   				 request.put("invoice", "1009");
   				 request.put("batch_id", "rree332eee32224");
   				 request.put("invoice_amount", "");
   				 request.put("transaction_response_time", "2022/11/09");
   				 request.put("paid", "true");
   				 request.put("gst_amount","123");
   				 request.put("payable_amount","1200");
   				 request.put("utr_id","f11677888");
   		 
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      post(CONTEXTPATH + "nbfcs/635b674d97c1dfb63839dc6d/nbfc-reconcellation").
   		   then().
   		   log().all().
   		    statusCode(200);
   	 	}
    
    @Test
   	public void add_reconcellation_gst_amount_field_blank()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		 request.put("status", "Paid");
   				 request.put("transaction_id", "u76hhhhs77888");
   				 request.put("invoice", "1009");
   				 request.put("batch_id", "rree332eee32224");
   				 request.put("invoice_amount", "10000");
   				 request.put("transaction_response_time", "2022/11/09");
   				 request.put("paid", "true");
   				 request.put("gst_amount","");
   				 request.put("payable_amount","1200");
   				 request.put("utr_id","f11677888");
   		 
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      post(CONTEXTPATH + "nbfcs/635b674d97c1dfb63839dc6d/nbfc-reconcellation").
   		   then().
   		   log().all().
   		    statusCode(200);
   	 	}
    @Test
   	public void add_reconcellation_payable_amount_field_blank()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		 request.put("status", "Paid");
   				 request.put("transaction_id", "u76hhhhs77888");
   				 request.put("invoice", "1009");
   				 request.put("batch_id", "rree332eee32224");
   				 request.put("invoice_amount", "10000");
   				 request.put("transaction_response_time", "2022/11/09");
   				 request.put("paid", "true");
   				 request.put("gst_amount","123");
   				 request.put("payable_amount","");
   				 request.put("utr_id","f11677888");
   		 
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      post(CONTEXTPATH + "nbfcs/635b674d97c1dfb63839dc6d/nbfc-reconcellation").
   		   then().
   		   log().all().
   		    statusCode(200);
   	 	}
    @Test
   	public void add_reconcellation_utr_id_field_blank()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		 request.put("status", "Paid");
   				 request.put("transaction_id", "u76hhhhs77888");
   				 request.put("invoice", "1009");
   				 request.put("batch_id", "rree332eee32224");
   				 request.put("invoice_amount", "10000");
   				 request.put("transaction_response_time", "2022/11/09");
   				 request.put("paid", "true");
   				 request.put("gst_amount","123");
   				 request.put("payable_amount","1200");
   				 request.put("utr_id","");
   		 
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      post(CONTEXTPATH + "nbfcs/635b674d97c1dfb63839dc6d/nbfc-reconcellation").
   		   then().
   		   log().all().
   		    statusCode(200);
   	 	}
}
