package Invoice_summary;

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

public class TC_28_Get_companies extends Base_Class_2
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void Get_All_Invoice()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("phoneNumber", "7972512892");  
		   request.put("company", "6425365e11f6443ab8b137b2");  
		   request.put("type", "invoice");  
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/wa?type=invoice&phoneNumber=9763926686&company=6425365e11f6443ab8b137b2").  
		   then().log().all().
		    statusCode(200);  
		  
	}
    @Test
	public void Get_All_Invoice_by_MNo_wrong()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("phoneNumber", "7972512892");  
		   request.put("company", "6360c525b3eb796c37a0ee53");  
		   request.put("type", "invoice");  
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/wa?type=invoice&phoneNumber=7972512892&company=63b01da78bcfecd283d1e7fe").  
		   then().log().all().
		    statusCode(200);  
		  
	}
    @Test
	public void Get_All_Invoice_by_company_id_wrong()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("phoneNumber", "7972512892");  
		   request.put("company", "6360c525b3eb796c37a0ee53");  
		   request.put("type", "invoice");  
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/wa?type=invoice&phoneNumber=7972512892&company=63b01da78bcfecd283d1e7fe").  
		   then().log().all().
		    statusCode(200);  
		  
	}
    @Test
	public void Get_All_Invoice_by_Pno_blank()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("phoneNumber", "7972512892");  
		   request.put("company", "6360c525b3eb796c37a0ee53");  
		   request.put("type", "invoice");  
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/wa?type=invoice&phoneNumber=9763926686&company=63b01da78bcfecd283d1e7fe").  
		   then().log().all().
		    statusCode(200);  
		  
	}
    @Test
	public void Get_All_Invoice_by_compnay_field_blank()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("phoneNumber", "7972512892");  
		   request.put("company", "6360c525b3eb796c37a0ee53");  
		   request.put("type", "invoice");  
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/wa?type=invoice&phoneNumber=9763926686&company=63b01da78bcfecd283d1e7fe").  
		   then().log().all().
		    statusCode(200);  
		  
	}
    @Test
	public void Get_All_Invoice_by_type_field_blank()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("phoneNumber", "7972512892");  
		   request.put("company", "6360c525b3eb796c37a0ee53");  
		   request.put("type", "invoice");  
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/wa?type=invoice&phoneNumber=9763926686&company=63b01da78bcfecd283d1e7fe").  
		   then().log().all().
		    statusCode(200);  
		  
	}
    @Test
	public void Get_All_Invoice_by_all_fields_blank()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("phoneNumber", "7972512892");  
		   request.put("company", "6360c525b3eb796c37a0ee53");  
		   request.put("type", "invoice");  
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/wa?type=invoice&phoneNumber=9763926686&company=63b01da78bcfecd283d1e7fe").  
		   then().log().all().
		    statusCode(200);  
		  
	}
    @Test
	public void Get_All_Invoice_by_wrong_pno_in_put()
	{
		   JSONObject request=new JSONObject();
		   String token = TokenProvider.getInstance().getToken();
		
		   request.put("phoneNumber", "7972512892");  
		   request.put("company", "6360c525b3eb796c37a0ee53");  
		   request.put("type", "invoice");  
		   
		   given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "invoice/wa?type=invoice&phoneNumber=9763926686&company=63b01da78bcfecd283d1e7fe").  
		   then().log().all().
		    statusCode(200);  
		  
	}
}


