package com.greejoy.dlssjk.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 站点仓储类
 * @author Gavin
 * @version 1.0
 * @date 2013-2-26
 */
@Repository
public interface StationRepository {
	
	public List<Map<String,Object>> getStations(@Param("filter")String filter);
	
	public Map<String,Object> getStation(@Param("filter")String filter);
}
