package Company_get_patch_buyer_and_Seller;

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
public class TC_3_Get_company_by_company_id extends Base_Class
{
    @BeforeClass
	public void setup()
	{
		super.performLogin();
	}

    @Test
   public void Buyer_Get_Company_By_Gst_Number()
   {
	   
	   JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
		
		given().
		   contentType("application/json").
		   body(request.toJSONString()).
		   header("authorization","Bearer " + token).
		  when().
		      get(CONTEXTPATH + "entity/entity/63b01da78bcfecd283d1e7fe").    //Company id
		   then().log().all().
		    statusCode(200);
		  
   }
}
