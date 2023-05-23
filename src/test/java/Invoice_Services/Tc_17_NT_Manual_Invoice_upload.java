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

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Collection_Service.Base_Class_2;
import Collection_Service.Base_Class_3;
import Collection_Service.TokenProvider;
import Invoice_Services.Bill_details.Discount_summary;
import Invoice_Services.Bill_details.Gst_summary;
import Invoice_Services.Bill_details.Tax_summary;

public class Tc_17_NT_Manual_Invoice_upload extends Base_Class_2
{
	JSONObject request;

    @BeforeClass
	public void setup()
	{
		super.performLogin();
		
	}
    
	 @Test 
	public  void  Client_Key_Genrated() throws InterruptedException 
	{
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
		 
		 
		
		 
		 
		request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 request.put("userID", "64083a043810423000115818");
		
	    
		 
		String key =  given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "auth/gen-client-key").
		   then().
		   log().body().extract().response().path("clientKey");
		
		
		Thread.sleep(5000);
		
		System.out.println(key);
		
		JSONObject request=new JSONObject();
		String token1 =TokenProvider.getInstance().getToken();
		//File Jsondata = new File ("/home/pranjal/Documents/eclips_project/Micro_Services_Admin_Pannel_REST_APIs/Invoice_manual.json");
		  request.put("invoice_number","P_00000");
		  request.put("buyerGST","07AABCB9274B1ZU");
		  request.put("sellerGST","29AAKCM9020F1ZC");
		  request.put("invoice_type","IN");
		  request.put("invoice_amount","1000");
		  request.put("invoice_date","2023-01-10");
		  request.put("total_tax_amount","500");
		
		given().
		    contentType("application/json").
		    body(request.toJSONString()).
		      header("x-user-id","64083a043810423000115818").
		      header("x-client-key", key ).
		      header("authorization"," Bearer " + token1).
		   when().
		      post(CONTEXTPATH + "invoice/upload-invoice-manual").
		   then().
		   log().all().
		    statusCode(200);
		   System.out.println("Invoice uploaded");
		   
		 //  System.out.println(key);
		
		
		 
		
	}
	
  
	
}
