package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandling;
import org.testing.utilities.RandomData;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest 
{
	@Test
	public void testCase4() throws IOException
	{
		String requestBody= JsonHandling.readJsonFile("../CompleteAPIFramework/src/test/java/org/testing/resources/updateData.json");
		Properties prObject= PropertiesHandling.readPropteries("../CompleteAPIFramework/Environment.properties");
		requestBody= JsonReplacement.replaceJson(requestBody, "id", TC1_PostRequest.returnIdValue);
		HTTPMethods http= new HTTPMethods(prObject);	
        http.putRequest(requestBody, "API_URI", TC1_PostRequest.returnIdValue);		
	}


}
