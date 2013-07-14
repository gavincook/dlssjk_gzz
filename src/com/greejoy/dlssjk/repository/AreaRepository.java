package com.greejoy.dlssjk.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AreaRepository {
	/**
	 * 得到区域
	 * @param string
	 * @return
	 */
	public List<Map<String, Object>> getAreas(@Param("filter")String filter);

	public List<Map<String, Object>> getAreasBriefInfo(@Param("filter")String filter);

	public Map<String, Object> getArea(@Param("areaId") int areaId);

}
