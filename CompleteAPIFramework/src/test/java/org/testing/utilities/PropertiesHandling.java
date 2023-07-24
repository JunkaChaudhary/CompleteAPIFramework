package org.testing.utilities;

//input parameters---filepath, don't hard code it. Take it as input parameter
//purpose of this utility---to load Properties file
//output parameter---object of the properties class

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandling 
{
	public static Properties readPropteries(String filePath) throws IOException
	{
		File f= new File(filePath);
		FileReader fr= new FileReader(f);
		Properties pr= new Properties();
		pr.load(fr);
		return pr;
	} 
}
