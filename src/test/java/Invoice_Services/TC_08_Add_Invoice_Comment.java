package Invoice_Services;

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

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TC_08_Add_Invoice_Comment extends Base_Class
{
	

	@DataProvider(name="invoice")
	public Object [][] add_comment()
	{
		Object [][] data= new Object[1][3];
		
		data[0][0]="63aa7ecccd025999c1fdf19a";
		data[0][1]="Trail";
		data[0][2]="63b3d3de6cd25311c90d32be";
		
		
		return data;
		
	}
	
	@BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
   @Test(dataProvider ="invoice")
	public void Invoice_Comment_Add(String userId, String comment, String invoice_id)
	{
	   
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();
	  
	  request.put("userId", userId);
	  request.put("comment",comment);
	  request.put("invoice_id", invoice_id);
	 
		
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      post(CONTEXTPATH + "invoice/add-comments").  
		   then().log().all().
		    statusCode(200); 
	}
   


}
