package org.testing.utilities;

import java.util.regex.Pattern;

//input parameter---Complete json, Variable name & variable value
//purpose of this method---to assign value to the variable in json data
//output parameter---after replacement, it will give the updated json data

public class JsonReplacement 
{
	public static String replaceJson(String jsonData, String variableName, String variableValue) 
	{
		jsonData= jsonData.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return jsonData;		
	}
}
