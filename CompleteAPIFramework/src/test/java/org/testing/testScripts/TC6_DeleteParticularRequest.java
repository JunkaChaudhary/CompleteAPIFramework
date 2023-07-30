package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandling;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_DeleteParticularRequest 
{
	@Test
	public void testCase6() throws IOException
	{
		Properties prObject= PropertiesHandling.readPropteries("../CompleteAPIFramework/Environment.properties");
		HTTPMethods http= new HTTPMethods(prObject);
		Response re= http.deleteParticular("API_URI", TC1_PostRequest.returnIdValue);		
	}

}
