package com.greejoy.dlssjk.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TaskPointLogRepository {

	List<Map<String, Object>> getTaskPointLogs(@Param("filter")String filter);

	Map<String, Object> getTaskPointLog(@Param("id")String id);

}
