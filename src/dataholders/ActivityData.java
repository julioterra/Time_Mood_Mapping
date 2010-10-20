package dataholders;

import java.util.ArrayList;
import java.util.Date;

import dataholders.DataStructure;
import processing.core.PApplet;
import processing.core.PImage;

public class ActivityData {
	long startTime;
	long endTime;	
	String actDescription;
	PImage actImage;
		
	public ActivityData(long startTime, long endTime, String actDescriptions, PImage _actImage) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.actDescription = actDescriptions;
		this.actImage = _actImage;
	}

	public boolean checkActive(long _actTime) {
		if (this.startTime <= _actTime && this.endTime >= _actTime) { return true; }
		return false;
	}
	
	public String getActivityDescription() {
		return actDescription;
	}

	public PImage getActivityImage() {
		return actImage;
	}

	public long[] getStartEndTimeEpoch() {
		long[] startEndTimeEpoch = {startTime, endTime};
		return startEndTimeEpoch;
	}
	
	public String[] getStartEndHoursMins() {
		String[] startEndTimeHoursMins = new String[2];
		Date date = new Date(startTime);								
		String dateString = date.toString();
		startEndTimeHoursMins[0] = dateString.substring(StaticData.hoursBegin, StaticData.secondsEnd);			
		date = new Date(endTime);
		dateString = date.toString();
		startEndTimeHoursMins[1] = dateString.substring(StaticData.hoursBegin, StaticData.secondsEnd);
		return startEndTimeHoursMins;
	}
	
}
