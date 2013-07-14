package com.greejoy.dlssjk.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmRepository {

	public List<Map<String, Object>> getAlarmRecords(@Param("filter")String filters);
	
	public Long getAlarmRecordsCounts(@Param("filter")String filter);
	
	public Map<String,Object> getAlarmRecord(@Param("alarmId")int alarmId);
}
