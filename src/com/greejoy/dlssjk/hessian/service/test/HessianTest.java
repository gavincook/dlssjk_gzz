package com.greejoy.dlssjk.hessian.service.test;

import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.greejoy.dlssjk.hessian.service.AreaHessianService;
import com.greejoy.dlssjk.hessian.service.MonitorHessianService;
import com.greejoy.dlssjk.hessian.service.PointHessianService;
import com.greejoy.dlssjk.hessian.service.StationHessianService;
import com.greejoy.dlssjk.hessian.service.TaskAreaLogHessianService;
import com.greejoy.dlssjk.hessian.service.TaskHessianService;
import com.greejoy.dlssjk.hessian.service.TaskLogHessianService;
import com.greejoy.dlssjk.hessian.service.TaskPointLogHessianService;
import com.greejoy.dlssjk.repository.TaskLogRepository;
import com.greejoy.support.mybatis.Criteria;
import com.greejoy.support.mybatis.Restrictions;

public class HessianTest {

	public static void main(String[] args) throws MalformedURLException{
		HessianProxyFactory proxyFactory = new HessianProxyFactory();  
		  
        StationHessianService service = (StationHessianService)proxyFactory.create(StationHessianService.class,  
        		"http://localhost:8080/dlssjk_gzz/remote/station");  
        AreaHessianService sAreaHessianService = (AreaHessianService)proxyFactory.create(AreaHessianService.class,
        		"http://localhost:8080/dlssjk_gzz/remote/area");
        MonitorHessianService monitorHessianService=(MonitorHessianService)proxyFactory.create(MonitorHessianService.class, 
        		"http://localhost:8080/dlssjk_gzz/remote/monitor");
        PointHessianService pointHessianService = (PointHessianService)proxyFactory.create(PointHessianService.class,
        		"http://localhost:8080/dlssjk_gzz/remote/point");
        TaskHessianService taskHessianService = (TaskHessianService)proxyFactory.create(TaskHessianService.class,
        		"http://localhost:8080/dlssjk_gzz/remote/task");
        TaskAreaLogHessianService taskAreaLogHessianService = (TaskAreaLogHessianService)proxyFactory.create(TaskAreaLogHessianService.class,
        		"http://localhost:8080/dlssjk_gzz/remote/taskAreaLog");
        TaskLogHessianService taskLogHessianService = (TaskLogHessianService)proxyFactory.create(TaskLogHessianService.class,
        		"http://localhost:8080/dlssjk_gzz/remote/taskLog");
        TaskPointLogHessianService taskPointLogHessianService=(TaskPointLogHessianService)proxyFactory.create(TaskPointLogHessianService.class,
        		"http://localhost:8080/dlssjk_gzz/remote/taskPointLog");
        Criteria cri = new Criteria();
     /*   cri.add(Restrictions.limit("0", "1"));
        cri.add(Restrictions.order("station_name", "desc"));*/
        cri.add(Restrictions.eq("area_id",218));
/*       System.out.println(service.getStation(cri).get("station_name"));  
*/       System.out.println(sAreaHessianService.getAreas(cri).get(0)); 
		System.out.println(sAreaHessianService.getAreasBriefInfo(cri).get(0)); 
		System.out.println(sAreaHessianService.getArea(218)); 
        Criteria criteria = new Criteria();
        criteria.add(Restrictions.eq("monitor_id", "928"));
        System.out.println(monitorHessianService.getMonitors(criteria).get(0));
        System.out.println(monitorHessianService.getMonitorsBriefInfo(criteria).get(0));
        System.out.println(monitorHessianService.getMonitor(928));

        Criteria criteria1 = new Criteria();
        criteria.add(Restrictions.eq("point_id", "90"));
       System.out.println(pointHessianService.getPoints(criteria1).get(0));
       System.out.println(pointHessianService.getPointsBriefInfo(criteria1).get(0));
       System.out.println(pointHessianService.getPoint(90));
       Criteria criteria2 = new Criteria();
       criteria.add(Restrictions.eq("task_id", "10"));
       System.out.println(taskHessianService.getTasks(criteria2).get(0));
       System.out.println(taskHessianService.getTasksBriefInfo(criteria2).get(0));;
       System.out.println(taskHessianService.getTask(10));
       Criteria criteria3 = new Criteria();
       criteria.add(Restrictions.eq("task_id", "1423"));
       System.out.println(taskAreaLogHessianService.getTaskAreaLogs(criteria3).get(0).get("time"));
       System.out.println(taskAreaLogHessianService.getTaskAreaLog("1423").get("time"));
       Criteria criteria4 = new Criteria();
       criteria.add(Restrictions.eq("tasklog_id", "141"));
       System.out.println(taskLogHessianService.getTaskLogs(criteria4).get(0));
       System.out.println(taskLogHessianService.getTaskLog("141"));
       Criteria criteria5 = new Criteria();
       criteria.add(Restrictions.eq("id", "1280"));
       System.out.println(taskPointLogHessianService.getTaskPointLogs(criteria5).get(0));
     System.out.println(taskPointLogHessianService.getTaskPointLog("1280"));
	}
	
}
