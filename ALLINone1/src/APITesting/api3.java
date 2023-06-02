package APITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class api3 {
	
	@Test
	public void apii() {
		
		//first we need to provise uRL
		RestAssured.baseURI=("http://www.chartink.com/");
		
		RequestSpecification rqst=RestAssured.given();
		
		//JSONObject req=new JSONObject();
		
		//req.put("userid","rtqwe");
		//req.put("userid2","retttqwe");
		
		Response resp=rqst.post();
		
	  System.out.println(resp.getStatusCode());
	  
	  System.out.println(resp.getStatusLine());
	  
	  System.out.println(resp.toString());
	  
	  ResponseBody body=resp.getBody();
	  
	 System.out.println(resp.prettyPrint());
		
	}

}
