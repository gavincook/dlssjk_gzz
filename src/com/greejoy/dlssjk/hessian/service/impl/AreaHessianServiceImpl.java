package com.greejoy.dlssjk.hessian.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.greejoy.dlssjk.hessian.service.AreaHessianService;
import com.greejoy.dlssjk.repository.AreaRepository;
import com.greejoy.support.mybatis.Criteria;
import com.greejoy.support.spring.hessian.annotation.Hessian;
@Hessian(path="/area")
public class AreaHessianServiceImpl implements AreaHessianService{
	@Resource
	private AreaRepository areaRepository;
	@Override
	public List<Map<String, Object>> getAreas(Criteria criteria) {
		return areaRepository.getAreas(criteria.toAppendSql());
	}
	@Override
	public List<Map<String, Object>> getAreasBriefInfo(Criteria criteria) {
		return areaRepository.getAreasBriefInfo(criteria.toAppendSql());
	}
	@Override
	public Map<String, Object> getArea(int areaId) {
		return areaRepository.getArea(areaId);
	}

}
