package com.WeightWatchers.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WeightWatchersHome {

	WebDriver driver= new FirefoxDriver();
/*
 * Method to fetch title of the current page	
 */
	public String getPageTitle() {
		
		driver.get("https://www.weightwatchers.com/us/");
		String currentTitle=driver.getTitle();
		return currentTitle;
	}
		
		
}
