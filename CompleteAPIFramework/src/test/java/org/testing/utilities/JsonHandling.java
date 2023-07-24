package org.testing.utilities;

//input parameters---string filepath
//purpose of this utility----to read json file
//output parameter----content of the json file in string format

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHandling 
{
	public static String readJsonFile(String filePath) throws FileNotFoundException 
	{
		File f= new File(filePath);
		FileReader fr=new FileReader(f);
		JSONTokener js= new JSONTokener(fr);
		JSONObject j= new JSONObject(js);
		return j.toString();
	}
}
