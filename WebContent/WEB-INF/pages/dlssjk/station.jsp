<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../common/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/dlssjk/all.css"/>
	<title>${station.name}</title>
	<style type="text/css">
	 
	</style>
</head>
<body>
	<div class="stationDetails">
		<img alt="logo" class="logo" src="${pageContext.request.contextPath}${station.logo}">
		<div class="content">
			<div class="title">${station.name }</div>
			<div><span>IP:</span>${station.ip }</div>
			<div><span>gps:</span>${station.gps }</div>
			<div><span>负责人:</span>${station.contact }</div>
			<div><span>联系电话:</span>${station.telephone }</div>
		</div>
		<div style="position: absolute;right: 5px;bottom: 10px"><a href="${pageContext.request.contextPath}/stations">工作站列表</a></div>
	</div>
</body>
</html>