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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class;
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

public class TC_03_Search_Invoice_By_Buyer_Id_type extends Base_Class
{
   @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
   @Test
	public void Get_Invoice_By_Buyer_Id()
	{
	   
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();
		
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/search-invoice/6425365e11f6443ab8b137b2/buyer").  //company id  
		   then().log().all().
		    statusCode(200); 
	}

//   @Test
//	public void Get_Invoice_By_Buyer_Id_company_id_wrong()
//	{
//	   
//	  JSONObject request=new JSONObject();
//	  String token = TokenProvider.getInstance().getToken();
//		
//		   given().
//		   contentType("application/json").
//		   body(request.toJSONString()).
//		   header("authorization","Bearer " + token).
//		  when().
//		      get(CONTEXTPATH + "invoice/search-invoice/63bfc59a321eee463f41dae2/buyer").  //company id  
//		   then().log().all().
//		    statusCode(202); 
//	}

   @Test
	public void Get_Invoice_By_Buyer_Id_wrong_url()
	{
	   
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();
		
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/search-invoice/6425365e11f6443ab8b137b2/buyer").  //company id  
		   then().log().all().
		    statusCode(200); 
	}
   @Test
  	public void Get_Invoice_By_Buyer_Id_url_seller_id()
  	{
  	   
  	  JSONObject request=new JSONObject();
  	  String token = TokenProvider.getInstance().getToken();
  		
  		   given().
  		   contentType("application/json").
  		   body(request.toJSONString()).
  		   header("authorization","Bearer " + token).
  		  when().
  		      get(CONTEXTPATH + "invoice/search-invoice/6425365e11f6443ab8b137b2/buyer").  //company id  
  		   then().log().all().
  		    statusCode(200); 
  	}
}
