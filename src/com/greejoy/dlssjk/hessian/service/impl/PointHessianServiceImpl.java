package com.greejoy.dlssjk.hessian.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.greejoy.dlssjk.hessian.service.PointHessianService;
import com.greejoy.dlssjk.repository.PointRepository;
import com.greejoy.support.mybatis.Criteria;
import com.greejoy.support.spring.hessian.annotation.Hessian;
@Hessian(path="/point")
public class PointHessianServiceImpl implements PointHessianService{
	@Resource
	private PointRepository pointRepository;
	@Override
	public List<Map<String, Object>> getPoints(Criteria criteria) {
		// TODO Auto-generated method stub
		return pointRepository.getPoints(criteria.toFullSql());
	}
	@Override
	public List<Map<String, Object>> getPointsBriefInfo(Criteria criteria) {
		// TODO Auto-generated method stub
		return pointRepository.getPointsBriefInfo(criteria.toFullSql());
	}
	@Override
	public Map<String, Object> getPoint(int pointId) {
		// TODO Auto-generated method stub
		return pointRepository.getPoint(pointId);
	}

}
