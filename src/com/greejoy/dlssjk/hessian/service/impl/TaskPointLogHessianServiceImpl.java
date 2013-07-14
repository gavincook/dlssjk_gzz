package com.greejoy.dlssjk.hessian.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.greejoy.dlssjk.hessian.service.TaskPointLogHessianService;
import com.greejoy.dlssjk.repository.TaskPointLogRepository;
import com.greejoy.support.mybatis.Criteria;
import com.greejoy.support.spring.hessian.annotation.Hessian;
@Hessian(path="/taskPointLog")
public class TaskPointLogHessianServiceImpl implements
		TaskPointLogHessianService {
	@Resource TaskPointLogRepository taskPointLogRepository;
	@Override
	public List<Map<String, Object>> getTaskPointLogs(Criteria criteria) {
		// TODO Auto-generated method stub
		return taskPointLogRepository.getTaskPointLogs(criteria.toFullSql());
	}

	@Override
	public Map<String, Object> getTaskPointLog(String id) {
		// TODO Auto-generated method stub
		return taskPointLogRepository.getTaskPointLog(id);
	}

}
