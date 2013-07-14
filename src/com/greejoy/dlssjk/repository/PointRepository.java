package com.greejoy.dlssjk.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface PointRepository {

	public List<Map<String, Object>> getPoints(@Param("filter")String filter);

	public List<Map<String, Object>> getPointsBriefInfo(@Param("filter")String filter);

	public Map<String, Object> getPoint(@Param("pointId")int pointId);

}
