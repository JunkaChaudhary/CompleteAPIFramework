package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.JsonReplacement;
import org.testing.utilities.ParsingJsonUsingJsonPath;
import org.testing.utilities.PropertiesHandling;
import org.testing.utilities.RandomData;

import io.restassured.response.Response;

public class TC1_PostRequest 
{
	static String returnIdValue;
	public void testCase1() throws IOException 
	{
		String requestBody= JsonHandling.readJsonFile("../CompleteAPIFramework/src/test/java/org/testing/resources/inputData.json");
		Properties prObject= PropertiesHandling.readPropteries("../CompleteAPIFramework/Environment.properties");
		String idValue=RandomData.generateRandomData();
		requestBody= JsonReplacement.replaceJson(requestBody, "id", idValue );
		HTTPMethods http= new HTTPMethods(prObject);	
		Response res= http.postRequest(requestBody, "API_URI");
		returnIdValue= ParsingJsonUsingJsonPath.jsonparse(res, "id");
		System.out.println("Id from TC1 Response data is: "+returnIdValue);
	}
}
	