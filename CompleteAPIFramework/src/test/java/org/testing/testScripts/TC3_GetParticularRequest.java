package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.ParsingJsonUsingOrgJson;
import org.testing.utilities.PropertiesHandling;
import io.restassured.response.Response;

public class TC3_GetParticularRequest 
{
	public void testCase3() throws IOException 
	{
		Properties prObject= PropertiesHandling.readPropteries("../CompleteAPIFramework/Environment.properties");
		HTTPMethods http= new HTTPMethods(prObject);
		Response re= http.getParticularRequest("API_URI", TC1_PostRequest.returnIdValue);
	}

}
