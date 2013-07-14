package com.greejoy.dlssjk.hessian.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.greejoy.dlssjk.hessian.service.MonitorHessianService;
import com.greejoy.dlssjk.repository.MonitorRepository;
import com.greejoy.support.mybatis.Criteria;
import com.greejoy.support.spring.hessian.annotation.Hessian;
@Hessian(path="/monitor")
public class MonitorHessianServiceImpl implements MonitorHessianService{
	@Resource
	private MonitorRepository monitorRepository;
	@Override
	public List<Map<String, Object>> getMonitors(Criteria criteria) {
		// TODO Auto-generated method stub
		return monitorRepository.getMonitors(criteria.toFullSql());
	}
	@Override
	public List<Map<String, Object>> getMonitorsBriefInfo(Criteria criteria) {
		// TODO Auto-generated method stub
		return monitorRepository.getMonitorsBriefInfo(criteria.toFullSql());
	}
	@Override
	public Map<String, Object> getMonitor(int monitorId) {
		// TODO Auto-generated method stub
		return monitorRepository.getMonitor(monitorId);
	}

}
