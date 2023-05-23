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

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_07_NBFC_get_Mapped extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void nbfc_get_mapped()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		 request.put("buyer_id", BUYERID);
				 request.put("seller_id", SELLERID);
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "nbfcs/nbfc-detail/" + NBFCID).
		   then().
		   log().all().
		    statusCode(200);
	 	}
    @Test
   	public void nbfc_get_mapped_Bid_blank()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		 request.put("buyer_id","" );
   				 request.put("seller_id", SELLERID);
   		 
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      get(CONTEXTPATH + "nbfcs/nbfc-detail/" + NBFCID).
   		   then().
   		   log().all().
   		    statusCode(200);
   	 	}
    @Test
   	public void nbfc_get_mapped_sid_blank()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		 request.put("buyer_id", BUYERID);
   				 request.put("seller_id", "");
   		 
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      get(CONTEXTPATH + "nbfcs/nbfc-detail/" + NBFCID).
   		   then().
   		   log().all().
   		    statusCode(200);
   	 	}
    @Test
   	public void nbfc_get_mapped_vice_versa()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		 request.put("buyer_id", SELLERID);
   				 request.put("seller_id", BUYERID);
   		 
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      get(CONTEXTPATH + "nbfcs/nbfc-detail/" + NBFCID).
   		   then().
   		   log().all().
   		    statusCode(200);
   	 	}
    
}
