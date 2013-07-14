package com.greejoy.dlssjk.hessian.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.greejoy.dlssjk.hessian.service.TaskHessianService;
import com.greejoy.dlssjk.repository.TaskRepository;
import com.greejoy.support.mybatis.Criteria;
import com.greejoy.support.spring.hessian.annotation.Hessian;
@Hessian(path="/task")
public class TaskHessianServiceImpl implements TaskHessianService{
	@Resource
	private TaskRepository taskRepository;
	@Override
	public List<Map<String, Object>> getTasks(Criteria criteria) {
		// TODO Auto-generated method stub
		return taskRepository.getTasks(criteria.toFullSql());
	}
	@Override
	public List<Map<String, Object>> getTasksBriefInfo(Criteria criteria) {
		// TODO Auto-generated method stub
		return taskRepository.getaskRepository(criteria.toFullSql());
	}
	@Override
	public Map<String, Object> getTask(int taskId) {
		// TODO Auto-generated method stub
		return taskRepository.getTask(taskId);
	}

}
