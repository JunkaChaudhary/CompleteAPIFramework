package org.testing.trigger;

import java.io.IOException;

import org.testing.testScripts.TC1_PostRequest;
import org.testing.testScripts.TC2_GetAllRequest;
import org.testing.testScripts.TC3_GetParticularRequest;
import org.testing.testScripts.TC4_PutRequest;
import org.testing.testScripts.TC5_PatchRequest;
import org.testing.testScripts.TC6_DeleteParticularRequest;

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
		
		TC4_PutRequest tc4= new TC4_PutRequest();
		tc4.testCase4();
		
		TC5_PatchRequest tc5= new TC5_PatchRequest();
		tc5.testCase5();
		
		TC6_DeleteParticularRequest tc6= new TC6_DeleteParticularRequest();
		tc6.testCase6();
	}	
}
