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

public class TC_22_NBFC_Edit_by_wrong_details extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
    @Test
	public void nbfc_edit_by_wrong_id()
	{
		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		request.put("nbfc_name", "Bajaj Finance Limited");
		 request.put("nbfc_email", "pgawade2027@gmail.com");
		 request.put("nbfc_mobile", "Pranjal");
		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
		 request.put("nbfc_district", "Pune");
		 request.put("nbfc_state", "MAHARASHTRA,MH");
		 request.put("payout_discount", "10");
		 request.put("first_name", "Pranjal");
		 request.put("last_name", "Patil");
		 request.put("email", "varsha123456@gmail.com");
		 request.put("mobile_number", "8521479630");
		 request.put("user_role", "");
 		 given().
		   contentType("application/json").
		      body(request.toJSONString()).
		      header("authorization"," Bearer " + token).
		   when().
		      put(CONTEXTPATH + "nbfcs/edit-nbfc/635f5ac397c1dfb63839e66b").
		   then().
		   log().all().
		    statusCode(200);
	 	}
    @Test
   	public void nbfc_edit_By_nbfc_name_blank()
   	{
   		JSONObject request=new JSONObject();
   		String token =TokenProvider.getInstance().getToken();
   		request.put("nbfc_name", "");
   		 request.put("nbfc_email", "pgawade2027@gmail.com");
   		 request.put("nbfc_mobile", "Pranjal");
   		 request.put("nbfc_address", " Ellora Pride, Upper ground floor, opp. Chroma Showroom, near D-mart, Baner");
   		 request.put("nbfc_district", "Pune");
   		 request.put("nbfc_state", "MAHARASHTRA,MH");
   		 request.put("payout_discount", "10");
   		 request.put("first_name", "Pranjal");
   		 request.put("last_name", "Patil");
   		 request.put("email", "varsha123456@gmail.com");
   		 request.put("mobile_number", "8521479630");
   		 request.put("user_role", "");
    		 given().
   		   contentType("application/json").
   		      body(request.toJSONString()).
   		      header("authorization"," Bearer " + token).
   		   when().
   		      put(CONTEXTPATH + "nbfcs/edit-nbfc/63ca25644db3b2175e5b7397").
   		   then().
   		   log().all().
   		    statusCode(200);
   	 	}

}
