package org.testing.utilities;

import java.util.Random;

public class RandomData 
{
	public static String generateRandomData() 
	{
		Random r= new Random();
		Integer randomId= r.nextInt();
		return randomId.toString();
	}
}
