package org.testing.testSteps;

//for fetching the uri value from properties file, we need uriKeyName and object of Properties class


import java.security.PublicKey;
import java.util.Properties;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	public Response postRequest(String requestBody, String uriKeyName) 
	{
		String uriValue= pr.getProperty(uriKeyName);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(uriValue);
		System.out.println("TC1 Status code is: " +res.statusCode());
		System.out.println("TC1 Response data is: " +res.asString());
		return res;
	}
	
	public Response getAllRequest(String uriKeyName) 
	{
		String uriValue= pr.getProperty(uriKeyName);
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println("TC2 Status code is: " +res.statusCode());
//		System.out.println("TC2 Response data is: " +res.asString());
		return res;
	}
	
	public Response getParticularRequest(String uriKeyName, String endPoint) 
	{
		String uriValue= pr.getProperty(uriKeyName)+"/"+endPoint;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uriValue);
		System.out.println("TC3 Status code is: " +res.statusCode());
		System.out.println("TC3 Response data is: " +res.asString());
		return res;
	}
}
