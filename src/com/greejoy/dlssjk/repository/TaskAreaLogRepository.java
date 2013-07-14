package com.greejoy.dlssjk.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TaskAreaLogRepository {

	public List<Map<String, Object>> getTaskAreaLogs(@Param("filter")String filter,@Param("columns")String columns);
	
	public Long getTaskAreaLogsCounts(@Param("filter")String filter);

	public Map<String, Object> getTaskAreaLog(@Param("id")String id);
	
	public  List<Map<String, Object>> getTaskAreaLogsDateByHour(@Param("filter")String filter);
	
	public  List<Map<String, Object>> getTaskAreaLogsDateByDay(@Param("filter")String filter);
	
	public  List<Map<String, Object>> getTaskAreaLogsDateByMonth(@Param("filter")String filter);
	

}
