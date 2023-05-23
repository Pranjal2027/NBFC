package NBFC;

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
import org.testng.annotations.Test;

public class TC_26_NBFC_disbursment extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void add_disbursbment()
	{
    	
		JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
		 request.put("invoice","2233jj");
		 request.put("transaction_id","fqq2222");
		 request.put("transaction_date","2022/11/7");
		 request.put("amount","1000000");
		 request.put("UTR_id","f11677888");
		 request.put("beneficiary_gst","37AADCS0472N2Z0");
		 request.put("remarks","ok");
		 
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/" + NBFCID + "/add_disbursement").
		   then().
		   log().all().
		    statusCode(200);
    	
        }
    @Test
    public void add_disbursbment_all_blank()
	{
    	
		JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
		 request.put("invoice","");
		 request.put("transaction_id","");
		 request.put("transaction_date","");
		 request.put("amount","");
		 request.put("UTR_id","");
		 request.put("beneficiary_gst","");
		 request.put("remarks","");
		 
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/6360ef37c3ab5ce2be575112/add_disbursement").
		   then().
		   log().all().
		    statusCode(200);
    	
        }
    @Test
    public void add_disbursbment_invoiceno_field_blank()
	{
    	
		JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
		 
	request.put("invoice","");
	 request.put("transaction_id","fqq2222");
	 request.put("transaction_date","2022/11/7");
	 request.put("amount","1000000");
	 request.put("UTR_id","f11677888");
	 request.put("beneficiary_gst","37AADCS0472N2Z0");
	 request.put("remarks","ok"); 
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/6360ef37c3ab5ce2be575112/add_disbursement").
		   then().
		   log().all().
		    statusCode(200);
    	
        }
    @Test
    public void add_disbursbment_transactionid_field_blank()
	{
    	
		JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
		 
	request.put("invoice","2233jj");
	 request.put("transaction_id","");
	 request.put("transaction_date","2022/11/7");
	 request.put("amount","1000000");
	 request.put("UTR_id","f11677888");
	 request.put("beneficiary_gst","37AADCS0472N2Z0");
	 request.put("remarks","ok"); 
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/6360ef37c3ab5ce2be575112/add_disbursement").
		   then().
		   log().all().
		    statusCode(200);
    	
        }
    @Test
    public void add_disbursbment_amount_field_blank()
	{
    	
		JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
		 
	request.put("invoice","2233jj");
	 request.put("transaction_id","fqq2222");
	 request.put("transaction_date","2022/11/7");
	 request.put("amount","");
	 request.put("UTR_id","f11677888");
	 request.put("beneficiary_gst","37AADCS0472N2Z0");
	 request.put("remarks","ok"); 
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/6360ef37c3ab5ce2be575112/add_disbursement").
		   then().
		   log().all().
		    statusCode(200);
    	
        }
    @Test
    public void add_disbursbment_UTR_id_field_blank()
	{
    	
		JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
		 
	request.put("invoice","2233jj");
	 request.put("transaction_id","fqq2222");
	 request.put("transaction_date","2022/11/7");
	 request.put("amount","1000000");
	 request.put("UTR_id","");
	 request.put("beneficiary_gst","37AADCS0472N2Z0");
	 request.put("remarks","ok"); 
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/6360ef37c3ab5ce2be575112/add_disbursement").
		   then().
		   log().all().
		    statusCode(200);
    	
        }
    @Test
    public void add_disbursbment_beneficiary_gst_field_blank()
	{
    	
		JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
		 
	request.put("invoice","2233jj");
	 request.put("transaction_id","fqq2222");
	 request.put("transaction_date","2022/11/7");
	 request.put("amount","1000000");
	 request.put("UTR_id","f11677888");
	 request.put("beneficiary_gst","");
	 request.put("remarks","ok"); 
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/6360ef37c3ab5ce2be575112/add_disbursement").
		   then().
		   log().all().
		    statusCode(200);
    	
        }
    @Test
    public void add_disbursbment_remarks_field_blank()
	{
    	
		JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
		 
	request.put("invoice","2233jj");
	 request.put("transaction_id","fqq2222");
	 request.put("transaction_date","2022/11/7");
	 request.put("amount","1000000");
	 request.put("UTR_id","f11677888");
	 request.put("beneficiary_gst","37AADCS0472N2Z0");
	 request.put("remarks",""); 
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/6360ef37c3ab5ce2be575112/add_disbursement").
		   then().
		   log().all().
		    statusCode(200);
    	
        }
    @Test
    public void add_disbursbment_amount_SC_field_blank()
	{
    	
		JSONObject request=new JSONObject();
	String token =TokenProvider.getInstance().getToken();
		 
	request.put("invoice","2233jj");
	 request.put("transaction_id","fqq2222");
	 request.put("transaction_date","2022/11/7");
	 request.put("amount","10000#@");
	 request.put("UTR_id","f11677888");
	 request.put("beneficiary_gst","37AADCS0472N2Z0");
	 request.put("remarks","ok"); 
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "nbfcs/6360ef37c3ab5ce2be575112/add_disbursement").
		   then().
		   log().all().
		    statusCode(200);
    	
        }
}
