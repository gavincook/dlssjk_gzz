package com.greejoy.dlssjk.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TaskLogRepository {

	List<Map<String, Object>> getTaskLogs(@Param("filter")String filter);

	Map<String, Object> getTaskLog(@Param("id")String id);

}
