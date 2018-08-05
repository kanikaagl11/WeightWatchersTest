package com.WeightWatchers.selenium;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
 * Test class to call page objects and assert results
 */
public class WebDriverTest {

	WeightWatchersHome homePageObj=new WeightWatchersHome();
	WeightWatchersMeetingPage meetingPage=new WeightWatchersMeetingPage();

	@Test
	public void WeightWatchers() {

		assertEquals("Weight Loss Program, Recipes & Help | Weight Watchers", homePageObj.getPageTitle());
		assertTrue( meetingPage.getMeetingPageTitle().contains("Get Schedules & Times Near You"));
		assertEquals(meetingPage.searchMeeting(),meetingPage.firstLocationName());

	}
}

