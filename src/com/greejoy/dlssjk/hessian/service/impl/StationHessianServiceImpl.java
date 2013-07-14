package com.greejoy.dlssjk.hessian.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.greejoy.dlssjk.hessian.service.StationHessianService;
import com.greejoy.dlssjk.repository.StationRepository;
import com.greejoy.support.mybatis.Criteria;
import com.greejoy.support.spring.hessian.annotation.Hessian;

/**
 * 工作站Hessian服务实现类
 * @author Gavin
 * @version 1.0
 * @date 2013-3-12
 */
@Hessian(path="/station")
public class StationHessianServiceImpl implements StationHessianService{
	
	@Resource
	private StationRepository stationRepository;

	@Override
	public List<Map<String, Object>> getStations(Criteria criteria) {
		return stationRepository.getStations(criteria.toFullSql());
	}

	@Override
	public Map<String, Object> getStation(Criteria criteria) {
		return stationRepository.getStation(criteria.toFullSql());
	}

}
