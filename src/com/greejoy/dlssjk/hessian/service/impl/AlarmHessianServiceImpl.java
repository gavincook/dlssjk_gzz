package com.greejoy.dlssjk.hessian.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.greejoy.dlssjk.hessian.service.AlarmHessianService;
import com.greejoy.dlssjk.repository.AlarmRepository;
import com.greejoy.support.mybatis.Criteria;
import com.greejoy.support.spring.hessian.annotation.Hessian;

/**
 * 
 * @author Gavin
 * @version 1.0
 * @date 2013-3-21
 */
@Hessian(path="/alarm")
public class AlarmHessianServiceImpl implements AlarmHessianService{

	@Resource
	private AlarmRepository alarmRepository;
	@Override
	public List<Map<String, Object>> getAlarmRecords(Criteria criteria) {
		return alarmRepository.getAlarmRecords(criteria.toFullSql());
	}

	@Override
	public Long getAlarmRecordsCounts(Criteria criteria) {
		return alarmRepository.getAlarmRecordsCounts(criteria.toFullSql());
	}

	@Override
	public byte[] getAlarmFile(String path) throws IOException {
		File file = new File(path);
		
		InputStream in = new  FileInputStream(file);
		byte[] data = new byte[in.available()];
		in.read(data);
		return data;
	}

	@Override
	public Map<String, Object> getAlarmRecord(int alarmId) {
		return alarmRepository.getAlarmRecord(alarmId);
	}

	@Override
	public byte[] getAlarmFile(int alarmId) throws IOException {
		return getAlarmFile(getAlarmRecord(alarmId).get("snapPath").toString());
	}

}
