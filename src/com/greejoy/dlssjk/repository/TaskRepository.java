package com.greejoy.dlssjk.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TaskRepository {

	public List<Map<String, Object>> getTasks(@Param("filter")String filter);

	public List<Map<String, Object>> getaskRepository(@Param("filter")String filter);

	public Map<String, Object> getTask(@Param("taskId")int taskId);
	
}
