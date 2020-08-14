package org.checkweather.test.ui;

import org.testng.annotations.Test;

import Base.tests.ui.BaseTest;
import or.checkweather.page.ui.weatherUI;

public class weatherUIStatus extends BaseTest{
	private static int hvalue,tvalue,humvalue,tempvalue;

	//Check weather status UI and fetch the value of humidity and temperature
	
	@Test(priority=0)
	public void checkStatus()
	{
	     weatherUI w= new weatherUI(driver);
	     w.getWeatherStatus();
	     
	     
	     String data=w.clickOnHumidity.getText();
	     String substr=data.substring(10,12);
	     hvalue=Integer.parseInt(substr);
	    
	       String data1= w.clickOnTemp.getText();
	       String substr1=data1.substring(17,19);
	       
	       tvalue=Integer.parseInt(substr1);
	       humvalue=hvalue;
	       tempvalue=tvalue;
	       
	      System.out.println("values from UI :" + hvalue  + " " +  tvalue);  
	      
	   
	}
	public static int getUIValue1()
	{
		return tempvalue;
	}
	public static int getUIValue2()
	{
		return humvalue;
	}
	
}
