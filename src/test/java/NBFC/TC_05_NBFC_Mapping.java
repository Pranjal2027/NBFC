package NBFC;

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

import java.util.Arrays;
import java.util.LinkedHashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_05_NBFC_Mapping extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void nbfc_map()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("companies", Arrays.asList(new LinkedHashMap<String, Object>(){
		{
	        put("buyer_id",BUYERID);
	        put("seller_id", SELLERID);
	    }
			
				}));
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/add-buyer/"+ NBFCID + "/" + USERID).//nbfcid/createdby
		   then().
		   log().all().
		    statusCode(200);
	 	}
    @Test
	public void nbfc_map_buyer_id_same()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("companies", Arrays.asList(new LinkedHashMap<String, Object>(){
		{
	        put("buyer_id",BUYERID);
	        put("seller_id", BUYERID);
	    }
			
				}));
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/add-buyer/"+ NBFCID + "/" + USERID).//nbfcid/createdby
		   then().
		   log().all().
		    statusCode(400);
	 	}

    @Test
	public void nbfc_map_Same_seller_id()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("companies", Arrays.asList(new LinkedHashMap<String, Object>(){
		{
	        put("buyer_id",SELLERID);
	        put("seller_id", SELLERID);
	    }
			
				}));
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/add-buyer/"+ NBFCID + "/" + USERID).//nbfcid/createdby
		   then().
		   log().all().
		    statusCode(400);
	 	}
    @Test
   	public void nbfc_map_replace_seller_id_to_buyer_id_vice_versa()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		request.put("companies", Arrays.asList(new LinkedHashMap<String, Object>(){
   		{
   	        put("buyer_id",SELLERID);
   	        put("seller_id", BUYERID);
   	    }
   			
   				}));
   		
   		 
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      post(CONTEXTPATH + "nbfcs/add-buyer/"+ NBFCID + "/" + USERID).//nbfcid/createdby
   		   then().
   		   log().all().
   		    statusCode(400);
   	 	}
	}

