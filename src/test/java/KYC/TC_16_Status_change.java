//package KYC;
//
//import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
//import static io.restassured.RestAssured.given;
//
//import java.util.Arrays;
//import java.util.LinkedHashMap;
//
//import org.json.simple.JSONObject;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//import Collection_Service.Base_Class_5;
//import Collection_Service.TokenProvider;
//
//public class TC_16_Status_change extends Base_Class_5
//{
//	   @BeforeClass
//		public void setup()
//		{
//			super.performLogin();
//		}
//		
//	   @Test
//		public void Status_change()
//		{
//		   
//		  JSONObject request=new JSONObject();
//		  String token = TokenProvider.getInstance().getToken();
//		  request.put("gstin", "07AABCF8078M1Z3");
//		  request.put("panDetails", Arrays.asList(new LinkedHashMap<String, Object>(){
//				{
//			        put("comment", "ok");
//			        put("status", "Approved");
//			    }						}));
//		  request.put("FinancialDetails", Arrays.asList(new LinkedHashMap<String, Object>(){
//				{
//			        put("comment", "ok");
//			        put("status", "Approved");
//			    }						}));
//		  request.put("BusinessProof", Arrays.asList(new LinkedHashMap<String, Object>(){
//				{
//			        put("comment", "ok");
//			        put("status", "Approved");
//			    }						}));
//		  request.put("OwnershipProof", Arrays.asList(new LinkedHashMap<String, Object>(){
//				{
//			        put("comment", "ok");
//			        put("status", "Approved");
//			    }						}));
//		  request.put("VintageProof", Arrays.asList(new LinkedHashMap<String, Object>(){
//				{
//			        put("comment", "ok");
//			        put("status", "Approved");
//			    }						}));
//		  request.put("StoreImages", Arrays.asList(new LinkedHashMap<String, Object>(){
//				{
//			        put("comment", "ok");
//			        put("status", "Approved");
//			    }						}));
//		  request.put("BankStatementDetails", Arrays.asList(new LinkedHashMap<String, Object>(){
//				{
//			        put("comment", "ok");
//			        put("status", "Approved");
//			    }						}));
//		  request.put("PartnershipDetails", Arrays.asList(new LinkedHashMap<String, Object>(){
//				{
//			        put("comment", "ok");
//			        put("status", "Approved");
//			    }						}));
//		  request.put("GstDetails", Arrays.asList(new LinkedHashMap<String, Object>(){
//				{
//			        put("comment", "ok");
//			        put("status", "Approved");
//			    }						}));
//		  request.put("ChequeImages", Arrays.asList(new LinkedHashMap<String, Object>(){
//				{
//			        put("comment", "ok");
//			        put("status", "Approved");
//			    }						}));
//			
//			   given().
//			   contentType("application/json").
//			   body(request.toJSONString()).
//			   header("authorization","Bearer " + token).
//			  when().
//			      patch(CONTEXTPATH + "kyc/63bfc59a321eee483f41dae2/status").   
//			   then().log().all().
//			    statusCode(200); 
//		}
//
//
//
//}
