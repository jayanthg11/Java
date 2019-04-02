package com.airline.service;

import java.util.List;

import com.airline.storedproc.model.GetFlightSummary;
import com.airline.storedproc.model.GetPassengerSummaryStats;
import com.airline.storedproc.model.GetStationStatistics;
import com.airline.storedproc.model.GetTaxiStatusMetric;

public interface DashboardService {

	List<GetTaxiStatusMetric> getTaxiStatus(String Location, String Carrier);

	List<GetPassengerSummaryStats> getPassenger(String location, String carrier);

	List<GetStationStatistics> getStaionStats(String location, String carrier);

	List<GetFlightSummary> getFlightSummary(String location, String carrier);

}