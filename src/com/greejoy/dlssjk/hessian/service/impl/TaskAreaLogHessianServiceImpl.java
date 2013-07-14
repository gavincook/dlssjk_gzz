package com.greejoy.dlssjk.hessian.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.greejoy.dlssjk.hessian.service.TaskAreaLogHessianService;
import com.greejoy.dlssjk.repository.TaskAreaLogRepository;
import com.greejoy.support.mybatis.Criteria;
import com.greejoy.support.spring.hessian.annotation.Hessian;
@Hessian(path="/taskAreaLog")
public class TaskAreaLogHessianServiceImpl  implements TaskAreaLogHessianService{
	@Resource TaskAreaLogRepository taskAreaLogRespository;
	private Map<String,String> m = new HashMap<String,String>();
	
	public TaskAreaLogHessianServiceImpl(){
		m.put("area_id", "areatable.area_id");
		m.put("time", "taskarealog_time");
	}
	@Override
	public List<Map<String, Object>> getTaskAreaLogs(Criteria criteria) {
		criteria.replaceKey(m);
		return taskAreaLogRespository.getTaskAreaLogs(criteria.toFullSql(),criteria.toAppendColumns());
	}

	@Override
	public Map<String, Object> getTaskAreaLog(String id) {
		return taskAreaLogRespository.getTaskAreaLog(id);
	}
	
	@Override
	public List<Map<String, Object>> getTaskAreaLogsDateByHour(Criteria criteria) {
		return taskAreaLogRespository.getTaskAreaLogsDateByHour(criteria.toFullSql());
	}
	
	@Override
	public List<Map<String, Object>> getTaskAreaLogsDateByDay(Criteria criteria) {
		return taskAreaLogRespository.getTaskAreaLogsDateByDay(criteria.toFullSql());
	}
	
	@Override
	public List<Map<String, Object>> getTaskAreaLogsDateByMonth(Criteria criteria) {
		return taskAreaLogRespository.getTaskAreaLogsDateByMonth(criteria.toFullSql());
	}
	@Override
	public Long getTaskAreaLogsCounts(Criteria criteria) {
		 
		return taskAreaLogRespository.getTaskAreaLogsCounts(criteria.toFullSql());
	}

}
