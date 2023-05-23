package MIS_report_nbfc;

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

import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;

public class Disbursment_Statement extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void one_day()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "ledger/mis/disbursments/disbursments_statements?nbfc_id=64411ba9aa0d19b26a569dd6&days=1").
		   then().
		   log().all().
		    statusCode(200);
	 	}
    @Test
	public void ten_day()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "ledger/mis/disbursments/disbursments_statements?nbfc_id=64411ba9aa0d19b26a569dd6&days=10").
		   then().
		   log().all().
		    statusCode(200);
	 	}
    @Test
	public void date_range()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "ledger/mis/disbursments/disbursments_statements?nbfc_id=64411ba9aa0d19b26a569dd6&from=2023-02-01&to=2023-02-28").
		   then().
		   log().all().
		    statusCode(200);
	 	}

}
