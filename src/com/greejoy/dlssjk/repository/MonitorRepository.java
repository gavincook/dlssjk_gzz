package com.greejoy.dlssjk.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MonitorRepository {

	public List<Map<String, Object>> getMonitors(@Param("filter")String filter);

	public List<Map<String, Object>> getMonitorsBriefInfo(@Param("filter")String filter);

	public Map<String, Object> getMonitor(@Param("monitorId")int monitorId);

}
