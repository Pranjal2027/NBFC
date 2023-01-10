package Collection_Service;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
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



public class TC_03_Update_Single_Invoice extends Base_Class
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void Update_Invoice()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("collection_status","In-Progress");
			request.put("collection_advisor_id","6360bb3697e5837566e2db38");
			request.put("comment","payment done");
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      patch(CONTEXTPATH + "collection/invoices/63b571f4b8018b0ada27c434").   
			   then().log().all().
			    statusCode(200); 
		}
	   @Test
		public void Update_Invoice_Collection_Status_Blank()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("collection_status","");
			request.put("collection_advisor_id","6360bb3697e5837566e2db38");
			request.put("comment","payment done");
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      patch(CONTEXTPATH + "collection/invoices/6387eebcdb8d58f2d01d4b68").   
			   then().log().all().
			    statusCode(200); 
		}
	   @Test
		public void Update_Invoice_Collection_Advisor_Id_Blank()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("collection_status","In-Progress");
			request.put("collection_advisor_id","");
			request.put("comment","payment done");
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      patch(CONTEXTPATH + "collection/invoices/6387eebcdb8d58f2d01d4b68").   
			   then().log().all().
			    statusCode(200); 
		}
	   @Test
		public void Update_Invoice_Comment_Blank()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("collection_status","In-Progress");
			request.put("collection_advisor_id","6360bb3697e5837566e2db38");
			request.put("comment","");
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      patch(CONTEXTPATH + "collection/invoices/6387eebcdb8d58f2d01d4b68").   
			   then().log().all().
			    statusCode(200); 
		}
	   @Test
		public void Update_Invoice_All_Fields_Blank()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("collection_status","");
			request.put("collection_advisor_id","");
			request.put("comment","");
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      patch(CONTEXTPATH + "collection/invoices/6387eebcdb8d58f2d01d4b68").   
			   then().log().all().
			    statusCode(200); 
		}
	   
}
