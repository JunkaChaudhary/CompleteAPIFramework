package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;

public class TC5_PatchRequest 
{
	@Test
	public void testCase5() throws IOException
	{
		String requestBody= JsonHandling.readJsonFile("../CompleteAPIFramework/src/test/java/org/testing/resources/patchRequestData.json");
		Properties prObject= PropertiesHandling.readPropteries("../CompleteAPIFramework/Environment.properties");
		requestBody= JsonReplacement.replaceJson(requestBody, "id", TC1_PostRequest.returnIdValue);
		HTTPMethods http= new HTTPMethods(prObject);	
        http.patchRequest(requestBody, "API_URI", TC1_PostRequest.returnIdValue);				
	}

}
