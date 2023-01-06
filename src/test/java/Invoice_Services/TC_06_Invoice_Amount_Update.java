package Invoice_Services;

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
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TC_06_Invoice_Amount_Update extends Base_Class
{
	
	@DataProvider(name="invoice")
	public Object [][] invoice_amt_update()
	{
		Object [][] data= new Object[1][3];
		
		data[0][0]="5000";
		data[0][1]="5100";
		data[0][2]="ok";
		
		
		return data;
		
	}
	
	@BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
   @Test(dataProvider ="invoice")
	public void Invoice_Amount_Update(String Invoice_amt, String outstanding_amt, String comment)
	{
	   
	  JSONObject request=new JSONObject();
	  String token = TokenProvider.getInstance().getToken();
	  
	  request.put("invoice_amount", Invoice_amt);
	  request.put("outstanding_amount",outstanding_amt);
	  request.put("comment", comment);
	 
		
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      patch(CONTEXTPATH + "invoice/invoices/63b3d3de6cd25311c90d325d/63aa7ecccd025999c1fdf19a").  //invoice id  
		   then().log().all().
		    statusCode(200); 
	}
   

}
