package com.xuriti.api_add_create_plan;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.xuriti.api_admin_login.*;

import io.restassured.response.Response;

public class TC_01_create_plan_add_post extends Base_Class
{  
     @BeforeClass
	public void setup()
	{
		super.performLogin();
	}
	
     @Test
	public  void test_1_add_create_plan()
	{
//		JSONObject request=new JSONObject();
		String token =TokenProvider.getInstance().getToken();
//		 request.put("plan_name", "Plan2");
//		 request.put("credit_period", "30");
//		 request.put("payment_interval", "3");
//		 request.put("default_plan", "false");
//		 
//		 Map<String,Object> sl = new HashMap<>();
	
//		 DiscountSlab[] slabs = new DiscountSlab[3];
//		 slabs[0] = new DiscountSlab(1, 0, 10, 5);
//		 slabs[1] = new DiscountSlab(2, 11, 20, 3);
//		 slabs[2] = new DiscountSlab(3, 21, 30, 2);
//		 
     	// JSONObject jo=new JSONObject();
//	     request.put("discount_slabs",slabs);
		 //jo.put("discount_slabs", slabs);
	     
	     //File json=new File("/home/varsha/Documents/Testing/Micro_Services_Admin_Pannel_REST_API/jsonfile/Jsonpost.json");
		 
		File json=new File("/home/varsha/Documents/Testing/Micro_Services_Admin_Pannel_REST_APIs/jsonfile");
		
//		 System.out.println("Result :" + sl);
             given().
		   contentType("application/json").
		      body(json).
		      header("authorization"," Bearer " + token).
		   when().
		      post(CONTEXTPATH + "entity/62a8548c21d5976aea2f1787/credit-plans").
	       then().
		   log().all().
		   assertThat().statusCode(201);
		//response.statusCode();
	}
     
//    public static void main(String args[])  //static method  
//     {  
//     System.out.println("Static method:==================");  
//     TC_01_create_plan_add_post obj = new TC_01_create_plan_add_post();
//     obj.test_1_add_create_plan();
//     }  
}

//class DiscountSlab{
//	public int getSlab() {
//		return slab;
//	}
//
//	public void setSlab(int slab) {
//		this.slab = slab;
//	}
//
//	public int getFrom() {
//		return from;
//	}
//
//	public void setFrom(int from) {
//		this.from = from;
//	}
//
//	public int getTo() {
//		return to;
//	}
//
//	public void setTo(int to) {
//		this.to = to;
//	}
//
//	public float getDiscount() {
//		return discount;
//	}
//
//	public void setDiscount(float discount) {
//		this.discount = discount;
//	}
//
//	int slab;
//	int from;
//	int to;
//	float discount;
//	
//	public DiscountSlab(int slab, int from, int to, float discount) {
//		super();
//		this.slab = slab;
//		this.from = from;
//		this.to = to;
//		this.discount = discount;
//	}	
//}