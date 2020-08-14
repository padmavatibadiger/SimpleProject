package org.checkweather.test.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class weatherAPITest {

	int hdata,tdata;
	
	//check the weather status from API and fetch the values of humidity and temperature
	
	@Test(priority=2)
	public void getWeatherAPISuccess()
	{
		RequestSpecification resp= RestAssured.given();
        Response response = resp.request(Method.GET, "https://api.openweathermap.org/data/2.5/weather?q=Bangalore,200&appid=7fe67bf08c80ded756e598d6f8fedaea&units=metric");

        String responseBody = response.getBody().asString();
          hdata=response.getBody().jsonPath().get("main.humidity");
          float ftdata=response.getBody().jsonPath().get("main.temp");
          tdata=(int)ftdata;
          //System.out.println(tdata);
          
          int statusCode=response.getStatusCode();
        
        //System.out.println(statusCode);
        Assert.assertEquals(statusCode,200);
        
        System.out.println("values from API : " + hdata + " " + tdata);
	}
	
}
