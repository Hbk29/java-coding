package APITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Api2 {

	//R R R R
	@Test
	public void api() {
		RestAssured.baseURI=("https://letcode.in/alert/");
		
		RequestSpecification httprqst=RestAssured.given();
		
		Response resp=httprqst.get();
		
		ResponseBody body=resp.getBody();
		
		System.out.println(resp.getStatusCode());   //status code
		
		System.out.println(resp.getStatusLine());   //status line
		
		System.out.println(resp.getTime());        //time
		
			
	
	    System.out.println(resp.asString());
		System.out.println(resp.toString());       //message
		System.out.println(body.toString());
		
		
		//System.out.println(resp.prettyPrint());
		
	}

}
