package com.greejoy.dlssjk.hessian.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.greejoy.dlssjk.hessian.service.TaskLogHessianService;
import com.greejoy.dlssjk.repository.TaskLogRepository;
import com.greejoy.support.mybatis.Criteria;
import com.greejoy.support.spring.hessian.annotation.Hessian;
@Hessian(path="/taskLog")
public class TaskLogHessianServiceImpl implements TaskLogHessianService {
	@Resource TaskLogRepository taskLogRespository;
	@Override
	public List<Map<String, Object>> getTaskLogs(Criteria criteria) {
		// TODO Auto-generated method stub
		return taskLogRespository.getTaskLogs(criteria.toFullSql());
	}

	@Override
	public Map<String, Object> getTaskLog(String id) {
		// TODO Auto-generated method stub
		return taskLogRespository.getTaskLog(id);
	}

}
