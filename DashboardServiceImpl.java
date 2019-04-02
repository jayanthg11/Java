package com.airline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.storedproc.model.GetFlightSummary;
import com.airline.storedproc.model.GetPassengerSummaryStats;
import com.airline.storedproc.model.GetStationStatistics;
import com.airline.storedproc.model.GetTaxiStatusMetric;

@Service
public class DashboardServiceImpl implements DashboardService {
	@Autowired
	DashboardService dao;
	
	/* (non-Javadoc)
	 * @see com.airline.service.DashboardService#getTaxiStatus(java.lang.String, java.lang.String)
	 */
	@Override
	public List<GetTaxiStatusMetric> getTaxiStatus(String Location, String Carrier){
		return dao.getTaxiStatus(Location, Carrier);
	}
  
	 /* (non-Javadoc)
	 * @see com.airline.service.DashboardService#getPassenger(java.lang.String, java.lang.String)
	 */
	@Override
	public List<GetPassengerSummaryStats> getPassenger(String location, String carrier) {
		return dao.getPassenger(location, carrier);
		 
	 }
	 
	 /* (non-Javadoc)
	 * @see com.airline.service.DashboardService#getStaionStats(java.lang.String, java.lang.String)
	 */
	@Override
	public List<GetStationStatistics> getStaionStats(String location, String carrier){
		return dao.getStaionStats(location, carrier);
		 
	 }
	 
	 /* (non-Javadoc)
	 * @see com.airline.service.DashboardService#getFlightSummary(java.lang.String, java.lang.String)
	 */
	@Override
	public List<GetFlightSummary> getFlightSummary(String location, String carrier){
		 return dao.getFlightSummary(location, carrier);
	 }
}
