package Entity_Service;

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

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Auth_Services.Base_Class_3;
import Collection_Service.Base_Class;
import Collection_Service.TokenProvider;


public class TC_03_Add_Entity extends Base_Class
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void Add_Entity_All_Details()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("gstin","24AAACI1195H1ZS");
			request.put("userID","64083a043810423000115818");
			//request.put("dealerName","Vaibhav Sawale");
			request.put("companyName","ICICI BANK LIMITED");
			//request.put("company_mobile","");
			//request.put("address","JMC House, Ambawadi, Satellite,. Ahmedabad. 380006 Ahmedabad");
			//request.put("district","PUNE");
			//request.put("state","MAHARASHTRA");
			//request.put("pinCode","682303");
			request.put("admin_mobile","7972512897");
			request.put("admin_email","pranjal.gawade@gmail.com");
			request.put("pan","AASFB0646H");
			//request.put("cin","L64200MH1986PLC020479");
			//request.put("tan","06AGJOO5203Q1MO");
			//request.put("industry_type","IT");
			//request.put("annual_turnover","200000000");
		//	request.put("userID","636352a74c43e33662f7608d");
			request.put("consent_gst_defaultFlag","true");
			//request.put("interest","10");
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH + "entity/add-entity").   
			   then().log().all().
			    statusCode(200); 
		}
	   
	   @Test
		public void Company_Already_Registered()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("gstin","32AAGFE7716F1ZO");
			request.put("userid","627ab55152c5790fcf5850a4");
			request.put("dealerName","Vaibhav Sawale");
			request.put("companyName","Essa Innovations");
			request.put("address","2/398 MSM BUILDING Opp.PCBL Carbon Factory Main Gate KARIMUGAL Ernakulam Kerala");
			request.put("district","PUNE");
			request.put("state","MAHARASHTRA");
			request.put("pinCode","682303");
			request.put("admin_mobile","7972512897");
			request.put("admin_email","sawalevaibha70@gmail.com");
			request.put("pan","sdtifmoiwef");
			request.put("cin","U73200TN2022PTC156027");
			request.put("tan","NQUDTKP");
			request.put("industryType","IT");
			request.put("annual_Turnover","200000000");
			request.put("userID","636352a74c43e33662f7608d");
			request.put("consent_gst_defaultFlag","true");
			request.put("interest","10");
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH + "entity/add-entity").   
			   then().log().all().
			    statusCode(200); 
		}
	   @Test
		public void Add_Entity_GSTin_Field_Blank()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("gstin","");
			request.put("userid","627ab55152c5790fcf5850a4");
			request.put("dealerName","Vaibhav Sawale");
			request.put("companyName","Essa Innovations");
			request.put("address","2/398 MSM BUILDING Opp.PCBL Carbon Factory Main Gate KARIMUGAL Ernakulam Kerala");
			request.put("district","PUNE");
			request.put("state","MAHARASHTRA");
			request.put("pinCode","682303");
			request.put("admin_mobile","7972512897");
			request.put("admin_email","sawalevaibha70@gmail.com");
			request.put("pan","sdtifmoiwef");
			request.put("cin","U73200TN2022PTC156027");
			request.put("tan","NQUDTKP");
			request.put("industryType","IT");
			request.put("annual_Turnover","200000000");
			request.put("userID","636352a74c43e33662f7608d");
			request.put("consent_gst_defaultFlag","true");
			request.put("interest","10");
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH + "entity/add-entity").   
			   then().log().all().
			    statusCode(200); 
		}
	   @Test
		public void Add_Entity_All_Fields_Blank()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			request.put("gstin","");
			request.put("userid","");
			request.put("dealerName","e");
			request.put("companyName","");
			request.put("address","");
			request.put("district","");
			request.put("state","");
			request.put("pinCode","");
			request.put("admin_mobile","");
			request.put("admin_email","");
			request.put("pan","");
			request.put("cin","");
			request.put("tan","");
			request.put("industryType","");
			request.put("annual_Turnover","");
			request.put("userID","");
			request.put("consent_gst_defaultFlag","");
			request.put("interest","");
			
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH + "entity/add-entity").   
			   then().log().all().
			    statusCode(200); 
		}
}
