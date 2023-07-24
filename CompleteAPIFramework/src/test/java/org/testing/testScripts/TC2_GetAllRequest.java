package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.ParsingJsonUsingOrgJson;
import org.testing.utilities.PropertiesHandling;
import io.restassured.response.Response;

public class TC2_GetAllRequest 
{
	public void testCase2() throws IOException 
	{
		Properties prObject= PropertiesHandling.readPropteries("../CompleteAPIFramework/Environment.properties");
		HTTPMethods http= new HTTPMethods(prObject);
		Response re= http.getAllRequest("API_URI");
		System.out.println("TC2 Response data is: ");
		ParsingJsonUsingOrgJson.jsonParse(re.asString(), "id");
	}
}
