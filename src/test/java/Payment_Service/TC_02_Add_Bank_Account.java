package Payment_Service;

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

public class TC_02_Add_Bank_Account extends Base_Class
{
	   @BeforeClass
		public void setup()
		{
			super.performLogin();
		}
		
	   @Test
		public void add_bank_account()
		{
		   
		  JSONObject request=new JSONObject();
		  String token = TokenProvider.getInstance().getToken();
			
		  request.put("account_no", "123456789010");
		  request.put("bank_name", "SBI");
		  request.put("acc_holder", "Pranjal Gawade");
		  request.put("branch_name", "Bavdhan");
		  request.put("ifsc_code", "SBIO12345");
		  request.put("account_type", "Saving");
		   
		
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			   header("authorization","Bearer " + token).
			  when().
			      post(CONTEXTPATH + "payment/bankaccount/6425365e11f6443ab8b137b2").   
			   then().log().all().
			    statusCode(200); 
		}

}
