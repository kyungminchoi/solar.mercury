package com.virtualpairprogrammers.simulator.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class PositionTrackerExternalService 
{
	@Autowired
	private RemotePositionMicroserviceCalls remoteService;
	
	private Logger log = LoggerFactory.getLogger(PositionTrackerExternalService.class);
	
	public void sendReportToPositionTracker(VehiclePosition report)
	{
		log.info("!! app log in loki here !!");
		remoteService.sendNewPositionReport(report);
	}

	public void clearHistories() 
	{
		try
		{
			log.info("!! app log in loki here !!");
			remoteService.clearHistories();
		}
		catch (Exception e)
		{
			log.warn("Failed to clear history for vehciles.");
		}
	}
}

