package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

//input parameter----complete response data in string form, parse keyname

public class ParsingJsonUsingOrgJson 
{
	public static void jsonParse(String responseData, String fetchVariable) 
	{
		JSONArray array= new JSONArray(responseData);
		int L=array.length();
		for(int i=0; i<L; i++)
		{
			JSONObject ob= array.getJSONObject(i);
			System.out.println(ob.get(fetchVariable));
		}
		
	}

}
