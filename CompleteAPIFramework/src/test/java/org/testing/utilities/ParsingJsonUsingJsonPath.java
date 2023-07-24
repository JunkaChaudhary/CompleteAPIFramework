package org.testing.utilities;

import io.restassured.response.Response;

public class ParsingJsonUsingJsonPath 
{
	public static String jsonparse(Response resObj, String jsonPath) 
	{
		String fetchValue= resObj.jsonPath().get(jsonPath);
		return fetchValue;
	}
}
