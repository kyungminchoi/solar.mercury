package com.virtualpairprogrammers.staffmanagement.services;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.virtualpairprogrammers.staffmanagement.domain.StaffRecord;

@Service
public class StaffService
{
	private Map<String, String> drivers = Stream.of(new String[][] {
		{"City Truck", "Pam Parry"},
	    {"Huddersfield Truck A", "Duke T. Dog"},
	    {"Huddersfield Truck B", "Denzil Tulser"},
	    {"London Riverside", "Herman Boyce"},
	    {"Village Truck", "June Snell"}}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
	
	//private static final String PLACEHOLDER="https://avatars0.githubusercontent.com/u/16841947?s=460&v=4";
	private static final String PLACEHOLDER="https://api-storage.cloud.toast.com/v1/AUTH_371144fc92db44ad910835313895529f/istio/images/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-09-29%20%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB%2011.20.27.png";
	//private static final String PLACEHOLDER="https://api-storage.cloud.toast.com/v1/AUTH_371144fc92db44ad910835313895529f/istio/images/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA%202021-09-30%20%E1%84%8B%E1%85%A9%E1%84%8C%E1%85%A5%E1%86%AB%2010.29.25.png";
	public StaffRecord getDriverDetailsFor(String vehicleName) 
	{
		//throw new RuntimeException("Low on resources");
		String driverName = drivers.get(vehicleName);
		String staffPhoto = PLACEHOLDER;
		return new StaffRecord(driverName, staffPhoto);
	}

}
