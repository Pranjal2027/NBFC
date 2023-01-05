package Ledger_service;

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

import Auth_Services.Base_Class_3;
import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;


public class TC_01_calender extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void calender_no_data()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("month","08");
		request.put("year","2022");
		request.put("buyer","62e421a17880367c03e9fd14");
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "ledger/companies/calendar?buyer=62e421a17880367c03e9fd14&month=08&year=2022").
		   then().
		   log().all().
		    statusCode(200);
	 	}
    @Test
	public void calender()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("month","08");
		request.put("year","2022");
		request.put("buyer","635a43e10f3f22b2a90ebd21");
		 
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      get(CONTEXTPATH + "ledger/companies/calendar?buyer=635a43e10f3f22b2a90ebd21&month=10&year=2022").
		   then().
		   log().all().
		    statusCode(200);
	 	}
}
