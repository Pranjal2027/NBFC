//package Invoice_Services;

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
//import Collection_Service.Base_Class_3;
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
//
//public class TC_14_Download_Invoice extends Base_Class_3
//{
//    @BeforeClass
//	public void setup()
//	{
//		super.performLogin();
//	}
//	
//    @Test
//	public void Download_Invoice()
//	{
//		   JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		
//		   request.put("phoneNumber", "7972512892");  
//		   request.put("company", "6360c525b3eb796c37a0ee53");  
//		   request.put("type", "invoice");  
//		   
//		   given().
//		   contentType("application/json").
//		   body(request.toJSONString()).
//		   header("authorization","Bearer " + token).
//		  when().
//		      get( "https://s3.console.aws.amazon.com/s3/buckets/private-bucket-dev-xuriti?region=ap-south-1&tab=objects#").  
//		   then().log().all().
//		    statusCode(200);  
//		  
//	}
//    @Test
//	public void Download_Invoice_Pno_field_blank()
//	{
//		   JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		
//		   request.put("phoneNumber", "");  
//		   request.put("company", "6360c525b3eb796c37a0ee53");  
//		   request.put("type", "invoice");  
//		   
//		   given().
//		   contentType("application/json").
//		   body(request.toJSONString()).
//		   header("authorization","Bearer " + token).
//		  when().
//		      get( "https://s3.console.aws.amazon.com/s3/buckets/private-bucket-dev-xuriti?region=ap-south-1&tab=objects#").  
//		   then().log().all().
//		    statusCode(200);  
//		  
//	}
//    @Test
//	public void Download_Invoice_company_field_blank()
//	{
//		   JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		
//		   request.put("phoneNumber", "7972512892");  
//		   request.put("company", "");  
//		   request.put("type", "invoice");  
//		   
//		   given().
//		   contentType("application/json").
//		   body(request.toJSONString()).
//		   header("authorization","Bearer " + token).
//		  when().
//		      get( "https://s3.console.aws.amazon.com/s3/buckets/private-bucket-dev-xuriti?region=ap-south-1&tab=objects#").  
//		   then().log().all().
//		    statusCode(200);  
//		  
//	}
//    @Test
//	public void Download_Invoice_type_field_blank()
//	{
//		   JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		
//		   request.put("phoneNumber", "7972512892");  
//		   request.put("company", "6360c525b3eb796c37a0ee53");  
//		   request.put("type", "");  
//		   
//		   given().
//		   contentType("application/json").
//		   body(request.toJSONString()).
//		   header("authorization","Bearer " + token).
//		  when().
//		      get( "https://s3.console.aws.amazon.com/s3/buckets/private-bucket-dev-xuriti?region=ap-south-1&tab=objects#").  
//		   then().log().all().
//		    statusCode(200);  
//		  
//	}
//    @Test
//	public void Download_Invoice_invalid_url()
//	{
//		   JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		
//		   request.put("phoneNumber", "7972512892");  
//		   request.put("company", "6360c525b3eb796c37a0ee53");  
//		   request.put("type", "invoice");  
//		   
//		   given().
//		   contentType("application/json").
//		   body(request.toJSONString()).
//		   header("authorization","Bearer " + token).
//		  when().
//		      get( "https://s3.console.aws.amazon.com/s3/buckets/?region=ap-south-1&tab=objects#").  
//		   then().log().all().
//		    statusCode(200);  
//		  
//	}
//    @Test
//	public void Download_Invoice_all_field_blank()
//	{
//		   JSONObject request=new JSONObject();
//		   String token = TokenProvider.getInstance().getToken();
//		
//		   request.put("phoneNumber", "");  
//		   request.put("company", "");  
//		   request.put("type", "");  
//		   
//		   given().
//		   contentType("application/json").
//		   body(request.toJSONString()).
//		   header("authorization","Bearer " + token).
//		  when().
//		      get( "https://s3.console.aws.amazon.com/s3/buckets/private-bucket-dev-xuriti?region=ap-south-1&tab=objects#").  
//		   then().log().all().
//		    statusCode(200);  
//		  
//	}
//}
