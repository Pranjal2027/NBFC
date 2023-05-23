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
//
//import static io.restassured.RestAssured.given;
//
//import java.io.File;
//import java.util.ArrayList;		
//import java.util.List;
//
//import org.json.simple.JSONObject;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import Collection_Service.Base_Class_3;
//import Collection_Service.TokenProvider;
//import Invoice_Services.Bill_details.Discount_summary;
//import Invoice_Services.Bill_details.Gst_summary;
//import Invoice_Services.Bill_details.Tax_summary;
//
//public class TC_18_Manual_Invoice_upload extends Base_Class_3 
//{
//	
//	JSONObject request;
//	String key = null;
//   
//	@BeforeClass
//	public void setup()
//	{
//		super.performLogin();
//		
//	}
//    
//	 @Test(enabled = false)
//	public  void  Client_Key_Genrated() throws InterruptedException
//	{
//		 List<Gst_summary> gst = new ArrayList<Gst_summary>();
//		 Bill_details.Gst_summary gs = new Bill_details.Gst_summary();
//		 gs.setCgst("615.93");
//		 gs.setSgst("615.93");
//		 gs.setIgst("50.00");
//		 gs.setTotal_tax("1231.86");
//		 
//		 gst.add(gs);
//		 
//		 List<Discount_summary> dst = new ArrayList<Discount_summary>();
//		 Bill_details.Discount_summary ds = new Bill_details.Discount_summary();
//		 ds.setCash_discount("360.20-");
//		 ds.setSpecial_discount("0.00");
//		 ds.setIn_bill_discount("0.00");
//		 ds.setTotal_discount("360.20-");
//		 
//		 dst.add(ds);
//		 
//		 List<Tax_summary> tst = new ArrayList<Tax_summary>();
//		 Bill_details.Tax_summary ts = new Bill_details.Tax_summary();
//		 ts.setTcs_based_value("8075.66");
//		 ts.setTcs_tax_value("0.00");
//		 
//		 tst.add(ts);
//		 
//		 
//		 
//		 Bill_details bd = new Bill_details();
//		 bd.setGst_summary(gst);
//		 bd.setDiscount_summary(dst);
//		 bd.setTax_summary(tst);
//		 
//		 ServiceDetailsPOJO sp = new ServiceDetailsPOJO();
//		 sp.setInvoice_amount("10000"); 
//		 sp.setInvoice_date("2022-12-12");
//		 sp.setInvoice_number("VK_30");
//		 sp.setInvoice_type("IN");
//		 sp.setBuyerGST("27AAACT7872Q2ZF");
//		 sp.setSellerGST("27AAHFC3944Q1ZV");
//		 sp.setBill_details(bd);
//		 
//		 
//		request=new JSONObject();
//		String token =TokenProvider.getInstance().getToken();
//		
//		 request.put("userID", "635f532a6b206c7eb71a151c");
//		
//	    
//		 
//		 String key =  given().
//		   contentType("application/json").
//		      body(request.toJSONString()).
//		      header("authorization"," Bearer " + token).
//		   when().
//		      post(CONTEXTPATH + "auth/gen-client-key").
//		   then().
//		   log().body().extract().response().path("clientKey");
//		
//		
//		Thread.sleep(5000);
//		
//		System.out.println(key);
//		
//		JSONObject request=new JSONObject();
//		//String token =TokenProvider.getInstance().getToken();
//		//File Jsondata = new File ("/home/tech-trail/MY-workspace/API_USER/Resources/upload.json");
//		 given().
//		   contentType("application/json").
//		      body(sp).
//		      header("x-user-id","635f532a6b206c7eb71a151c").
//		      header("x-client-key", key ).
//		      header("authorization"," Bearer " + token).
//		   when().
//		      post(CONTEXTPATH + "invoice/upload-invoice-manual").
//		   then().
//		   log().all().
//		    statusCode(200);
//		   System.out.println("Invoice uploaded");
//		   
//		 //  System.out.println(key);
//		
//		
//		 
//		
//	}
//	
//    @Test (enabled = false)
//	public void Upload_Invoice()
//	{
//
//		JSONObject request=new JSONObject();
//		String token =TokenProvider.getInstance().getToken();
//		File Jsondata = new File ("/home/tech-trail/MY-workspace/API_USER/Resources/upload.json");
//	
//		
//				
//		//System.out.println(client_key_genrated());
//		
//		/*
//		 request.put("invoice_number", "AM006");
//		 request.put("sellerGST", "27AABCB1518L1ZZ");
//	     request.put("buyerGST", "08AAACA5603Q1ZK");
//		 request.put("invoice_amount", "1000");
//		 //request.put("outstanding_amount", "1000");
//		 request.put("invoice_date", "2022-06-29");
//		// request.put("invoice_due_date", "2022-17-07");
//		 request.put("invoice_type", "IN");
//		// request.put("bill_details", "invoice bill detail");
//		*/
//		 
//		 
//		 given().
//		   contentType("application/json").
//		      body(Jsondata).
//		      header("x-user-id","635f532a6b206c7eb71a151c").
//		      header("x-client-key", key ).
//		      header("authorization"," Bearer " + token).
//		   when().
//		      post(CONTEXTPATH + "invoice/upload-invoice-manual").
//		   then().
//		   log().all().
//		    statusCode(200);
//		   System.out.println("Invoice uploaded");
//		   
//		   
//	}
//	
//}
