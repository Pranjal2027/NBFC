package Credit_Note;

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
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_2;
import Collection_Service.TokenProvider;

public class TC_02_Credit_note_manual extends Base_Class_2
{
	@BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
   @Test
	public void CN_manually()
	{
	   
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();
		
	  request.put("buyer", "63bfc59a321eee483f41dae2");
	  request.put("seller", "63bfc5ba321eee483f41db3b");
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/credit-note/63ce6cf9201144e99525c879?buyer=63bfc59a321eee483f41dae2&seller=63bfc5ba321eee483f41db3b").   
		   then().log().all().
		    statusCode(200); 
	}
   @Test
  	public void CN_manually_seller_id_invalid()
  	{
  	   
  	  JSONObject request=new JSONObject();
  	  String token = TokenProvider.getInstance().getToken();
  		
  	  request.put("buyer", "63bfc59a321eee483f41dae2");
  	  request.put("seller", "63be7df2ddd7819436644cb8");
  		   given().
  		   contentType("application/json").
  		   body(request.toJSONString()).
  		   header("authorization","Bearer " + token).
  		  when().
  		      get(CONTEXTPATH + "invoice/credit-note/63ce6cf9201144e99525c879?buyer=63bfc59a321eee483f41dae2&seller=63be7df2ddd7819436644cb8").   
  		   then().log().all().
  		    statusCode(200); 
  	}
   @Test
	public void CN_manually_buyer_id_invalid()
	{
	   
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();
		
	  request.put("buyer", "63be7df2ddd7819436644cb8");
	  request.put("seller", "63bfc5ba321eee483f41db3b");
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/credit-note/63ce6cf9201144e99525c879?buyer=63be7df2ddd7819436644cb8&seller=63bfc5ba321eee483f41db3b").   
		   then().log().all().
		    statusCode(200); 
	}

@Test
	public void CN_manually_buyer_id_Seller_id_blank()
	{
	   
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();
		
	  request.put("buyer", "63be7df2ddd7819436644cb8");
	  request.put("seller", "63bfc5ba321eee483f41db3b");
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/credit-note/63ce6cf9201144e99525c879").   
		   then().log().all().
		    statusCode(200); 
	}

@Test
	public void CN_manually_credit_plan_id_invalid()
	{
	   
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();
		
	  request.put("buyer", "63be7df2ddd7819436644cb8");
	  request.put("seller", "63bfc5ba321eee483f41db3b");
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/credit-note/63aaa6f0563a0634e93562b9?buyer=63be7df2ddd7819436644cb8&seller=63bfc5ba321eee483f41db3b").   
		   then().log().all().
		    statusCode(200); 
	}
}
