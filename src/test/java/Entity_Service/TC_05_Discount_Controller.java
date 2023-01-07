package Entity_Service;

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
import static io.restassured.RestAssured.given;

import java.io.File;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_05_Discount_Controller extends Base_Class
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void Discount_Mapping_Controller()
		{
		   
		//  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			
		  File json = new File ("/home/pranjal/Documents/eclips_project/Micro_Services_Admin_Pannel_REST_APIs/jsonfile/Jsonpost.json");
		  
			   given().
			   contentType("application/json").
			   body(json).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH + "entity/63b3cc771a63c90faa0653fb/credit-plans").   
			   then().log().all().
			   assertThat().
			    statusCode(201); 
		}
	   @Test
		public void Discount_Mapping_Controller_By_Wrong_id()
		{
		   
		//  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			
		  File json = new File ("/home/pranjal/Documents/eclips_project/Micro_Services_Admin_Pannel_REST_APIs/jsonfile/Jsonpost.json");
		  
			   given().
			   contentType("application/json").
			   body(json).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH + "entity/6368c02bae20447f4dcc2809/credit-plans").   
			   then().log().all().
			   assertThat().
			    statusCode(200); 
		}
}
