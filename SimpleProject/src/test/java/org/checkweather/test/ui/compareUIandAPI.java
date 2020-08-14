package org.checkweather.test.ui;

import java.util.Scanner;

import org.testng.annotations.Test;

public class compareUIandAPI{
	
	//Fetch values from UI and API and compare the values along with variance and mark test case fail or pass based on comparison
	
	@Test(priority = 3)
	public void compareUIAndApi()
	{
		weatherAPITest a=new weatherAPITest();
		
		a.getWeatherAPISuccess();
		
		weatherUIStatus.getUIValue1();
		
		int hui=weatherUIStatus.getUIValue1();
		int tui=weatherUIStatus.getUIValue2();
	    int hapi=a.hdata;
	    int tapi=a.tdata;
	    
	    int hdiff=hui-hapi;
	    int tdiff=tapi-tui;
	   
	    
	    // Hard Coded the value for variance
	    int varh= 10; // humidity variance
	    int vart=2;   //temperature variance
	  
	    if(hdiff <= varh)
	    {
	    	System.out.println("test case passed");
	    	
	    }
	   else
	    {
	    	System.out.println("test case failed");
	    }
	   if(tdiff <= vart)
	    {
		 System.out.println("test case passed");
	    	
	    }
		else
	    {
	    	System.out.println("test case failed");
	    }
		
	}
}
