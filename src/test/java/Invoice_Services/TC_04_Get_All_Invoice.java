//package Invoice_Services;
//
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import Collection_Service.Base_Class;
//import Collection_Service.TokenProvider;
//
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import static io.restassured.RestAssured.given;
//
//import org.json.simple.JSONObject;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//public class TC_04_Get_All_Invoice extends Base_Class
//{
//	@BeforeClass
//	public void setup()
//	{
//		super.performLogin();
//	}
//	
//   @Test
//	public void Get_Invoice_All() throws InterruptedException
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
//		      get(CONTEXTPATH + "invoice/invoices"). 
//		   then().log().all().
//		    statusCode(200); 
//		   
//	}
//   
//}
