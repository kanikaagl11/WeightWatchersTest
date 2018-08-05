package com.WeightWatchers.selenium;

import java.util.List;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WeightWatchersMeetingPage {

	WebDriver driver = new FirefoxDriver();
	/*
	 * Method to return current page title
	 */
	public String getMeetingPageTitle() {
		driver.findElement(By.className("find-a-meeting")).click();
		String meetingPageTitle=driver.getTitle();
		return meetingPageTitle;
	}

	/*
	 * Method to search for meeting and clicking on the first result
	 */
	public WebElement searchMeeting() {

		WebElement element=driver.findElement(By.id("meetingSearch"));
		element.sendKeys("10011");
		driver.findElement(By.className("btn.btn")).click();

		List<WebElement> locationList=driver.findElements(By.className("location__name"));
		System.out.println(locationList.get(0));

		List<WebElement> locationDistance=driver.findElements(By.className("location__distance"));
		System.out.println(locationDistance.get(0));

		locationList.get(0).click();
		return locationList.get(0);

	}

	/*
	 * Method to locate element present on the page after clicking in the previous method
	 */
	public WebElement firstLocationName() 
	{

		WebElement locationName=driver.findElement(By.className("location__name"));
		return locationName;

	}
	/*
	 * Method to print today's hours of operation
	 */
	public void HoursOfOperation() 
	{

		List<WebElement> operationHours=driver.findElements((By.className("schedule-detailed-day-meetings-item-time")));
		for(WebElement operationHour:operationHours)
		{
			System.out.println(operationHour);
		}
	}
}
