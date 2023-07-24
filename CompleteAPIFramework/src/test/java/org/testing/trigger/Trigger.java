package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_GetAllRequest;
import org.testing.testScripts.TC3_GetParticularRequest;

public class Trigger 
{
	public static void main(String[] args) throws IOException 
	{
		TC1_PostRequest tc1= new TC1_PostRequest();
		tc1.testCase1();

		TC2_GetAllRequest tc2= new TC2_GetAllRequest();
		tc2.testCase2();
		
		TC3_GetParticularRequest tc3= new TC3_GetParticularRequest();
		tc3.testCase3();
	}	
}
